package GettingStarted;

import java.util.*;

public class PrintPrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int divident=2;
		 while(n!=1){
		     if(n%divident==0){
		         System.out.print(divident + " ");
		         n/=divident;
		     }else{
		         divident++;
		     }
		 }
	}
}
