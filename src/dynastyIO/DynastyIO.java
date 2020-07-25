package dynastyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import vehicletypes.*;

public class DynastyIO {
	// ArrayLists for storing vehicles
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
		/**
		 * Import data from csv file
		 * 
		 * @return: ArrayList	Arraylist with all the cars
		 */
		
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
	
	public static void exportCarData(ArrayList<Coupe> coupeList, 
			ArrayList<Sedan> sedanList, ArrayList<Convertible> convertibleList, 
			ArrayList<Hatchback> hatchbackList, ArrayList<Truck> truckList, 
			ArrayList<Wagon> wagonList, ArrayList<SUV> suvList) throws IOException {
		/**
		 * Method to export all car data to a csv file
		 * 
		 * @param: ArrayList<Coupe>
		 * @param: ArrayList<Sedan>
		 * @param: ArrayList<Convertible>
		 * @param: ArrayList<Hatchback>
		 * @param: ArrayList<Truck>
		 * @param: ArrayList<Wagon>
		 * @param: ArrayList<SUV>
		 */
		try {
			// Create PrintWriter to send output to file
			PrintWriter printOutput = new PrintWriter(new FileOutputStream("simplifiedDatabase.csv"));
			
			if (coupeList != null) {
				for (int i=0; i < coupeList.size(); ++i) {
					 printOutput.printf("%s,%s,%d,Coupe,%s,%s,%s\n", coupeList.get(i).getMake(), 
							 coupeList.get(i).getModel(), coupeList.get(i).getYear(), 
							 coupeList.get(i).getColor(), coupeList.get(i).getEngine(), 
							 coupeList.get(i).getTransmission());
				 }
			}
			if (sedanList != null) {
				for (int i=0; i < sedanList.size(); ++i) {
					printOutput.printf("%s,%s,%d,Sedan,%s,%s,%s\n", sedanList.get(i).getMake(), 
							sedanList.get(i).getModel(), sedanList.get(i).getYear(), 
							sedanList.get(i).getColor(), sedanList.get(i).getEngine(), 
							sedanList.get(i).getTransmission());
				}
			}
			if (convertibleList != null) {
				for (int i=0; i < convertibleList.size(); ++i) {
					printOutput.printf("%s,%s,%d,Convertible,%s,%s,%s\n", convertibleList.get(i).getMake(), 
							convertibleList.get(i).getModel(), convertibleList.get(i).getYear(), 
							convertibleList.get(i).getColor(), convertibleList.get(i).getEngine(), 
							convertibleList.get(i).getTransmission());
				}
			}
			if (hatchbackList != null) {
				for (int i=0; i < hatchbackList.size(); ++i) {
					printOutput.printf("%s,%s,%d,Hatchback,%s,%s,%s\n", hatchbackList.get(i).getMake(), 
							hatchbackList.get(i).getModel(), hatchbackList.get(i).getYear(), 
							hatchbackList.get(i).getColor(), hatchbackList.get(i).getEngine(), 
							hatchbackList.get(i).getTransmission());
				}
			}
			if (truckList != null) {
				for (int i=0; i < truckList.size(); ++i) {
					printOutput.printf("%s,%s,%d,Truck,%s,%s,%s\n", truckList.get(i).getMake(), 
							truckList.get(i).getModel(), truckList.get(i).getYear(), 
							truckList.get(i).getColor(), truckList.get(i).getEngine(), 
							truckList.get(i).getTransmission());
				}
			}
			if (wagonList != null) {
				for (int i=0; i < wagonList.size(); ++i) {
					printOutput.printf("%s,%s,%d,Wagon,%s,%s,%s\n", wagonList.get(i).getMake(), 
							wagonList.get(i).getModel(), wagonList.get(i).getYear(), 
							wagonList.get(i).getColor(), wagonList.get(i).getEngine(), 
							wagonList.get(i).getTransmission());
				}
			}
			if (suvList != null) {
				for (int i=0; i < suvList.size(); ++i) {
					printOutput.printf("%s,%s,%d,SUV,%s,%s,%s\n", suvList.get(i).getMake(), 
							suvList.get(i).getModel(), suvList.get(i).getYear(), 
							suvList.get(i).getColor(), suvList.get(i).getEngine(), 
							suvList.get(i).getTransmission());
				}
			}
			
			printOutput.close();
		}
		catch (Exception e) {
			
		}
	}
}
