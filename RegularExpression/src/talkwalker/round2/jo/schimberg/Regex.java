package talkwalker.round2.jo.schimberg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex implements Test {

	private static final Regex instance = new Regex();

	private Regex() {
	}

	public static Regex getInstance() {
		return instance;
	}
	
	public boolean matchesPattern() {
		/*Pattern pattern = Pattern.compile(".*AB[^1-9]?");
		return pattern.matcher("CABb").matches();*/
		
		Pattern pattern = Pattern.compile("\\d");
		//return pattern.matcher("12").matches();
		
		Pattern pattern2 = Pattern.compile("\\s?");
		return pattern2.matcher(" ").matches();
	}

}
