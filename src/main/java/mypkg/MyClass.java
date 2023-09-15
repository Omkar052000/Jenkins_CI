package mypkg;
import java.util.Scanner;

public class MyClass {
	public int areaRect(int l , int b)
	{
		return (l * b);
	}
	public int areaSquare(int s)
	{
		return (s * s);
	}
	public float areaCircle(float r)
	{
		return (float) (3.14 * r * r);
	}
	public void show()
	{
		System.out.println("Hello GFG");
		System.out.println("Welcome to Jenkins Pipeline, This is DevOps Class");
	}
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length :"); 
		l = sc.nextInt();
		System.out.println("Enter Breadth :"); 
		b = sc.nextInt();
		System.out.println("Area of the Rectangle is :"+ob.areaRect(l, b));
		System.out.println("Area of the Square is :"+ob.areaSquare(10));
	}

}
