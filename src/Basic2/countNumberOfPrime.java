package Basic2;

import java.util.Scanner;

public class countNumberOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int num1=0;
        int ctr=0;
        boolean isPrime=true;
        for(int i=2;i<=num;i++) {//2,3,4,5,6,7,8,9,10
        	isPrime =true;
        	for(int j=2;j<=i/2;j++) { //j=2 ,j<=3/2,i=4,j=4/2,i=5,j=5/2(2.5)
        		if(i%j==0) { //j=2,j<=3,i=7,j<=7/2(3.5),j<=8/2,j<=9/2(4.5)
        		isPrime=false;
      
        		break;
        		}
        		
        	}if(isPrime) {
        		ctr++;
        		System.out.println(i+"is a prime number");
        	}
        	
        	}
        System.out.println(ctr);
        }
	}


