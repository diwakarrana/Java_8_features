package lambda_expression;

public class FunctionalTest2 {

	public static void main(String[] args) {
			Functional f = new Functional() {
				@Override
				public void display() {
					System.out.println("I am display from anonymous class");
				}
			};
			f.display();
			f.defaultFunction();
	}
}
