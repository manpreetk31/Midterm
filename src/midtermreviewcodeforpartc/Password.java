/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author m23ma
 */
public class Password {
    private String value;
    
    public Password(String value) {
        this.value = value;
    }
    
    public int length() {
        return value.length();
    }
    
    public char charAt(int index) {
        return value.charAt(index);
    }
    
    @Override
    public String toString() {
        return value;
    }
}
