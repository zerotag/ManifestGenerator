package engine;

import java.util.ArrayList;
import javax.swing.SwingWorker;

public class MonitorWorker extends SwingWorker {
	
	private static final ArrayList<MonitorMessage> MSG_STACK = new ArrayList<>();
	
	@Override
	protected Object doInBackground() throws Exception {
		while (true) {
			Thread.sleep(500);
			printMessageStack();
		}
	}
	
	public void addMessage(String time, String msg) {
		if (msg != null) {
			if (!msg.isEmpty()) {
				MSG_STACK.add(new MonitorMessage(time, msg));
			}
		}
	}
	
	public void printPadding() {
		String padding = "";
		for (int i = 0; i < 50; i++) {
			padding += "-";
		}
		System.out.println(padding);
	}
	
	public void printDefaultStack() {
		System.out.println( "[MONITOR] Active Threads: <" + Thread.activeCount() + ">");
	}
	
	public void printMessageStack() {
		if (!MSG_STACK.isEmpty()) {
			//printPadding();
			//printDefaultStack();
			MSG_STACK.stream().forEach((monMsg) -> {
				System.out.println("[" + monMsg.getTime() + "][MONITOR]" + monMsg.getMsg());
			});
			MSG_STACK.clear();
		}
	}
}
