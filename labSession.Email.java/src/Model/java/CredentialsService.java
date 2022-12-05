package Model.java;

import java.util.Random;

import EmailApplication.java.ICredentials;

public  class CredentialsService implements ICredentials  {
	
		public String generateEmailAddress(String firstName ,String lastName , String Department) {
			
		String EmailAddress = firstName + lastName +"@" + "Abc.Com";
		//AshwaniSharma@Abc.com
		return EmailAddress;
		}
	
		public String generatePassword () {
			String Capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallLetters = "abcdefghijklmnopqrstuvwxyz";
			String Numbers = "0123456789";
			String Specialcharacters = "!@#%$%^&*()_+";
			
			String allvalues = Capitalletters  + smallLetters + Numbers + Specialcharacters;
	 
		    Random randomObj = new Random();
			String Password ="";
			
			for (int i = 0 ;i < 8 ; i++) {
				int boundValue = allvalues.length();
				int randomIndex = randomObj.nextInt(boundValue);
				char randomchar =allvalues.charAt(randomIndex);
				Password += String.valueOf(randomchar);
				
			
		}
			return Password;
			
		}
		@Override
		public void showCredentiales(Employee employee) {
			//welcome message
			//display email, password
			System.out.println("Dear "+employee.getFirstName() + " your generated credentials are :");
			System.out.println("Email ID : " + employee.getEmail());
			System.out.println("Password : " +employee.getPassword());
		}

		@Override
		public void showCredentials(Employee employee) {
			// TODO Auto-generated method stub
			
		}
}
