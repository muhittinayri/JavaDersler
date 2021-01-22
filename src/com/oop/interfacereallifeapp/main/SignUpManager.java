package com.oop.interfacereallifeapp.main;

public class SignUpManager {
	
	private IUserCheckService iUserCheckService; //atribüte
	
	
	
	public SignUpManager(IUserCheckService iUserCheckService) {
		this.iUserCheckService = iUserCheckService;
	}



	public void signup(User user) {
		if (iUserCheckService.checkUser(user)) {
			System.out.println("Kullanýcý Kayýt oldu : " + user.getName());
		}else {
			System.out.println("Kullanýcý Kayýt olamadý");
		}
		

	}
}
