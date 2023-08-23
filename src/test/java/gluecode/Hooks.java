package gluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Utils;

public class Hooks extends Utils {
	
	public static String scenarioName="";
	
	@Before
	public void beforescenerio(Scenario scenario)
	{
		scenarioName=scenario.getName();
		System.out.println("scenario Name:"+scenarioName);
		Utils.lauchBrowser();
	}
	
	@After
	public void aftersenerio()
	{
		driver.quit();
	}
	
	

}
