package com.api.restassuredpractice;

import static io.restassured.RestAssured.given;

import com.google.gson.Gson;
import com.ui.pojo.LoginPayload;

import io.restassured.response.Response;

public class LoginAPITest {
	
	public static void main(String[] args) {

		LoginPayload lp = new LoginPayload("iamfd","password");
		
		Response response= given().baseUri("http://64.227.160.186:9000/v1/")
				.and()
				.header("content-type","application/json").and().body(convertToJson(lp)).when().post("login");

	  System.out.println(response.asPrettyString());
	}
	
	
	public static String convertToJson(Object src) {
		Gson gson = new Gson();
		String data= gson.toJson(src);
		return data;
	}
}
