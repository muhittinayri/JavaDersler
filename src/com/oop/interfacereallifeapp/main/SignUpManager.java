package com.oop.interfacereallifeapp.main;

public class SignUpManager {
	
	private IUserCheckService iUserCheckService; //atrib�te
	
	
	
	public SignUpManager(IUserCheckService iUserCheckService) {
		this.iUserCheckService = iUserCheckService;
	}



	public void signup(User user) {
		if (iUserCheckService.checkUser(user)) {
			System.out.println("Kullan�c� Kay�t oldu : " + user.getName());
		}else {
			System.out.println("Kullan�c� Kay�t olamad�");
		}
		

	}
}
