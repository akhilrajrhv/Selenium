package elementRepository;

public class BrowserCommands extends BaseClass {
	
	public void browsercmd() {
		
		String titile=driver.getTitle(); //To get page title
		System.out.println(titile);
		
		String URL=driver.getCurrentUrl();//To get page URL
		System.out.println(URL);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);// To get page source
	}
	

	public static void main(String[] args) {
		BrowserCommands obj=new BrowserCommands();
		obj.initializebrowser();
		obj.browsercmd();
		obj.driverQuitClose();
	}	
}