/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axd1;

/**
 *
 * @author anthonyd
 */
public class SignCharacteristics {
    
    //instance variable 
    public String signName;
    
    //name variable assigned in the constructor
    public SignCharacteristics (String name){
            signName = name;
    }
    
    //prints out signName
    public void printSign(){
        System.out.println("Sign name: "+ signName);
    }
}