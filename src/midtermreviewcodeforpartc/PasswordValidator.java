/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author m23ma
 */
public class PasswordValidator {
    public boolean isValid(Password password){
        return hasMinimumLength(password)&&hasSpecialCharacter(password);
    }
    
    public boolean hasMinimumLength(Password password){
        return password.length() >= 8;
    }
    
    private boolean hasSpecialCharacter(Password password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
     void run(User[] users, int userCount)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        UserName userName = new UserName(sc.nextLine());
        boolean validPassword=false;
        Password password="";
        while(!validPassword)
        {
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:"); 
            
            password = new Password(sc.nextLine());
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }//loop only ends when password is valid so now we create the User
        
        User newUser = new User(userName, password);
        users[userCount] = newUser;//add the new user to the user list
        System.out.println(UserStatus.NEW_USER_ADDED);
        System.out.println("UserName: " + userName);
        System.out.println(UserStatus.PASSWORD_HIDDEN);
    }//end run method
}