package engine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Generator {
	private static final String filename = ".manifest";
	private final String source;
	private final String target;
	
	public Generator(String source, String target) {
		this.source = source;
		this.target = target;
	}
	
	public int countPath() {
		return countPathSize(new File(source));
	}
	
	private int countPathSize( File path ) {
		int count = 0;
		File[] files = path.listFiles();
		Arrays.sort(files);
		for (File file : files) {
			if (file.isDirectory()) {
				count = count + countPathSize(file);
			} else {
				count++;
			}
		}
		return count;
	}

	public void writeToFile(String data) throws Exception {
		BufferedWriter handler = new BufferedWriter( new FileWriter( new File( target + Generator.filename ) ) );
		handler.write( data );
		handler.close();
	}

	public static String getFilename() {
		return filename;
	}
}
