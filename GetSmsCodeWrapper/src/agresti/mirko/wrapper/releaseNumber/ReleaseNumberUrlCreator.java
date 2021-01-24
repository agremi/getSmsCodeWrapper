package agresti.mirko.wrapper.releaseNumber;

public abstract class ReleaseNumberUrlCreator {
	private String username;
	private String token;
	private String pid;
	private String mobile;

	public ReleaseNumberUrlCreator(String username, String token, String pid, String mobile) {
		super();
		this.username = username;
		this.token = token;
		this.pid = pid;
		this.mobile = mobile;
	}
	protected abstract String doCountryBaseUrl();
	
	public String makeReleaseNumberUrl() {
		String url = doCountryBaseUrl();
		url= url+"?action=cancelSMSRecv&username="+username+"&token="+token+"&pid="+pid+"&mobile="+mobile;
		return url;
	}
}
