package nested_classes.anonymous_inner_class.using_interface;

/*4.Develop a logging system using an interface Logger that has a method log(String message). 
Implement this interface with non-static inner classes in an outer class called LoggerApp for different 
logging strategies, such as ConsoleLogger and FileLogger. The outer class should provide a method to log 
messages using both strategies, displaying the output to the console.*/
interface Logger {
	public void log(String message);
}

public class LoggerApp {

	class ConsoleLogger implements Logger {
		public void log(String message) {
			System.out.println(message);
		}
	}

	class FileLogger implements Logger {
		public void log(String message) {
			System.out.println(message);

		}
	}

	public static void main(String[] args) {
		LoggerApp la=new LoggerApp();
		LoggerApp.ConsoleLogger cl=la.new ConsoleLogger();
		LoggerApp.FileLogger fl=la.new FileLogger();
		
		cl.log("Login Sucessfull");
		fl.log("Login Sucessfull");

	}

}
