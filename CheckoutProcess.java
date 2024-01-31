package arcitecha_ssingment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckoutProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"D://Atomation Testing Project//edgedriver_win64//msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

//	Step 1:	Navigate to the Amazon login page.

		driver.get("https://www.amazon.com/");

	    driver.manage().window().maximize();


        driver.findElement(By.id("nav-link-accountList")).click();

        driver.findElement(By.id("ap_email")).sendKeys("username");

        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("ap_password")).sendKeys("password");

        driver.findElement(By.id("signInSubmit")).click();

//  Step 2: Search for products.

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rich Dad Poor Dad Boook");

        driver.findElement(By.id("nav-search-submit-button")).click();

     // Step 3:  Verify that the search results page is displayed
     		String pageTitle = driver.getTitle();

     		System.out.println("Title of Page is : " + pageTitle);

     		if (pageTitle.contains("Amazon.com : Rich Dad Poor Dad")) {
     			System.out.println("Product is Available");

     		} else {
     			System.out.println("Product is not Available");
     		}

//     		Step 4 : Product Add to Cart

     		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();

    		String price = driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]/span[2]/span")).getText();
    		System.out.println("Price of The Product is : " + price);

    		driver.findElement(By.id("add-to-cart-button")).click();
//  to verfy prodect Added in cart succesfully
    		String productAddedInCart = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
    		System.out.println(productAddedInCart );


     	}

}


