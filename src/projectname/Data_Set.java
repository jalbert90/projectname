package projectname;

import java.util.Scanner;

public class Data_Set { /*Attributes*/
	private int numberDataElement = 0;
	private double[] dataElement = new double[numberDataElement];
	boolean explicitEntry = false;
	Scanner scan = new Scanner(System.in);
	
	/*Constructors to create Data_Set objects*/
	//Default constructor 1    
	public Data_Set() {
		numberDataElement = 1;
		for (int i=0; i<numberDataElement; i++) {
			dataElement[i] = 0;
			System.out.println(dataElement[i]);
		}
	}
	
	//Default constructor 2
	public Data_Set(int numberDataElement, boolean explicitEntry) {
		this.explicitEntry = explicitEntry;
		this.numberDataElement = numberDataElement;
		
		if (explicitEntry) {
			
			/* Replace with setData_set() method
			System.out.println("Key in the " + numberDataElement + " data elements: ");
			for(int i=0; i<numberDataElement; i++) {
				System.out.print("index #" + i + ": ");
				dataElement[i] = scan.nextDouble();
				System.out.println();
			}*/
			setData_Set();
			
		} else if (!explicitEntry) {
			for (int i=0; i<numberDataElement; i++) {
				dataElement[i] = 0;
			}
		} else {
			System.out.println("Error with explicitEntry boolean!");
		}
		
		/* Replace with the getData_Set() method...?
		System.out.println("Data_Set: ");
		for (int i=0; i<numberDataElement; i++) {
		System.out.print(" " + dataElement[i] + " ");
		}*/
		getData_Set();
	}
	
	//Full Constructor for creating Data_Set objects
	public Data_Set(int numberDataElement, double[] dataElement) {
		this.dataElement = dataElement;
		this.numberDataElement = numberDataElement;
		
		/*
		for(int i=0; i<n; i++) {
			data[i] = scan.nextDouble();
			data[i] = n-i;
			System.out.println(data[i]);
		}
		*/
		
		
		
	}
	
	/*Actions*/
	public int getNumberDataElement() {
		return numberDataElement;
	}
	
	public void setNumberDataElements(int numberDataElement) {
		this.numberDataElement = numberDataElement;
	}
	
	public double getDataElement(int i) {
		return dataElement[i];
	}
	
	public void setDataElement(double[] dataElement) {
		this.dataElement = dataElement;
	}
	public void getData_Set() {
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
}