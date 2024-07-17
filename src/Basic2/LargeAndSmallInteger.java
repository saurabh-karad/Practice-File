package Basic2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.LongStream;
public class LargeAndSmallInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String s = sc.next();
		
		int num[] = new int[8];
		
		for(int i=0;i<8;i++) {
			num[i] = Integer.valueOf(s.substring(i,i+1));
			
		}
		Arrays.sort(num);
		int a=0;
		int b=0;
		int c=1;
		
		for(int i=0;i<8;i++) {
			a+=num[i]*c;
			b+=num[7-i]*c;
			c*=10;
		}
		System.out.println("Difference between largest and smallest number is:"+(a-b));
	}
	
}
