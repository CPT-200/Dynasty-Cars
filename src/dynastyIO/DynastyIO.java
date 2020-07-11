package dynastyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import vehicletypes.*;

public class DynastyIO {
	
	private static ArrayList<Coupe> coupeList = new ArrayList<Coupe>();
	private static ArrayList<Sedan> sedanList = new ArrayList<Sedan>();
	private static ArrayList<Convertible> convertibleList = new ArrayList<Convertible>();
	private static ArrayList<Hatchback> hatchbackList = new ArrayList<Hatchback>();
	private static ArrayList<Truck> truckList = new ArrayList<Truck>();
	private static ArrayList<Wagon> wagonList = new ArrayList<Wagon>();
	
	@SuppressWarnings("unused")
	private static ArrayList<SUV> suvList = new ArrayList<SUV>();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList importCarData() throws IOException {
		
		ArrayList return_list = new ArrayList();
		
		try {
			//Open input file
			FileInputStream inputFile = new FileInputStream("simplifiedDatabase.csv");
			// Create scanner to read in values from file
			Scanner inputScanner = new Scanner(inputFile);
			
			while (inputScanner.hasNext()) {
				String data = inputScanner.nextLine();
				
				String[] data_split = data.split("\\s*,\\s*", -1);
				
				if (data_split.length < 6) {
					data_split = new String[] { " ", " ", " ", " ", " ", " ", " " };
				}
				
				if (data_split[3].equalsIgnoreCase("Coupe")) {
					coupeList.add(new Coupe(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				} else if (data_split[3].equalsIgnoreCase("Sedan")) {
					sedanList.add(new Sedan(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				} else if (data_split[3].equalsIgnoreCase("Convertible")) {
					convertibleList.add(new Convertible(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				} else if (data_split[3].equalsIgnoreCase("Hatchback")) {
					hatchbackList.add(new Hatchback(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				} else if (data_split[3].equalsIgnoreCase("Truck")) {
					truckList.add(new Truck(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				} else if (data_split[3].equalsIgnoreCase("Wagon")) {
					wagonList.add(new Wagon(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				} else if (data_split[3].equalsIgnoreCase("SUV")) {
					suvList.add(new SUV(data_split[0], data_split[1], 
							Integer.parseInt(data_split[2]), data_split[4], data_split[5], 
							data_split[6]));
				}
			}
			
			return_list.add(coupeList);
			return_list.add(sedanList);
			return_list.add(convertibleList);
			return_list.add(hatchbackList);
			return_list.add(truckList);
			return_list.add(wagonList);
			return_list.add(suvList);
			
			inputScanner.close();
			inputFile.close();
		}
		catch (Exception e) {
			return_list.add(0, "Error " + e.toString());
		}
		
		return return_list;
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
