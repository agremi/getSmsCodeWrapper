package agresti.mirko.wrapper.login;

public class ChinaLoginUrlCreator extends LoginUrlCreator {

	public ChinaLoginUrlCreator(String username, String token) {
		super(username, token);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String doCountryBaseUrl() {
		// TODO Auto-generated method stub
		return "http://api.getsmscode.com/do.php";
	}

}
