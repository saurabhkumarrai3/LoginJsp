package com.bitwise.servlet_assignment1;

import java.util.HashMap;

public class Storage {
	HashMap<String, String> pq = new HashMap<String, String>();

	public Storage() {
		pq.put("saurabh", "123");
		pq.put("kumar", "456");

	}

	public boolean returnKeyValue(String key, String value) {
		if (pq.containsKey(key) && pq.containsValue(value))
			return true;
		else
			return false;
	}

//	public static void main(String[] args) {
//		Storage ud = new Storage();
//
//	}

}
