package engine;

import view.MainUI;
import view.Start;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class GeneratorWorker extends SwingWorker<String, Double> {
	private Generator gen;
	private String data;
	private int indentLevel = -1;
	private int fileCount = 0;
	private int fileSize;
	
	private final MainUI		PARENT;
	private final JLabel		OUTPUT_LABEL;
	private final JButton		OUTPUT_BUTTON;
	private final JProgressBar	PROGRESS_BAR;
	
	private final String source;
	private final String target;

	public GeneratorWorker( MainUI parent, JLabel OUTPUT_LABEL, JProgressBar PROGRESS_BAR, String source, String target) {
		this.PARENT = parent;
		this.OUTPUT_LABEL = OUTPUT_LABEL;
		this.OUTPUT_BUTTON = null;
		this.PROGRESS_BAR = PROGRESS_BAR;
		this.source = source;
		this.target = target;
	}
	
	public GeneratorWorker( MainUI parent, JButton OUTPUT_BUTTON, JProgressBar PROGRESS_BAR, String source, String target){
		this.PARENT = parent;
		this.OUTPUT_LABEL = null;
		this.OUTPUT_BUTTON = OUTPUT_BUTTON;
		this.PROGRESS_BAR = PROGRESS_BAR;
		this.source = source;
		this.target = target;
	}
	
	@Override
	protected String doInBackground() throws Exception {
		PARENT.lockUI();
		
		changeUI("COUNTING FILES");
		Thread.sleep(1000);
		
		gen = new Generator(source, target);
		Generator generator = gen;
		
		int maxNumber = generator.countPath();
		MainUI.getMonitor().addMessage(Start.getTime(), "[GENERATOR] Source folder contains <" + maxNumber + "> files");
		
		Thread.sleep(1000);
		changeUI("GENERATING MANIFEST");
		engage(maxNumber, source);
		
		Thread.sleep(1000);
		changeUI("WRITING TO FILE");
		gen.writeToFile(data);
		MainUI.getMonitor().addMessage(Start.getTime(), "[GENERATOR] Written to file <" + target + Generator.getFilename() + ">");
		
		Thread.sleep(1000);
		changeUI("DONE");
		
		Thread.sleep(1000);
		return "DONE!";
	}

	@Override
	protected void process( List<Double> aDoubles ) {
		int amount = PROGRESS_BAR.getMaximum() - PROGRESS_BAR.getMinimum();
		PROGRESS_BAR.setValue( ( int ) (PROGRESS_BAR.getMinimum() + ( amount * aDoubles.get( aDoubles.size() - 1 ))) );
	}

	@Override
	protected void done() {
		PARENT.unlockUI();
		try {
			this.finalize();
		} catch (Throwable ex) {
			MainUI.getMonitor().addMessage(Start.getTime(), "[FATAL-ERROR] Thread FINALIZE method FAILED! at <" + this.getClass().getSimpleName() + ">");
		}
	}
	
	private void changeUI( String msg ) {
		if (OUTPUT_LABEL != null) {
			OUTPUT_LABEL.setText(msg);
		}
		if (OUTPUT_BUTTON != null) {
			OUTPUT_BUTTON.setText(msg);
		}
	}
	
	private void engage(int size, String path) throws Exception {
		PROGRESS_BAR.setMaximum(size);
		fileSize = size;
		data = generateString(new File(path));
		publish(100.0);
	}
	
	private String generateString( File path ) throws Exception {
		double factor = ((double)(fileCount+1) / fileSize);
		publish(factor);
		
		String result = "";

		File files[];
		indentLevel++;
		files = path.listFiles();
		Arrays.sort(files);

		for ( int i = 0, n = files.length; i < n; i++ ) {
			for ( int indent = 0; indent < indentLevel; indent++ ) {
				result += "\t";
			}
			fileCount++;
			
			switch ( files[i].toString() ) {
				case "C:\\A Galeria\\TG Viewer":
				case "C:\\Windows":
					result += files[i].toString() + " was < REDACTED >" + "\n";
				break;
				
				default:
					result += files[i].toString() + "\n";
					if ( files[i].isDirectory() ) {
						Thread.sleep(50);
						result += generateString( files[i] );
					}
				break;
			}
		}
		indentLevel--;
		
		return result;
	}
}
