import java.util.*;
public class PrintElements {
	public static void main(String args[]) {	
		// Write code here
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.printf("The name of the person is %s and the age is %d",name, age);
		sc.close();		
	}
}
    