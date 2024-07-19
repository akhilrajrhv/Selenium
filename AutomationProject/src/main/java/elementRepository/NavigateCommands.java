package elementRepository;

public class NavigateCommands extends BaseClass{
	
	public void navigatecommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		
		NavigateCommands obj1=new NavigateCommands();
		obj1.initializebrowser();
		obj1.navigatecommands();
		obj1.driverQuitClose();
		
	}

}
