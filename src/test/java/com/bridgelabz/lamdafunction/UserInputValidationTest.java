package com.bridgelabz.lamdafunction;

import org.junit.Assert;
import org.junit.Test;



public class UserInputValidationTest {
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Dipali");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Pr");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("bhuwan");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("bh");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("aryabhuwan730@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("aryabhuwan..675.gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("9087654321");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("908765-4321908");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result =userInputValidation.isValidPassword("P@ssw0rd");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("hgsuyds5ndj@");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("bsdj@HhcsBB");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutSplChar_ShouldReturnFalse() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Pvhs5665vhj");
        Assert.assertFalse( result);
    }
}


