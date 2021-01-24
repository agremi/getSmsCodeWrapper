package agresti.mirko.wrapper.getsms;

public class ChinaGetSmsUrlCreator extends GetSmsUrlCreator {

	public ChinaGetSmsUrlCreator(String username, String token, String pid, String mobile) {
		super(username, token, pid, mobile);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String doCountryBaseUrl() {
		// TODO Auto-generated method stub
		return "http://api.getsmscode.com/do.php";
	}

}
