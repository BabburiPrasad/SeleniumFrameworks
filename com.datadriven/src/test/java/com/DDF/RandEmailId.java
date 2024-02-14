package com.DDF;

import java.security.SecureRandom;

public class RandEmailId 
{
	
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) 
	{
		int length = 10; // Change the length as per your requirement
        String randomString = generateRandomString(length);
        String domain = "example.com"; // Change the domain name as per your requirement
        String email = randomString + "@" + domain;
        System.out.println("Random Email: " + email);
		

	}
	
	public static String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return stringBuilder.toString();
    }

}
