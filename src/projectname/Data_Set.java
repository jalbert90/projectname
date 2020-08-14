package projectname;

import java.util.Scanner;

public class Data_Set { /*Attributes*/
	protected int numberDataElement = 0;
	protected double[] dataElement = new double[numberDataElement];
	protected boolean explicitEntry = false;
	private Scanner scan = new Scanner(System.in);
	
	/*Constructors to create Data_Set objects*/
	/*Default constructor 1*/    
	public Data_Set() {
		numberDataElement = 1;
		for (int i=0; i<numberDataElement; i++) {
			dataElement[i] = 0;
			System.out.println(dataElement[i]);
		}
	}
	
	/*Default constructor 2*/
	public Data_Set(int numberDataElement, boolean explicitEntry) {
		this.explicitEntry = explicitEntry;
		this.numberDataElement = numberDataElement;
		
		if (explicitEntry) {
			setData_Set();
			
		} else if (!explicitEntry) {
			for (int i=0; i<numberDataElement; i++) {
				dataElement[i] = 0;
			}
		} else {
			System.out.println("Error with explicitEntry boolean!");
		}
		printData_Set();
	}
	
	/*Full Constructor for creating Data_Set objects*/
	public Data_Set(int numberDataElement, double[] dataElement) {
		this.dataElement = dataElement;
		this.numberDataElement = numberDataElement;
		//setData_Set();
	}
	
	/*Actions*/
	public int getNumberDataElement() {
		return numberDataElement;
	}
	
	public void setNumberDataElement(int numberDataElement) {
		this.numberDataElement = numberDataElement;
	}
	
	public double getDataElement(int index) {
		return dataElement[index];
	}
	
	public void setDataElement(int index, double value) {
		dataElement[index] = value;
	}
	public void printData_Set() {
		System.out.println();
		System.out.println("Data_Set: ");
		for (int i=0; i<numberDataElement; i++) {
		System.out.print(" " + dataElement[i] + " ");
		}
		
	}
	public void setData_Set() {
		System.out.println("Key in the " + numberDataElement + " data elements: ");
		for(int i=0; i<numberDataElement; i++) {
			System.out.print("index #" + i + ": ");
			dataElement[i] = scan.nextDouble();
			System.out.println();
		}
	}
	public void setData_Set(int numberDataElement) {
		this.numberDataElement = numberDataElement;
		setData_Set();
	}
	public void setData_Set(int numberDataElement, double[] dataElement) {
		this.numberDataElement = numberDataElement;
		this.dataElement = dataElement;
	}
	public double[] getData_Set() {
		return dataElement;
	}
}