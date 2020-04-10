/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Andre Jordan da Silva - s12081361
 */
@Named(value = "convertorDetails")
@SessionScoped
public class ConvertorDetails implements Serializable {

    String tempOne;
    String tempTwo;
    Double userInput;
    Double answer;
    String rightAnswer;
       
    
    public ConvertorDetails() {
    }
    
    public String getRightAnswer() {  
        
        if(userInput == null){
            return "Please enter a temperature.";
        }
     
        // Celsius
        if(tempOne.equals("Celsius") && tempTwo.equals("Celsius") ){
           
           return "The convertion is not possible. Please select a different temperature.";
        }
        if(tempOne.equals("Celsius") && tempTwo.equals("Fahrenheit") ){
             answer = (userInput * 9/5 + 32)  ;
             
           return (userInput + " " + tempOne + " in " + tempTwo + " is : " + (String.format("%.1f",answer)));
        }
        if(tempOne.equals("Celsius") && tempTwo.equals("Kelvin") ){
           answer = (userInput + 273.15)  ;
             
           return (userInput + " " + tempOne + " in " + tempTwo + " is : " + (String.format("%.1f",answer)));
        }
        
        // fahrenheit
        if(tempOne.equals("Fahrenheit") && tempTwo.equals("Fahrenheit") ){
           
           return "The convertion is not possible. Please select a different temperature.";
        }
        if(tempOne.equals("Fahrenheit") && tempTwo.equals("Celsius") ){
             answer = (userInput - 32) * 5/9  ;
             
           return (userInput + " " + tempOne + " in " + tempTwo + " is : " + (String.format("%.1f",answer)));
        }
        if(tempOne.equals("Fahrenheit") && tempTwo.equals("Kelvin") ){
           answer = (userInput + 459.67)* 5/9 ;
             
           return (userInput + " " + tempOne + " in " + tempTwo + " is : " + (String.format("%.1f",answer)));
        }
        
        //Kelvin
        
        if(tempOne.equals("Kelvin") && tempTwo.equals("Kelvin") ){
           
           return "The convertion is not possible. Please select a different temperature.";
        }
        if(tempOne.equals("Kelvin") && tempTwo.equals("Celsius") ){
             answer = (userInput - 273.15) ;
             
           return (userInput + " " + tempOne + " in " + tempTwo + " is : " + (String.format("%.1f",answer)));
        }
        if(tempOne.equals("Kelvin") && tempTwo.equals("Fahrenheit") ){
           answer = (userInput * 9/5) - 459.67  ;
             
           return (userInput + " " + tempOne + " in " + tempTwo + " is : " + (String.format("%.1f",answer)));
        }
               
        else{
            return "error";
        }
    }
    public String getTempOne() {
        return tempOne;
    }

    public void setTempOne(String tempOne) {
        this.tempOne = tempOne;
    }

    public String getTempTwo() {
        return tempTwo;
    }

    public void setTempTwo(String tempTwo) {
        this.tempTwo = tempTwo;
    }

    public Double getUserInput() {
        return userInput;
    }

    public void setUserInput(Double userInput) {
        this.userInput = userInput;
    }
    
    
    
    
    
}




    