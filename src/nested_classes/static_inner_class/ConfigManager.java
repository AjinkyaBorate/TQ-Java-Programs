package nested_classes.static_inner_class;

/*1.Create a Java application that manages application configurations using a static inner class. 
 *Define an outer class called ConfigManager with a static inner class Config that contains configuration 
 *parameters like appName, version, and timeout. Provide methods in the outer class to set and get these 
 *configurations. Demonstrate the use of the Config class to manage application settings.*/
public class ConfigManager {
	static class Config {
		String appName;
		String version;
		int timeout;

		public Config(String appName, String version, int timeout) {
			this.appName = appName;
			this.version = version;
			this.timeout = timeout;
		}

		public String getAppName() {
			return appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public int getTimeout() {
			return timeout;
		}

		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}
	}

	public static void main(String[] args) {
		ConfigManager.Config c = new ConfigManager.Config("ABC", "1.0", 200);
		System.out.println("App Name: " + c.getAppName());
		System.out.println("Version: " + c.getVersion());
		System.out.println("Timeout: " + c.getTimeout() + "ms");
	}
}