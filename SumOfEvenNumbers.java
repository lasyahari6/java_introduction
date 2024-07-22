/*
You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to 'N' (both inclusive).
*/

    import java.util.*;
    public class SumOfEvenNumbers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<=n;i++){
                if(i%2==0){
                sum=sum+i;}
            }
            System.out.println(sum);
            sc.close();
        }
        
    }
