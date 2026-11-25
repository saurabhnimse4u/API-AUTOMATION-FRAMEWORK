package com.ui.pojo;

public class Data {
private String token;

public Data(String token) {
	super();
	this.token = token;
}

public String getToken() {
	return token;
}

@Override
public String toString() {
	return "Data [token=" + token + "]";
}

}
