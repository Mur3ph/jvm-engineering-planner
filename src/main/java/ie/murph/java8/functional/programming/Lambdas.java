package main.java.ie.murph.java8.functional.programming;

public class Lambdas {

	public static void main(String[] args) {
		Lambdas lambdas = new Lambdas();
		
		lambdas.internalInterfaceTest();
		lambdas.threadInterfaceTest();
	}
	
	private void internalInterfaceTest(){
		System.out.println("=== Internal Interface Test ===");
		ILambdasNeedInterfaces isEven = (n) -> (n % 2) == 0;
		System.out.println(isEven.ApplyArg(4));
	}
	
	private void threadInterfaceTest(){
		System.out.println("=== RunnableTest ===");
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world Anonymous!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world Lambda!");
		// Run em!
		r1.run();
		r2.run();
	}

}
