package week1.day2;


//This program is created to use the functions of another class called "Browser"
public class EdgeBrowser {

	public static void main(String[] args) {
		
		//object created to access the class Browser which is from another java class
		Browser b=new Browser();
		
		//this function prints the browser name
		System.out.println(b.launchBrowser("Safari"));
		
		//this function prints the string content
		System.out.println(b.loadUrl());
		
		
		
	}

}
