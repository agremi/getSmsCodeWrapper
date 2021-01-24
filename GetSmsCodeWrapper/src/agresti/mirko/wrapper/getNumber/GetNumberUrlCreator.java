package agresti.mirko.wrapper.getNumber;

public abstract class GetNumberUrlCreator {
	private String username;
	private String token;
	private String pid;
	
	public GetNumberUrlCreator(String username, String token, String pid) {
		super();
		this.username = username;
		this.token = token;
		this.pid = pid;
	}
	protected abstract String doCountryBaseUrl();
	
	public String makeGetNumberUrl() {
		String url= doCountryBaseUrl();
		url=url+"?action=getmobile&username="+username+"&token="+token+"&pid="+pid;
		return url;
	}
	
}
