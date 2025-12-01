
public class DynamicXpath {

	/* Single attribute XPaths (Facebook.com)
	 1. //input[@id='email'] for Email field
	 2. //input[@id='pass']  for Password field
	 3. //button[@name='login'] for Login button
	 4. //a[@data-testid='open-registration-form-button'] to Create New Account
	 5. //img[@alt='Facebook']  facebook Logo */
	
	/* Multiple attributes with AND 
	 1. //input[@id='email' and @name='email']
	 2. //input[@id='pass' and @type='password']
	 3. //button[@name='login' and @type='submit']
	 4. //a[@role='button' and @data-testid='open-registration-form-button']
	 5. //input[@name='firstname' and @data-type='text'] */
	
	/* // c) Tag with inner text 
     1. //a[text()='Forgot password?']
     2. //button[text()='Log in']
     3. //div[text()='Birthday']
     4. //span[text()='Female']
     5. //span[text()='Male'] */
	
	/*  d) Partial inner text using contains() 
     1. //a[contains(text(),'Forgot')] -Forgot password link
     2. //button[contains(text(),'Log')]- Login button
     3. //a[contains(text(),'Create')] - Create New Account
     4. //div[contains(text(),'Birthday')]- Birthday label
     5. //span[contains(text(),'Sign')]- Any sign-up related text */
	
	
	
}
