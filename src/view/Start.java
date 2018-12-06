package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Start {
	
	public static MainUI mainUI;
	public static Boolean DEBUG = false;
    private static Calendar CAL = Calendar.getInstance();
    private static final SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        for (String arg : args) {
            if (arg.equals("-debug")) {
                DEBUG = true;
            }
        }

        Start.mainUI = MainUI.run(DEBUG);
        Start.mainUI.setVisible(true);
    }

    public static String getTime(){
        CAL = Calendar.getInstance();
        String time = SDF.format(CAL.getTime());
        return time;
    }
}
