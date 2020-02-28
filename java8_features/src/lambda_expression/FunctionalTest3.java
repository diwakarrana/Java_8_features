package lambda_expression;

public class FunctionalTest3 {

	public static void main(String[] args) {
			
		Functional f = () ->{
			System.out.println("I am display from functional prohram");
		};
		f.display();
		
		Functional2 f2 = (a,b) -> {
			System.out.println("your addition is following");
			return a + b;
		};
		int sum =f2.add(12, 24);
		System.out.println(sum);
	}
}
