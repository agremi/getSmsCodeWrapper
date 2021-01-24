package agresti.mirko.wrapper.getsms;

public abstract class GetSmsUrlCreator {
	private String username;
	private String token;
	private String pid;
	private String mobile;
	
	public GetSmsUrlCreator(String username, String token, String pid, String mobile) {
		super();
		this.username = username;
		this.token = token;
		this.pid = pid;
		this.mobile= mobile;
	}
	
	protected abstract String doCountryBaseUrl();
	
	public String makeGetSmsUrl() {
		String url=doCountryBaseUrl();
		url= url+"?action=getsms&username="+username+"&token="+token+"&pid="+pid+"&mobile="+mobile;
		return url;
	}
	
	
}
