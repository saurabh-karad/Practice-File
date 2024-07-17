package Basic2;

import java.util.Scanner;

public class abecedarianWord {
	
	public static boolean Is_Abecedarian(String word) {
		int index = word.length()-1;
		for(int i=0;i<index;i++) {
			if(word.charAt(i)<=word.charAt(i+1)) {
				
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String words = sc.nextLine();
        System.out.println("Status of word:"+Is_Abecedarian(words));
      }

}
