package dynastyGUI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import vehicletypes.Car;

public class GUIvalues {
	
	private Set<String> makeValues = new HashSet<String>();
	private Set<String> modelValues = new HashSet<String>();
	private Set<String> yearValues = new TreeSet<String>();
	private Set<String> colorValues = new HashSet<String>();
	private Set<String> engineValues = new HashSet<String>();
	private Set<String> transmissionValues = new HashSet<String>();
	
	public GUIvalues() {
		makeValues.add("All");
		modelValues.add("All");
		yearValues.add("All");
		colorValues.add("All");
		engineValues.add("All");
		transmissionValues.add("All");
	}  // Default Constructor
	
	public void setValues(ArrayList<ArrayList<Car>> carList) {
		for (int i=0; i < carList.size(); ++i) {
			for (int j=0; j < carList.get(i).size(); j++) {
				makeValues.add(carList.get(i).get(j).getMake());
				modelValues.add(carList.get(i).get(j).getModel());
				yearValues.add(String.valueOf(carList.get(i).get(j).getYear()));
				colorValues.add(carList.get(i).get(j).getColor());
				engineValues.add(carList.get(i).get(j).getEngine());
				transmissionValues.add(carList.get(i).get(j).getTransmission());
			}
		}
	}
	
	public void addValues(Car newValues) {
		makeValues.add(newValues.getMake());
		modelValues.add(newValues.getModel());
		yearValues.add(String.valueOf(newValues.getYear()));
		colorValues.add(newValues.getColor());
		engineValues.add(newValues.getEngine());
		transmissionValues.add(newValues.getTransmission());
	}
	
	public String[] getMakes() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = makeValues.iterator();
		
		while (it.hasNext()) {
			sb.append(it.next() + ",");
		}
		
		return sb.toString().split("\\s*,\\s*", -1);
	}
	
	public String[] getModels() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = modelValues.iterator();
		
		while (it.hasNext()) {
			sb.append(it.next() + ",");
		}
		
		return sb.toString().split("\\s*,\\s*", -1);
	}
	
	public String[] getYears() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = yearValues.iterator();
		
		while (it.hasNext()) {
			sb.append(it.next() + ",");
		}
		
		return sb.toString().split("\\s*,\\s*", -1);
	}
	
	public String[] getColors() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = colorValues.iterator();
		
		while (it.hasNext()) {
			sb.append(it.next() + ",");
		}
		
		return sb.toString().split("\\s*,\\s*", -1);
	}
	
	public String[] getEngines() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = engineValues.iterator();
		
		while (it.hasNext()) {
			sb.append(it.next() + ",");
		}
		
		return sb.toString().split("\\s*,\\s*", -1);
	}
	
	public String[] getTransmissions() {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = transmissionValues.iterator();
		
		while (it.hasNext()) {
			sb.append(it.next() + ",");
		}
		
		return sb.toString().split("\\s*,\\s*", -1);
	}
}
