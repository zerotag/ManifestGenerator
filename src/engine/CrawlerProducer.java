package engine;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class CrawlerProducer implements Runnable {
	
	private final SharedMemory memory;
	private final BlockingQueue<String> queue;
	private final String path;
	private Integer total = 0;
	
	public CrawlerProducer(SharedMemory memory, String path) {
		this.memory = memory;
		this.queue = memory.getMemory();
		this.path = path;
		this.memory.lockUI();
	}
	
	private void processPath() {
		try {
			queue.put(path);
			this.processPath(path, 1);
			queue.put(SharedMemory.getGUID());
		} catch (InterruptedException ex) {
			System.err.println(ex);
		}
	}
	
	private void processPath(String path, Integer tabSize) throws InterruptedException {
		File root = new File(path);
		if(root.exists() && root.canRead() && root.canExecute()) {
			File[] children = root.listFiles();
			if(null != children) {
				for(File child : children) {
					if(null != child && child.canRead() && child.canExecute()) {
						String repeated = new String(new char[tabSize]).replace("\0", "\t");
						String childPath = child.getAbsolutePath();
						queue.put(repeated + childPath);
						if(child.isDirectory()) {
							processPath(childPath, tabSize + 1);
						}
					}
				}
			}
		}
	}
	
	private void getTotal(String path) {
		if (this.total < Integer.MAX_VALUE) {
			File root = new File(path);
			if(root.exists() && root.canRead() && root.canExecute()) {
				File[] children = root.listFiles();
				if(null != children) {
					for(File child : children) {
						if(null != child && child.canRead() && child.canExecute()) {
							String childPath = child.getAbsolutePath();
							this.total++;
							this.memory.addToCounter(this.total);
							if(child.isDirectory()) {
								getTotal(childPath);
							}
						}
					}
				}
			}
		}
	}
	
	@Override
	public void run() {
		this.memory.updateButton("COUNTING FILES");
		this.getTotal(path);
		this.memory.setTotal(this.total);
		this.memory.addToLogger("\"" + path + "\" has " + this.total.toString() + " files.");
		this.memory.updateButton("WRITING TO FILE");
		this.processPath();
	}
}
