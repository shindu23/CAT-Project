import java.util.HashMap;

public class IDandPasswords {
	
HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Ilan","1234");
		logininfo.put("ABC","4321");
		logininfo.put("CBA","abc123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}


