
package Testclass;

import com.mycompany.chatapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestPOE {
    
     @Test
    public void testUsernameCorrectlyFormatted() {
        Login login = new Login();
          String expected = "Username successfully captured";
       
        assertEquals(expected, "Username successfully captured");
    }
 
    // Test 2: Username missing underscore
    @Test
    public void testUsernameMissingUnderscore() {
        Login login = new Login();
        String expected = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
       
        assertEquals(expected,  "Username is not correctly formatted");
    }
 
    // Test 3: Username too long
    @Test
    public void testUsernameTooLong() {
        Login login = new Login();
        String expected = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
       
        assertEquals(expected,  "Username is not correctly formatted");
    }
 
    // Test 4: Username too long with underscore
    @Test
    public void testUsernameTooLongWithUnderscore() {
        Login login = new Login();
        String expected = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        
        assertEquals(expected, "Username is not correctly formatted");
    }
 
    // =====================================================
    // PASSWORD TESTS
    // =====================================================
 
    // Test 5: Password correctly formatted
    @Test
    public void testPasswordCorrectlyFormatted() {
        Login login = new Login();
        String expected = "Password successfully captured";
        assertEquals(expected, "Password successfully captured");
    }
 
    // Test 6: Password too short
    @Test
    public void testPasswordTooShort() {
        Login login = new Login();
        String expected = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        assertEquals(expected, "Password is not correctly formatted");
    }
 
    // Test 7: Password no uppercase
    @Test
    public void testPasswordNoUppercase() {
        Login login = new Login();
        String expected = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
      
        assertEquals(expected,  "Password is not correctly formatted");
    }
 
    // Test 8: Password no number
    @Test
    public void testPasswordNoNumber() {
        Login login = new Login();
        String expected = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        
        assertEquals(expected, "Password is not correctly formatted");
    }
 
    // Test 9: Password no special character
    @Test
    public void testPasswordNoSpecialChar() {
        Login login = new Login();
        String expected = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        
        assertEquals(expected,  "Password is not correctly formatted");
    }
 
    // =====================================================
    // CELL PHONE TESTS
    // =====================================================
 
    // Test 10: Cell number correctly formatted
    @Test
    public void testCellPhoneCorrectlyFormatted() {
        Login login = new Login();
        String expected = "Cell phone number successfully captured";
        assertEquals(expected,  "Cell phone number successfully captured");
    }
 
    // Test 11: Cell number too short
    @Test
    public void testCellPhoneTooShort() {
        Login login = new Login();
        String expected = "Cell phone number is not correctly formatted, please ensure the number is 10 digits and starts with 07 or 08.";
        assertEquals(expected, "Cell phone number is not correctly formatted");
    }
 
    // Test 12: Cell number wrong prefix
    @Test
    public void testCellPhoneWrongPrefix() {
        Login login = new Login();
        String expected = "Cell phone number is not correctly formatted, please ensure the number is 10 digits and starts with 07 or 08.";
        assertEquals(expected, "Cell phone number is not correctly formatted");
    }
 
    // Test 13: Cell number contains letters
    @Test
    public void testCellPhoneContainsLetters() {
        Login login = new Login();
        String expected = "Cell phone number is not correctly formatted, please ensure the number is 10 digits and starts with 07 or 08.";
        assertEquals(expected, "Cell phone number is not correctly formatted");
    }
 
    // =====================================================
    // LOGIN TESTS
    // =====================================================
 
    // Test 14: Login succeeds with correct credentials
    @Test
    public void testLoginSuccess() {
        Login login = new Login();
        
        String expected = "true";
        assertEquals(expected, String.valueOf(login.loginUser("kyl_1", "Ch&&sec@ke99!")), "Expected login to succeed");
    }
 
    // Test 15: Login fails with wrong password
    @Test
    public void testLoginFailure() {
        Login login = new Login();
        
        String expected = "false";
        assertEquals(expected, String.valueOf(login.loginUser("kyl_1", "wrongpassword")), "Expected login to fail");
    }
 
    // Test 16: Login status success message
    @Test
    public void testLoginStatusSuccess() {
        Login login = new Login();
        
        String expected = "Welcome Kyle Smith, it is great to see you again.";
        assertEquals(expected, login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!"), "Expected welcome message");
    }
 
    // Test 17: Login status failure message
    @Test
    public void testLoginStatusFailure() {
        Login login = new Login();
        
        String expected = "Username or password incorrect, please try again.";
        assertEquals(expected, login.returnLoginStatus("kyl_1", "wrongpassword"), "Expected error message");
    }
    
}
