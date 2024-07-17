package Basic2;

public class CheckAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple 5 banana 6";
		char[] str1 = str.toCharArray();
		String alpha="";
		for(int i=0;i<str1.length;i++) {
			if(Character.isAlphabetic(str1[i])) {
				alpha+=str1[i]+" ";
			}
		}
		System.out.println(alpha);
		
		
		
	}

}
