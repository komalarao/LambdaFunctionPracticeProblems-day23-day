package com.bridgelabz.lamdafunction;

import javax.management.InvalidAttributeValueException;

import org.junit.Assert;
import org.junit.Test;

import exceptions.InvalidEmailException;
import exceptions.InvalidLastNameException;
import exceptions.InvalidMobileNumberException;
import exceptions.InvalidPasswordException;
public class UserInputValidationTest {
		@Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserInputValidationTest userInputValidation = new UserInputValidationTest();
	        boolean result = false;
	        try {
	        result = userInputValidation.isValidFirstName("bhuwan");
	        Assert.assertEquals(true, result);
	        } catch (InvalidAttributeValueException e) {
	        }
	    }
		 @Test
		    public void givenFirstName_WhenShort_ShouldThrowException() {
		        UserInputValidationTest userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		        result = userInputValidation.isValidFirstName("Pr");
		        } catch (InvalidAttributeValueException e) {
		        	Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		 }
		 @Test
		    public void givenLastName_WhenProper_ShouldReturnTrue() {
			 UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidLastName("Kasthuri");
		        } catch (InvalidAttributeValueException e) {
		            Assert.assertEquals(true, result);
		        }
		    }

		    @Test
		    public void givenLastName_WhenShort_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidLastName("ra");
		        } catch (InvalidLastNameException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenLastName_WithSplChar_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidLastName("K@sthuri");
		        } catch (InvalidLastNameException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenLastName_WithNumber_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidLastName("K23thu6i");
		        } catch (InvalidLastNameException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenEmail_WhenValid_ShouldReturnTrue() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidEmail("kpragna.25@gmail.com");
		        } catch (InvalidEmailException e) {
		            Assert.assertEquals(true, result);
		        }
		    }

		    @Test
		    public void givenEmail_WhenNotValid_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidEmail("Kpragna..675.gmail.com");
		        } catch (InvalidEmailException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidMobileNumber("9087654321");
		        } catch (InvalidMobileNumberException e) {
		            Assert.assertEquals(true, result);
		        }
		    }

		    @Test
		    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidMobileNumber("908765-4321908");
		        } catch (InvalidMobileNumberException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenPassword_WhenValid_ShouldReturnTrue() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidPassword("P@ssw0rd");
		        } catch (InvalidPasswordException e) {
		            Assert.assertEquals(true, result);
		        }
		    }

		    @Test
		    public void givenPassword_WithoutCapitalLetter_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidPassword("hgsuyds5ndj@");
		        } catch (InvalidPasswordException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidPassword("bsdj@HhcsBB");
		        } catch (InvalidPasswordException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
		    }

		    @Test
		    public void givenPassword_WithoutSplChar_ShouldThrowException() {
		    	UserInputValidationTest  userInputValidation = new UserInputValidationTest();
		        boolean result = false;
		        try {
		            result = userInputValidation.isValidPassword("Pvhs5665vhj");
		        } catch (InvalidPasswordException e) {
		            Assert.assertEquals("Please enter valid input.", e.getMessage());
		        }
	}
	}

