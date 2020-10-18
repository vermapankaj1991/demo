package com.demo.demo_java_project;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		System.out.println("Printing numbers from 1 to 10");
		printNumber();
		
		System.out.println();
		try {
			System.out.println("Area of Triangle with base 4 and height 5 is "+getAreaofTriangle(4,5));
			System.out.println(getAreaofTriangle(0,5));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}
	
	/**
	 * print numbers from  1 to 10
	 */
	private static void printNumber(){
		for(int i = 1;i <= 10; i++)
			System.out.println(i);
	}
	
	private static double getAreaofTriangle(double base, double height) throws RuntimeException{
		if(base > 0  && height > 0)
			return 0.5 * base * height;
		else
			throw new RuntimeException("Base and height should always be greater than 0.");
	}
}
