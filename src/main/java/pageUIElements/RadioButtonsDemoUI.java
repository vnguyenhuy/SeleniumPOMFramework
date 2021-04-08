package pageUIElements;


public class RadioButtonsDemoUI {
	public static final String expectedTextMaleRadioButton = "Radio button 'Male' is checked";
	public static final String expectedTextFeMaleRadioButton = "Radio button 'Female' is checked";
	public static final String expectedTextMaleGroupRadioButton = "Sex : Male\nAge group: 5 - 15";
	
	public static final String radioButtonsDemo = "//*[text()='Input Forms']//following::a[text() = 'Radio Buttons Demo']";
	public static final String maleRadioButton = "//div[text() = 'Radio Button Demo']//following::input[@value='Male'][1]";
	public static final String femaleRadioButton = "//div[text() = 'Radio Button Demo']//following::input[@value='Female'][1]";
	public static final String btnCheck = "//button[@id = 'buttoncheck']";		
	public static final String maleGroupRadioButton = "//div[text() = 'Group Radio Buttons Demo']//following::input[@value='Male']";
	public static final String femaleGroupRadioButton = "//div[text() = 'Group Radio Buttons Demo']//following::input[@value='Female']";
	public static final String ageGroup1 = "//h4[text()='Age Group : ']//following::input[1]";
	public static final String ageGroup2 = "//h4[text()='Age Group : ']//following::input[2]";
	public static final String ageGroup3 = "//h4[text()='Age Group : ']//following::input[3]";
	public static final String textRadioButton = "//p[@class = 'radiobutton']";
	public static final String textGroupRadioButton = "//p[@class='groupradiobutton']";		
}
