package xboxbasepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Page;

public class XboxGamertagLeaderboardPage extends Page {

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[3]/a")
	public WebElement rank1;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[3]/a")
	public WebElement rank2;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[3]/a")
	public WebElement rank3;

	@FindBy(xpath = "/html/body/div[1]/div/div[4]/div/div[3]/a")
	public WebElement rank4;

	@FindBy(xpath = "/html/body/div[1]/div/div[5]/div/div[3]/a")
	public WebElement rank5;
	
}
