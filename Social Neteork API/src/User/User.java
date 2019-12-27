package User;
import java.util.ArrayList;

import Group.Group;
import Message.Message;
import Post.Post;
public class User {
	public String Name;
	public String Password;
	public String Email;
	public int Age;
	public String Gender;
	public String profilPhoto;
	public String Address;
	public String phoneNumber;
	public String School;
	public String College;
	public Post p;
	public SearchManager searchEngine;
	public Group G;
	public FriendManager friend;
	public Message chat;
	
	public User(String name, String password, String email, int age, String gender) {
		Name = name;
		Password = password;
		Email = email;
		Age = age;
		Gender = gender;
	}
	public void signUp() {};
	public void login() {};
	public void logout() {};
	public void addInformation(String tempSchool , String tempCollege , String number , String tempAddress) {};
	public void changePic(String Path) {};
	public void DeactivateAccount(ArrayList<User>Users , User user) {};
}
