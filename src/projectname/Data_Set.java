package projectname;

import java.util.Scanner;

/**
 * The Data_Set class defines the attributes and actions (methods) of a Data_Set object (1D array)
 * @author Jacob Albert
 * @version 1.0
 */
public class Data_Set { /*Attributes*/
	protected int dataLength;
	protected double[] data;
	protected boolean explicitEntry = false;
	private Scanner scan = new Scanner(System.in);
	
	/**
	 * Constructor 1: creates a 1D array of length 1 whose value is 0
	 */
	public Data_Set() { //Rewrite as this(1, false) ??
		this.dataLength = 1;
		this.data = new double[this.dataLength];
		for (int i=0; i<this.dataLength; i++) {
			this.data[i] = 0;
			System.out.println(this.data[i]);
		}
	}
	
	/**
	 * Constructor 2: creates a 1D array of length {@code dataLength} whose values are 0, or the array values are entered explicitly depending on the value of 
	 * the boolean {@code explicitEntry}
	 * @param dataLength int containing the length of the 1D array
	 * @param explicitEntry boolean is true: 1D array is constructed explicitly by manually entering the values; otherwise, values are 0
	 */
	public Data_Set(int dataLength, boolean explicitEntry) {
		this.explicitEntry = explicitEntry;
		this.dataLength = dataLength;
		this.data = new double[this.dataLength];
		
		if (explicitEntry) {
			setData_Set();
			
		} else if (!explicitEntry) {
			for (int i=0; i<this.dataLength; i++) {
				this.data[i] = 0;
			}
		} else {
			System.out.println("Error with explicitEntry boolean!");
		}
		printData_Set();
	}
	
	/**
	 * Constructor 3: creates a 1D array by passing in a 1D array by reference
	 * @param data 1D array passed to constructor by reference
	 */
	public Data_Set(double[] data) {
		this.dataLength = data.length;
		this.data = new double[this.dataLength];
		this.data = data;
	}
	
	/*Actions*/
	/**
	 * @return the length of the 1D array
	 */
	public int getDataLength() {
		return this.dataLength;
	}
	
	/**
	 * Set length of the 1D array
	 * @param dataLength is the length of the 1D array
	 */
	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	} 
	
	/**
	 * Function to retrieve the value of an element of the 1D array at the location {@code index}
	 * @param index is the location of the value in the 1D array
	 * @return the value at the {@code index} location
	 */
	public double getDataElement(int index) {
		return this.data[index];
	}
	
	/**
	 * Method to set the value of an array element at location {@code index}
	 * @param index location of array element (ranging from 0 to ({@code dataLength} - 1))
	 * @param value to set the array element to
	 */
	public void setDataElement(int index, double value) {
		this.data[index] = value;
	}
	
	/**
	 * Iterates through the 1D-array, printing each element to standard output 
	 */
	public final void printData_Set() {
		System.out.println();
		System.out.println("Data_Set: ");
		for (int i=0; i<this.dataLength; i++) {
		System.out.println(this.data[i]);
		}
		
	}
	
	/**
	 * Iterates through the 1D-array, writing each element from standard input
	 */
	public final void setData_Set() {
		System.out.println("Key in the " + this.dataLength + " data elements: ");
		for(int i=0; i<this.dataLength; i++) {
			System.out.print("index #" + i + ": ");
			this.data[i] = scan.nextDouble();
			//System.out.println();
		}
	}
	
	/**
	 * Method to write values to the 1D-array obtained from standard input by calling the {@code setData_Set()} function
	 * @param dataLength specifies the length of the 1D-array
	 */
	public void setData_Set(int dataLength) {
		this.dataLength = dataLength;
		setData_Set();
	}
	
	/**
	 * This method assigns values to the 1D-array by passing in a 1D-array by reference
	 * @param dataElement is a 1D-array of doubles passed to the function by reference
	 */
	public void setData_Set(double[] dataElement) {
		this.data = dataElement;
	}
	
	/**
	 * Function that returns the 1D-array of doubles (Data_Set object)
	 * @return the 1D-array of doubles (Data_Set object)
	 */
	public double[] getData_Set() {
		return this.data;
	}
}