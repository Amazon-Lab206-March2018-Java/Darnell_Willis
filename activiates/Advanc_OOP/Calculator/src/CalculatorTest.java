
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculate = new Calculator();
		
		calculate.setOperandOne(10.5);
		calculate.setOperation("+");
		calculate.setOperandTwo(5.2);
		calculate.performOperation();
        calculate.getResults();
		
	}

}
