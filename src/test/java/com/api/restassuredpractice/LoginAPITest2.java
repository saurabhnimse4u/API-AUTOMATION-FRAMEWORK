package com.api.restassuredpractice;

import static io.restassured.RestAssured.given;

import com.google.gson.Gson;
import com.ui.pojo.LoginPayload;
import com.ui.pojo.LoginResponse;

public class LoginAPITest2 {

	public static void main(String[] args) {

		LoginPayload lp = new LoginPayload("iamfd", "password");

		LoginResponse lr = given().baseUri("http://64.227.160.186:9000/v1/").and()
				.header("content-type", "application/json").and().body(convertToJson(lp)).when().post("login")
				.as(LoginResponse.class);

		System.out.println(lr);
		System.out.println(lr.getMessage());
		System.out.println(lr.getData().getToken());
	}

	private static String convertToJson(Object src) {
		Gson gson = new Gson();
		String data = gson.toJson(src);
		return data;
	}
}
