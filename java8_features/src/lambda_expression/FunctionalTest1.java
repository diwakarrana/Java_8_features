package lambda_expression;

public class FunctionalTest1 implements Functional {

	public static void main(String[] args) {
			Functional f = new FunctionalTest1();
			f.display();
			f.defaultFunction();
	}

	@Override
	public void display() {
		System.out.println("display is displaying");
	}
	
	@Override
	public void defaultFunction() {
		System.out.println("I am Overridden default function");
	}

}
