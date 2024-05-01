package week1.day2;

public class BrowserMethod {
	
	public String launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser Launched successfully");
		return browserName;

	}
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		BrowserMethod obj = new BrowserMethod();
	System.out.println(obj.launchBrowser("Chrome"));
	obj.loadUrl();
	}
}
