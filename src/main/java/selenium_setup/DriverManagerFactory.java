package selenium_setup;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(String browser){
        DriverManager driverManager;

        switch (browser){

            case "CHROME":{
                driverManager = new ChromeDriverManager();
            }break;
            case "FIREFOX":{
                driverManager = new FirefoxDriverManager();
            }break;
            case "EDGE":{
                driverManager = new EdgeDriverManager();
            }break;
            default:
                driverManager = new ChromeDriverManager();
        }
        return driverManager;
    }
}
