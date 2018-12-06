package engine;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.BlockingQueue;

public class UnloaderConsumer implements Runnable {
	
	private final SharedMemory memory;
	private final BlockingQueue<String> queue;
	private final String path;

	public UnloaderConsumer(SharedMemory memory, String path) {
		this.memory = memory;
		this.queue = memory.getMemory();
		this.path = path;
	}
	
	private void processQueue() {
		OutputStream byteWriter = null;
		OutputStreamWriter charWriter = null;
		BufferedWriter wordWriter = null;

		try {
			byteWriter = new FileOutputStream(this.path, false);
			charWriter = new OutputStreamWriter(byteWriter);
			wordWriter = new BufferedWriter(charWriter);
			
			String linha;
			
			while(!((linha = queue.take()).equals(SharedMemory.getGUID()))) {
				wordWriter.write(linha);
				wordWriter.newLine();
				this.memory.addToCurrent();
			}
			
			wordWriter.flush();
			this.memory.finish();
		} catch (IOException | InterruptedException e) {
			System.err.println(e);
		} finally {
			try {
				if(wordWriter != null) { wordWriter.close(); }
				if(charWriter != null) { charWriter.close(); }
				if(byteWriter != null) { byteWriter.close(); }
			} catch(IOException e){}
		}
	}

	@Override
	public void run() {
		this.processQueue();
	}
}
