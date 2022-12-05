package EmailApplication.java;

import java.util.Scanner;

import Model.java.CredentialsService;
import Model.java.Employee;

public class AppMain {
      public static void main(String[] args) {
    	  Employee Demoemployee = new Employee("Ashwani","harshita" );
    	  ICredentials  credentialsService = new CredentialsService();
    		  
    	
  		//user input options for departments
  		System.out.println("Please choose the department from the following options");
  		System.out.println("1. Technical");
  		System.out.println("2. Admin");
  		System.out.println("3. Human Resources");
  		System.out.println("4. Legal");
  		
  		Scanner userInput = new Scanner(System.in);
  		int option = userInput.nextInt();
  		
  		String generatedEmail = null;
  		String generatedPassword = null;
  		
  		switch(option) {
  			case 1: {
  				//Dept is technical, short form is tech
  				generatedEmail = credentialsService.generateEmailAddress(Demoemployee.getFirstName().toLowerCase(),
  											Demoemployee.getLastName().toLowerCase(), "tech");
  				generatedPassword = credentialsService.generatePassword();
  				break;
  			}
  			case 2: {
  				//dept is Admin, short form is adm
  				generatedEmail = credentialsService.generateEmailAddress(Demoemployee.getFirstName().toLowerCase(),
  											Demoemployee.getLastName().toLowerCase(), "adm");
  				generatedPassword = credentialsService.generatePassword();
  				break;
  			}
  			case 3: {
  				//dept is HR, short form is hr
  				generatedEmail = credentialsService.generateEmailAddress(Demoemployee.getFirstName().toLowerCase(),
  											Demoemployee.getLastName().toLowerCase(), "hr");
  				generatedPassword = credentialsService.generatePassword();
  				break;
  			}
  			case 4: {
  				//dept is Legal, short form is lg
  				generatedEmail = credentialsService.generateEmailAddress(Demoemployee.getFirstName().toLowerCase(),
  											Demoemployee.getLastName().toLowerCase(), "lg");
  				generatedPassword = credentialsService.generatePassword();
  				break;
  			}
  			default : {
  				System.out.println("Enter a valid department option");
  			}
  		}
  		
  		Demoemployee.setEmail(generatedEmail);
  		Demoemployee.setPassword(generatedPassword);
  		credentialsService.showCredentials(Demoemployee);
  		
  		userInput.close();
  	}
  }
    	  
    	  
    	  
    	  
    	  
		
	
      


