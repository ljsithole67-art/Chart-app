
package com.mycompany.chatapp;

public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String cellPhoneNumber;
 
    // Constructor
    public Login(String username, String password, String firstName, String lastName, String cellphoneNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
       this.cellPhoneNumber = cellPhoneNumber;
        
}

    public Login() {
    }
      public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
      }
    public boolean checkPasswordComplexity() {
        if (password.length() < 8) return false;
 
        boolean hasCapital   = false;
        boolean hasNumber   = false;
        boolean hasSpecial = false;
 
        String special = "Ch&&sec@ke99!";
 
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))       hasCapital   = true;
            if (Character.isDigit(c))           hasNumber  = true;
            if (special.indexOf(c) >= 0)        hasSpecial = true;
}
   return hasCapital && hasNumber && hasSpecial;     
    }
    public boolean checkCellPhoneNumber(){
        if(cellPhoneNumber == null || cellPhoneNumber.length()!=10)
            return false;
        for (char c : cellPhoneNumber.toCharArray()){
            if(Character.isDigit(c))
                return false;
        }
        return cellPhoneNumber.startsWith("07")|| cellPhoneNumber.startsWith("08");
    }
    public String registerUser(){
        if (checkUserName()){
            return ("Username is not correctly formatted," + 
                    "Please ensure that your  username contains an underscore and is no more than 5 characters in length.");
        }
        if(checkPasswordComplexity()){
            return("Password is not correctly formatted,"
                    + "Please ensure that the password contians atleast 8 characters,capital letter ,a number and a special characters");
        }
        if(checkCellPhoneNumber()) {
            return ("Cell phone number is not correctly formatted,"+
                    "Please ensure the number is 10 digits an starts with 07 or 08.");
        }
        return ("Registration successful!");
    }
    public boolean loginUser(String enteredUsername, String enteredPassword){
        return this.username.equals(enteredUsername)&& this.password.equals(enteredPassword);
    }
    public String returnLoginStatus(String enteredUsername,String enteredPassword){
        if(loginUser(enteredUsername, enteredPassword)){
            return "Welcome"+ firstName + " " + "it is great to see you again";
        }
        return "Username or password incorrect,please try again.";
    
           }
    public String getUsername()        { return username; }
    public String getFirstName()       { return firstName; }
    public String getLastName()        { return lastName; }
    public String getCellPhoneNumber() { return cellPhoneNumber; }

    public String getPassword() { return password;}
        
}
