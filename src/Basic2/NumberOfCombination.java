package Basic2;

import java.util.Scanner;

public class NumberOfCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the range");
       int range = sc.nextInt();
       System.out.println("Combination of number to be found:");
       int combo=sc.nextInt();
       int ctr=0;
       for(int i=0;i<=range;i++) {
    	   for(int j=0;j<=range;j++) {
    		   for(int k=0;k<=range;k++) {
    			   for(int l=0;l<=range;l++) {
    				   if(i+j+k+l==combo) {
    					   ctr++;
    				   }
    			   }
    		   }
    	   }
       }
       System.out.println("Number of combination is:-"+ctr);
       
	}

}
