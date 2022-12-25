package com.bridgelabz.lamdafunction;

	import org.junit.Assert;
	import org.junit.Test;

	public class UserInputValidationTest {
		@Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserInputValidationTest userInputValidationTest = new UserInputValidationTest();
	        boolean result = userInputValidationTest.isValidFirstName("Krishna");
	        Assert.assertEquals(true, result);
	    }
	    private boolean isValidFirstName(String string) {
			// TODO Auto-generated method stub
			return false;
		}
		@Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse() {
	        UserInputValidationTest userInputValidationTest = new UserInputValidationTest();
	        boolean result = userInputValidationTest.isValidFirstName("Kr");
	        Assert.assertEquals(false, result);
	    }
	}

