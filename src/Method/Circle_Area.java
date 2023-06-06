package Method;

import java.util.Scanner;

public class Circle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius=");
		float radius=sc.nextFloat();
		float pi=3.14f;
		
		System.out.println("The value of Pi=" +pi);
		float circlearea=pi*radius*radius;
		System.out.print("Circle Area="+circlearea);

	}

}
