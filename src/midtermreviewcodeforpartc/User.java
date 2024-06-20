/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 * A class that models a User for Uno Online.
 * The user has a name and a password.
 * @author dancye, 2019
 */
public class User 
{
    private UserName name;
    private Password password;
    
    /**
     * a constructor that takes in the user's name and password
     * @param givenName
     * @param givenPass 
     */
    public User(UserName givenName, Password givenPass)
    {
        name = givenName;
        password=givenPass;
    }

    /** The getter for the user name
     * @return the name
     */
    public UserName getName() {
        return name;
    }

    /**
     * The setter for the user name
     * @param givenName the name to set
     */
    public void setName(UserName givenName) {
        name = givenName;
    }

    /**
     * The getter for the password
     * @return the password
     */
    public Password getPassword() {
        return password;
    }
    
    /**
     * A setter for the password
     * @param givenPass 
     */
    public void setPassword(Password givenPass)
    {
        password = givenPass;
    }
    
}