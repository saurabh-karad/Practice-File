package Basic2;

public class CheckForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Thank you for your comment and your participation";
        String split_string[] = str.split(" ");
        int max_length = 0;
        int indexL  = 0;
        int max_frequency = 0;
        int indexF =0;
        
//        for(int i=0;i<split_string.length;i++) {
//        	repeat = split_string[i];
//        	for(int j=1;j<split_string.length;j++) {
//        		if((repeat==split_string[j]) && (repeat.length()<split_string[j].length())) {
//        			res+=split_string[j];
//        		}
//        	}
//        }
        for(int i=0;i<split_string.length;i++) {
        	if(max_length<split_string[i].length()) {
        		indexL=i;
        		max_length = split_string[i].length();
        	}
        	int ctr=0;
        	for(int j=i;j<split_string.length;j++) {
        		if(split_string[i].equals(split_string[j]));
        		ctr++;
        	}
        	if(max_frequency<ctr) {
        		indexF=i;
        		max_frequency=ctr;
        	}
        }
        
        System.out.println(split_string[indexL]+" "+split_string[indexF]);
       
	}

}
