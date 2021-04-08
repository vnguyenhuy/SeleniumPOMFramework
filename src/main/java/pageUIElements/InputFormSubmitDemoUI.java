package pageUIElements;


public class InputFormSubmitDemoUI {

	public static final String inputFormSubmit = "//*[text()='Input Forms']//following::a[text() = 'Input Form Submit']";
	public static final String textFirstName = "//input[@name='first_name']";
	public static final String textLastName = "//input[@name='last_name']";
	public static final String textEmail = "//input[@name='email']";
	public static final String textPhone = "//input[@name='phone']";
	public static final String textAddress = "//input[@name='address']";
	public static final String textCity = "//input[@name='city']";
	public static final String textZipCode = "//input[@name='zip']";
	public static final String textWebsite = "//input[@name='website']";
	public static final String hostingYesOption = "//input[@name='hosting' and @value='yes']";
	public static final String hostingNoOption = "//input[@name='hosting' and @value='no']";
	public static final String textAreaComment = "//textarea[@name='comment']";
	public static final String dropListState = "//select[@name='state']";
	public static final String itemState = "";	
	public static final String btnSend = "//button[contains(text(), 'Send')]";										  
}
