package search;

import java.util.ArrayList;
import java.util.Set;

import vehicletypes.*;

public class searchCars {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static StringBuffer searchAll(ArrayList carList, String carType) {
		/*
		 * Return StringBuffer containing all vehicles of the
		 * specified type
		 * 
		 * @param	ArrayList	list of car objects
		 * @param	String		car object type
		 * 
		 * @return	StringBuffer	StringBuffer of all cars of type
		 */
		
		// Cast ArrayList to proper car object type
		try {
			if (carType.equalsIgnoreCase("Coupe")) {
				carList = (ArrayList<Coupe>) carList.clone();
			}
			else if (carType.equalsIgnoreCase("Sedan")) {
				carList = (ArrayList<Sedan>) carList.clone();
			}
			else if (carType.equalsIgnoreCase("Convertible")) {
				carList = (ArrayList<Convertible>) carList.clone();
			}
			else if (carType.equalsIgnoreCase("Hatchback")) {
				carList = (ArrayList<Hatchback>) carList.clone();
			}
			else if (carType.equalsIgnoreCase("Truck")) {
				carList = (ArrayList<Truck>) carList.clone();
			}
			else if (carType.equalsIgnoreCase("Wagon")) {
				carList = (ArrayList<Wagon>) carList.clone();
			}
			else if (carType.equalsIgnoreCase("SUV")) {
				carList = (ArrayList<SUV>) carList.clone();
			}
			// return Error if car boject type does not match
			else {
				return new StringBuffer("Error");
			}
		// return OOB if ArrayList does not contain any objects
		} catch (IndexOutOfBoundsException e) {
			return new StringBuffer("OOB");
		}
		
		// data field for StringBuffer to return
		StringBuffer returnBuffer = new StringBuffer();
		
		// iterate through ArrayList to get toString of Object
		for (int i=0;i < carList.size();++i) {
			returnBuffer.append(carList.get(i).toString());
		}
		
		// return StringBuffer
		return returnBuffer;
	}
	
	public static StringBuffer searchFor(StringBuffer carList, String searchitem) {
		StringBuffer searchList = new StringBuffer();
		String[] carList_split = carList.toString().split("\n");
		for (int i=0; i < carList_split.length; ++i) {
			String temp = carList_split[i];
			if (temp.contains(searchitem)) {
				searchList.append(temp + "\n");
			}
		}
		return searchList;
	}
}
