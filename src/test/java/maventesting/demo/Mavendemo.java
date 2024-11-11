package maventesting.demo;

public class Mavendemo {
	@Test
	public void setup() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
	}

}
