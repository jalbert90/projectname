package projectname;

public class Weighted_Data_Set extends Data_Set { /*Attributs*/
	private double[] weights = new double[numberDataElement];
	
	/*Construct Weighted_Data_Set objects*/
	public Weighted_Data_Set(double[] weights) {
		super(numberDataElement, dataElement);
		this.weights = weights;
	}

}
