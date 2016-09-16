package view;

import engine.MonitorWorker;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Start {
	
	private static Calendar					CAL = Calendar.getInstance();
	private static final SimpleDateFormat	SDF = new SimpleDateFormat("HH:mm:ss");
	
	public static void main(String[] args) throws InterruptedException, InvocationTargetException {
		boolean debug = false;
		for (String arg : args) {
			if (arg.equals("-debug")) {
				debug = true;
			}
		}
		
		if (debug) {
			MonitorWorker monitor = new MonitorWorker();
			monitor.execute();
			MainUI.addMonitor(monitor);
		}
		
		MainUI mainUI = MainUI.run(debug);
		mainUI.setVisible(true);
	}
	
	public static String getTime(){
		CAL = Calendar.getInstance();
		String time = SDF.format(CAL.getTime());
		return time;
	}
}
