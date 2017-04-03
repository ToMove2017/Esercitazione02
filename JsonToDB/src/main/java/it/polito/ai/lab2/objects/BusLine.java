/**
 * 
 */
package it.polito.ai.lab2.objects;

import java.util.List;

/**
 * @author riccardopersiani
 *
 */
public class BusLine {
	
	private String line;
	private String description;
	private List stops;
	
	public String getLine() {
		return line;
	}
	
	public String getDescription() {
		return description;
	}

	public List<String> getStops() {
		return stops;
	}
}
