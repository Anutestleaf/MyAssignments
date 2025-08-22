package week1.day2;

public class Browser {

		String launchBrowser(String browserName) // function to print any browser name
		{
			return browserName;
		}
		
		String loadUrl() //function to print the string sentences
		{
			
			return "Url loaded successfully";
		}
		

		public static void main(String[] args) {
			Browser br=new Browser(); //creating object br to access the above methods
		
			
			//initialized name and using to get the value.
			String name=br.launchBrowser("The name of the browser is:Chrome"); 
			System.out.println(name);
			
			//initialized content and printing the function value.
			String content=br.loadUrl();
			System.out.println(content);
			
		}
	
	
}

