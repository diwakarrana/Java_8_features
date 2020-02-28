package lambda_expression;

public interface Functional {
		void display();
		
		default void defaultFunction() {
			System.out.println("I am default fuction");
		}
}
