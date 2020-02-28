package lambda_expression;

public class ThreadExample {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int count =0;
				while(count < 10) {
					System.out.println("Anonymous class "+Thread.currentThread().getId()+" "+count);
					count++;
				}
			}
		};// end of anonylous class
		Thread t1 = new Thread(r);
		t1.start();
		Thread t4 = new Thread(r);
		t4.start();
		
		Runnable r1 = ()->{
			int count =0;
			while(count < 10) {
				System.out.println("functional programming"+Thread.currentThread().getId()+" "+count);
				count++;
				}		
			};
		Thread t2 = new Thread(r1);
		t2.start();
		Thread t3 = new Thread(r1);
		t3.start();
	}
}
