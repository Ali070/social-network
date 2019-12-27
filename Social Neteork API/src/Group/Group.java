package Group;
import User.User;
public class Group {
	public String groupName;
	public String groupPrivacy;
	public User Admin;
	public String groupDescription;
	public boolean joinGroup(String name) {return true;}
	public void createGroup(String name , String privacy , String description ,  User admin) {};
	public void deleteGroup(Group group) {};
}
