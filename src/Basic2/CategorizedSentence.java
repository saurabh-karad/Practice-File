package Basic2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CategorizedSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "The quick fox and lion participate in the competition";
        Pattern pattern = Pattern.compile(str,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("[a-zA-Z]{3-6}");
        System.out.println(matcher);
	}

}
