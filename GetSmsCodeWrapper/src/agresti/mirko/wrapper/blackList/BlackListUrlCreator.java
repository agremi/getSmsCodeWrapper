package agresti.mirko.wrapper.blackList;

public abstract class BlackListUrlCreator {
	private String username;
	private String token;
	private String pid;
	private String mobile;

	public BlackListUrlCreator(String username, String token, String pid, String mobile) {
		super();
		this.username = username;
		this.token = token;
		this.pid = pid;
		this.mobile = mobile;
	}
	
	protected abstract String doCountryBaseUrl();
	
	public String makeBlackListUrl() {
		String url= doCountryBaseUrl();
		url=url+"?action=addblack&username="+username+"&token="+token+"&pid="+pid+"&mobile="+mobile;
		return url;
	}
}
