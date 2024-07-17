package NumbersExcercise;

public class CheckForUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ugly number are those whose prime number are 2,3 or 5
		int num = 12;
//		if(((num%2==0)&&(num%3==0)&&(num%5==0))){
//			System.out.println("Number is ugly number");
//		}else {
//			System.out.println("Number is not ugly");
//		}
		// 2.Approach
		int ctr=0;
		boolean isPrime=true;
		for(int i=0;i<=num;i++) {
			isPrime=true;
			for(int j=0;j<i/2;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}if(isPrime) {
				ctr++;
				try {
					if((i==2)&&(i==3)&&(i==5)) {
						System.out.println("Number is not ugly");
					}else {
						System.out.println("Number is ugly");
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
