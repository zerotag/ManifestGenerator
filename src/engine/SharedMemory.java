package engine;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import view.Start;

public class SharedMemory {

	private static final String GUID = "{2653FD80-E7CB-4851-8D55-18585AE21EFC}";
	private Integer BUFFER_SIZE = 1000;
	private BlockingQueue<String> MEMORY;

	public SharedMemory() {}

	public void setBuffer(Integer buffer) {
		this.BUFFER_SIZE = buffer;
	}
	
	public BlockingQueue<String> getMemory() {
		if (null == this.MEMORY) {
			this.MEMORY = new ArrayBlockingQueue<>(BUFFER_SIZE);
		}
		return this.MEMORY;
	}
	
	/* CONTROLLER */
	public void setTotal(Integer total) {
		Start.mainUI
			.getProgressBar()
			.setMaximum(total);
	}
	
	public void addToCurrent() {
		Start.mainUI
			.getProgressBar()
			.setValue(Start.mainUI
						.getProgressBar()
						.getValue() + 1
			);
	}
	
	public void addToCounter(Integer counter) {
		Start.mainUI
			.getFileCounter()
			.setText(counter.toString());
	}
	
	public void updateButton(String text) {
		Start.mainUI
			.getGenerateBTN()
			.setText(text);
	}
	
	public void addToLogger(String text) {
		javax.swing.JTextPane logger = Start.mainUI.getLogger();
		logger.setText(logger.getText() + "\n" + text);
	}
	
	public void lockUI(){
		Start.mainUI.lockUI();
	}
	
	public void finish() {
		Start.mainUI.unlockUI();
	}
	/* END CONTROLLER */

	public static String getGUID() {
		return GUID;
	}
}
