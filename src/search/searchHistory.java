package search;

import java.util.ArrayList;

public class searchHistory extends ArrayList<String> {
	/**
	 *  Serialized Verision ID
	 */
	private static final long serialVersionUID = -4318766870909413203L;

	public searchHistory() { } // Default Constructor
	
	public String displaySearchHistory() {
		/**
		 * Returns the search History
		 * 
		 * @return: String	returns all stored search history
		 */
		String return_string = "";
		for (int i=0; i < this.size(); ++i) {
			return_string = return_string.concat(i + 1 + ": " + this.get(i) + "\n");
		}
		return return_string;
	}
}
