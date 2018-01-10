package com.testenglish.demo.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public interface CustomStringUtils {

	static String hash256(String str) {
        String hashedString = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(str.getBytes());
	        hashedString = bytesToHex(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hashedString;
    }
	
    static String bytesToHex(byte[] bytes) {
        StringBuffer result = new StringBuffer();
        for (byte byt : bytes) result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
        return result.toString();
    }
	
}
