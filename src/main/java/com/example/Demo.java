package com.example;

import com.example.encode.PwdSecurityService;

public class Demo {

	public static void main(String[] args) {
		 PwdSecurityService pwdSecurityService = new PwdSecurityService();
		 String encode = pwdSecurityService.encode("saket");
		 System.out.println(encode);
	}
	
}
