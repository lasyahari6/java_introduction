/*Problem statement
You are given two numbers 'a' and 'b' as input.
You must swap the values of 'a' and 'b'.
For Example:
Input: 
'a' = 8, 'b' = 5
Output:
5 8
*/
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

        sc.close();
    }
    
}
