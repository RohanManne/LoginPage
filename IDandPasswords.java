import java.util.HashMap;

public class IDandPasswords {
	HashMap<String, String> logininfo = new HashMap<String,String>();
	
	IDandPasswords() {
		logininfo.put("Rohan", "a");
	}
	
	public void updateInfo(String name, String password) {
		logininfo.put(name, password);
	}
	
	public HashMap getLoginInfo() {
		return logininfo;
	}
}