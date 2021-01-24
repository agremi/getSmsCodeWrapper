package agresti.mirko.wrapper.login;

public abstract class LoginUrlCreator {
	private String username;
	private String token;

	public LoginUrlCreator(String username, String token) {
		this.username = username;
		this.token = token;
	}

	protected abstract String doCountryBaseUrl();

	public final String makeLoginAPIUrl() {
		String url = doCountryBaseUrl();
		url = url + "?action=login&username=" + username + "&token=" + token;
		return url;
	}
	public final String makeListMobileUrl() {
		String url = doCountryBaseUrl();
		url= url+"?action=mobilelist&username="+username+"&token="+token;
		return url;
	}
}
