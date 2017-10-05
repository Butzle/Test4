package talkwalker.round2.jo.schimberg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	private static final Regex instance = new Regex();

	private Regex() {
	}

	public static Regex getInstance() {
		return instance;
	}
	
	public boolean matchesPattern() {
		Pattern pattern = Pattern.compile("AB");
		return pattern.matcher("AB").matches();
	}
}
