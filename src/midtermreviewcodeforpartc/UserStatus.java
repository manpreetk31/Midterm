/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author m23ma
 */
public enum UserStatus {
    NEW_USER_ADDED("New User Added"),
    PASSWORD_HIDDEN("Password: just kidding can't show password"),

    UserStatus(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
