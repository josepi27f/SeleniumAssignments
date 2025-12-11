package week1.day2;


public class Browser {
    public static void launchBrowser(String browserName) {
    	System.out.println(browserName);
    }
    public static String loadUrl(){
    	return "Url loaded successfully";
    }
	public static void main(String[] args) {
		Browser b = new Browser();
		b.launchBrowser("chrome");
		String url = b.loadUrl();
		System.out.println(url);

	}

}
