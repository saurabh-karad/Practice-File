package Basic2;

import java.util.HashSet;

public class ComEleTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr1[]={"java","interview","question","for","experienced"};
        String arr2[]= {"java","experienced","time","lag"};
        System.out.println(commonElement(arr1,arr2));
	}

	public static HashSet<String> commonElement(String s1[],String s2[]) {
		int s1_len = s1.length;
		int s2_len = s2.length;
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<s1_len;i++) {
			for(int j=0;j<s2_len;j++) {
				if(s1[i]==s2[j]) {
					hs.add(s1[i]);
					break;
				}
			}
		}
		return hs;
	}
}
