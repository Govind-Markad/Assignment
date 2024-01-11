package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//Test Case 2: Verify Search Functionality
//Objective: To ensure that the search functionality returns relevant results.

public class SearchFunctionality {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"D://Atomation Testing Project//edgedriver_win64//msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
// Step 1 : Navigate to Amazon
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
// Step 2 :  Find the search input field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rich Dad Poor Dad Boook");
// Step 3: Click on the search icon or press Enter
		driver.findElement(By.id("nav-search-submit-button")).click();

// Step 4:  Verify that the search results page is displayed
		String pageTitle = driver.getTitle();

		System.out.println("Title of Page is : " + pageTitle);

		if (pageTitle.contains("Amazon.com : Rich Dad Poor Dad")) {
			System.out.println("Test is passed");

		} else {
			System.out.println("Test is Failed");
		}

		driver.close();

	}

}
