package backend;

import java.util.HashMap;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class DataBase {

	static HashMap<String, User> userDB = new HashMap<String,User>();
	static HashMap<Integer, String> messages = new HashMap<Integer,String>();
	
public DataBase() {
	setup();
	print();
}
	
	public  void setup()
	{
	this.addMessage("Have a Good Day!");
	this.addMessage("Be Happy!");
	this.addMessage("Life is Great!");
	this.addMessage("You Are Beautiful!");
	this.addMessage("Live Long and Prosper!");
	this.addMessage("Have a Good Night!");
	this.addMessage("Have a splendid day!");
	this.addMessage("You make it Rain!");
	this.addMessage("You are Sexy!");
	this.addMessage("You have done a Great Job!");
	}
	public boolean addMessage(String mess){
		messages.put(messages.size(), mess); 
		return true;
	}
	
	public void print()
	{
		for(String user:userDB.keySet())
		{
			System.out.println(user);
		}
		
		for(Integer mess:messages.keySet())
		{
			System.out.println(messages);
		}
		
	}
	
	public static boolean addUser(String email, String pass, String phone){
		User user = new User(email, pass, phone);
		System.out.println(email);
		return userDB.put(email, user) == null;
	}
}


