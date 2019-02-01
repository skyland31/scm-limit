package init;
import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] agrs) {
		
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("Number 1 ");
		a = in.nextInt();
		System.out.print("Number 2 ");
		b = in.nextInt();
		
		int total;
		
		total = a + b;
		System.out.println("total : " + total );
	}
	

}
