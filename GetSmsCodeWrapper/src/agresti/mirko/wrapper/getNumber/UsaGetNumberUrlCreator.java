package agresti.mirko.wrapper.getNumber;

public class UsaGetNumberUrlCreator extends GetNumberUrlCreator {

	public UsaGetNumberUrlCreator(String username, String token, String pid) {
		super(username, token, pid);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String doCountryBaseUrl() {
		// TODO Auto-generated method stub
		return "http://api.getsmscode.com/usdo.php";
	}

}
