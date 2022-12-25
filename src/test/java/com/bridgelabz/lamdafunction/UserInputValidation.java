package com.bridgelabz.lamdafunction;


	import org.junit.Assert;
	import org.junit.Test;


	public class UserInputValidation {
		@Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserInputValidation userInputValidationTest = new UserInputValidation();
	        boolean result = userInputValidationTest.isValidFirstName("Dipak");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = userInputValidation.isValidFirstName("Pr");
	        Assert.assertEquals(false, result);
	    }
	    private boolean isValidFirstName(String string) {
			// TODO Auto-generated method stub
			return false;
		}
		@Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = userInputValidation.isValidFirstName("bhuwan");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenLastName_WhenShort_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = userInputValidation.isValidFirstName("bh");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail_WhenValid_ShouldReturnTrue() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = userInputValidation.isValidEmail("aryabhuwan873@gmail.com");
	        Assert.assertEquals(true, result);
	    }

	    private boolean isValidEmail(String string) {
			// TODO Auto-generated method stub
			return false;
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
	        boolean result = userInputValidation.isValidMobileNumber("91 9087654321");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = userInputValidation.isValidMobileNumber("908765-4321908");
	        Assert.assertEquals(false, result);
	    }
		private boolean isValidMobileNumber(String string) {
			// TODO Auto-generated method stub
			return false;
		}
	}

