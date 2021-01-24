package agresti.mirko.wrapper.blackList;

public class UsaBlackListUrlCreator extends BlackListUrlCreator {

	public UsaBlackListUrlCreator(String username, String token, String pid, String mobile) {
		super(username, token, pid, mobile);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String doCountryBaseUrl() {
		// TODO Auto-generated method stub
		return "http://api.getsmscode.com/usdo.php";
	}

}
