package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser c = new Browser();
		c.launchBrowser("Edge");
		String url = c.loadUrl();
		System.out.println(url);

	}

}
