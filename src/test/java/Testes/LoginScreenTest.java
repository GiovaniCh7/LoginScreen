/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testes;

import Classes.LoginScreenn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pichau
 */
public class LoginScreenTest {
    @Test
        public void testSuccesfullLogin(){
        LoginScreenn loginScreen = new LoginScreenn();
        assertTrue(loginScreen.login("john", "password123"));
        }
        
        @Test
        public void testFailedLogin(){
        LoginScreenn loginScreen = new LoginScreenn();
        assertFalse(loginScreen.login("john", "wrongpassword"));
        }
        
        @Test
        public void testAddLogin(){
        LoginScreenn loginScreen = new LoginScreenn();
        loginScreen.addUser("testuser","testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
        }
    
}