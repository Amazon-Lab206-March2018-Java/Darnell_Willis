
public class Calculator implements java.io.Serializable {
	
	private double results;
	private double x;
	private double y;
	private String operation;
	
	
	public void setOperandOne(double x) {
		this.x = x;
	}
	
	public void setOperation(String operand) {
		operation = operand;
	}
	
	public void setOperandTwo(double y) {
		this.y = y;
	}
	
	public void performOperation() {
		
		if (operation == "+") {
            results = x + y;
        }
        else {
            results = x - y;
        }
	}
	
	public void getResults() {
		System.out.println(results);
	}
	
}