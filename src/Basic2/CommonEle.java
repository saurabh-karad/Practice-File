package Basic2;

import java.util.Arrays;

public class CommonEle {

	public static void main(String[] args) {
		int numberArray[] = {2,3,1,1,4,4,7,5,5};
		int result = CommonEle.commonElement(numberArray);
		System.out.println(result);

	}

	public static int commonElement(int num[]) {
		Arrays.toString(num);
		int len = num.length;
		int temp=0;
		int ctr=0;
		for(int i=0;i<len-1;i++) {
			temp=num[i];
			for(int j=i+1;j<len-1;j++) {
				if(temp==num[j]) {
					ctr++;
					break;
				}
			}
		}return ctr;
	}
}
