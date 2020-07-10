package Week6;
import java.util.HashMap;
import java.util.Map;
public class AccessControlProvider {

private static Map<String, AccessControl>map = new HashMap<String, AccessControl>();

	static{

	System.out.println("Fetching data from external resources and creating access control objects...");
	map.put("USER", new AccessControl("USER","DO_WORK"));
	map.put("ADMIN", new AccessControl("ADMIN","ADD/REMOVE USERS"));
	map.put("SUPERUSER", new AccessControl("ADMIN","ADD/REMOVE USERS, INSTALL/UNINSTALL APPLICATIONS."));
	map.put("MANAGER", new AccessControl("MANAGER","DENIED"));
	map.put("VP", new AccessControl("VP","MODIFY REPORTS"));
	}

	public static AccessControl getAccessControlObject(String controlLevel){
		AccessControl ac = null;
		ac = map.get(controlLevel);
if(ac!=null){
return ac.clone();
}
return null;
}
}
