package com.ui.runners;

import com.google.gson.Gson;
import com.ui.pojo.Users;

public class Runner1 {

	public static void main(String[] args) {
		
		Users user = new Users("Saurabh", 21);
		System.out.println(user.getName()+" "+user.getAge());

		//GSON
		//Serialization Convert Java object into Json
		Gson gson= new Gson();
		String data= gson.toJson(user);
		System.out.println(data);
		
		// Deserialization Convert json into java object
		String jsonData = "{\"name\":\"Uday\", \"age\":19}";
		Users u1= gson.fromJson(jsonData, Users.class);
		System.out.println(u1.getAge());
		System.out.println(u1);
		

		
	}

}
