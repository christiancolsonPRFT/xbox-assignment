package xboxbasepages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxGamertagHomePage extends Page {
	
	
//	@FindBy(className = "list-title fz-l")
//	public WebElement pageLoad;
	
//	@FindBy(className = "Grid-U App-Title")
//	public WebElement pageLoad_symbol_failure;
//	
//	@FindBy(className = "My(0) Fz(15px) D(ib) Fw(b)")
//	public WebElement pageLoad_goofy;
	
	@FindBy(xpath = ".//a[@href='/leaderboards']")
	public WebElement leaderboard;
	
	@FindBy(xpath = ".//input[@placeholder='Enter a gamertag to lookup']")
	public WebElement gamertagSearch;
	

	
	public XboxGamertagHomePage open() throws Exception {
		// read the URL from property file
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("xbox.baseURL");
		TestCaseBase.threadDriver.get().navigate().to(URL);

		return this;
	}
	
	//goto leader board in page
	
		public XboxGamertagLeaderboardPage gotoLeaderboard() throws Exception {
			Waiting.until(leaderboard);
			leaderboard.click();
			
			return new XboxGamertagLeaderboardPage();
		}
		
	
		
		public XboxGamertagGamerPage gotoGamertagPage() throws Exception {
			Properties PROPERTIES_RESOURCES = SystemUtil
					.loadPropertiesResources("/testdata_xbox.properties");
			String gamertag = PROPERTIES_RESOURCES.getProperty("xbox.gamertag");
			Waiting.until(gamertagSearch);
			gamertagSearch.sendKeys(gamertag + Keys.ENTER);
			
			return new XboxGamertagGamerPage();
			
		}
		
		
		
	
}
