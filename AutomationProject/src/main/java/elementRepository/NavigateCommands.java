package elementRepository;

public class NavigateCommands extends BaseClass{
	
	public void navigatecommands()
	{
		driver.navigate().to("https://www.amazon.in/");//Browser navigate commands
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		
		NavigateCommands obj=new NavigateCommands();
		obj.initializebrowser();
		obj.navigatecommands();
		obj.driverQuitClose();
		
	}

}
