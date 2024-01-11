package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

// Test Case 1: Successful Login with Correct Credentials
// Objective: Verify that users can successfully log in to the website using the correct credentials.

public class LoginFunctionality {
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"D://Atomation Testing Project//edgedriver_win64//msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
//	Step 1:	Navigate to the Amazon login page.
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
// Step 2 : Enter valid emailin the "Email" field.
		driver.findElement(By.id("ap_email")).sendKeys("enter enamil here");
// Step 3 : Click on the "Continue" button.
		driver.findElement(By.id("continue")).click();
// Step 4 : Enter a valid password in the "Password" field
		driver.findElement(By.id("ap_password")).sendKeys("enter passward here");
// Step 5 : Click on the "Sign-In" button.
		driver.findElement(By.id("signInSubmit")).click();

		String exptitle = driver.getTitle();
		String realtitle = "Amazon.com. Spend less. Smile more.";
//  step 6 : Verify User Login succefully and get access to welcome Page.
		if (realtitle.equals(exptitle)) {
			System.out.println("TestCase is Passed");
		} else {
			System.out.println("TestCase is failed");
		}

		driver.close();
	}

}
