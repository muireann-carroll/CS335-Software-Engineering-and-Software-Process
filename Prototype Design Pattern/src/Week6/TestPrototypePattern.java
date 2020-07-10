package Week6;
import java.util.HashMap;
import java.util.Map;

public class TestPrototypePattern {

public static void main(String[] args) {
Map<String ,User>map=new HashMap<String ,User>();
AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
User user = new User("User A", "USER Level", userAccessControl);

map.put(user.getUserName(),user);

System.out.println("************************************");
System.out.println(user);

userAccessControl = AccessControlProvider.getAccessControlObject("USER");
user = new User("User B", "USER Level", userAccessControl);
System.out.println("Changing access control of: "+user.getUserName());
user.getAccessControl().setAccess("READ REPORTS");
System.out.println(user);

System.out.println("************************************");

AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
user = new User("User C", "MANAGER level", managerAccessControl);

map.put(user.getUserName(),user);

System.out.println(user);

AccessControl superUserAccessControl = AccessControlProvider.getAccessControlObject("SUPERUSER");
user = new User("User C", "SUPERUSER level", managerAccessControl);

map.put(user.getUserName(),user);

System.out.println(user);

check(user, map);

}

public static void check(User user, Map<String, User> map) {

if(user.getLevel()=="SUPERUSER level") {
System.out.println(map.values());
}

else {
System.out.println("ACCESS DENIED");
}

}
}

