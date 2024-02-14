package com.DDF;

import java.security.SecureRandom;

public class RandomStringGenerator 
{
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();
    
    public static String generateRandomString(int length) 
    {
        StringBuilder stringBuilder = new StringBuilder(length);
        
        
        for (int i = 0; i < length; i++) 
        {
            stringBuilder.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        
        return stringBuilder.toString();
    }
	public static void main(String[] args) 
	{
		int length = 10;
		String domain = "@mailnator.com"; 
    	String randomstring = generateRandomString(length);
    	String email = randomstring + domain;
    	System.out.println("Random emailid: "+email);
        
	}

}
