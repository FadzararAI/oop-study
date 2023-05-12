import java.util.regex.*;
class EmailAnalyze{
	private String pattern = "^(.+)@(.+)$";
	protected String EmailAddress;

	public EmailAnalyze(String address){
		EmailAddress = address;
	}

	public boolean isEmail(){
		Pattern r = Pattern.compile(pattern);
		Matcher match = r.matcher(EmailAddress);
		if(match.find()){
			return true;
		}
		else{
			return false;
		}
	}
}
