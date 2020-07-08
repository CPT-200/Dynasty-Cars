package dynastyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DynastyIO {
	public static StringBuffer importCarData() throws IOException {
		
		StringBuffer data = null;
		
		try {
			//Open input file
			FileInputStream inputFile = new FileInputStream("simplifiedDatabase.csv");
			// Create scanner to read in values from file
			Scanner inputScanner = new Scanner(inputFile);
			
			while (inputScanner.hasNext()) {
				data.append(inputScanner.nextLine());
			}
			
			inputScanner.close();
			inputFile.close();
		}
		catch (Exception e) {
			
		}
		
		return data;
	}
	
	public static void exportCarData() throws IOException {
		try {
			// Open output file
			FileOutputStream outputFile = new FileOutputStream("output.txt");
			// Create PrintWriter to send output to file
			PrintWriter printOutput = new PrintWriter(outputFile);
			
			printOutput.close();
			outputFile.close();
		}
		catch (Exception e) {
			
		}
	}
}
