package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.InitConfig;

public class Hooks {

	public static InitConfig iniconfig = new InitConfig();
			
	@Before
    public void beforeScenario(){
		System.out.println("This will run before the Scenario");
		
		iniconfig.env = System.getProperty("envt");
		System.out.println("This will run before the Scenario");
        iniconfig.initDriver();
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        
    }
	
}
