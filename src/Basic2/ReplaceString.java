package Basic2;

public class ReplaceString {
    public static void main(String [] args) {
    	String str = "python is more propular than java";
    	String rep_string = str.replace("python", "@").replace("java","#").replace("@","java").replace("#", "python");
    	System.out.println(rep_string);
    }
}
