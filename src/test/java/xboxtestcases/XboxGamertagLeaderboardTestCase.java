package xboxtestcases;

import java.util.HashMap;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.CustomAssertion;
import util.TestCaseBase;
import util.TestData;
import xboxbasepages.XboxGamertagHomePage;
import xboxbasepages.XboxGamertagLeaderboardPage;

public class XboxGamertagLeaderboardTestCase extends TestCaseBase {
	
	HashMap<String, String> expectedValues = new HashMap<String, String>();
	
	@BeforeMethod
	public void loadExpectedValues() {
		expectedValues.put("rank1", TestData.get("leaderboard.rank1"));
		expectedValues.put("rank2", TestData.get("leaderboard.rank2"));
		expectedValues.put("rank3", TestData.get("leaderboard.rank3"));
		expectedValues.put("rank4", TestData.get("leaderboard.rank4"));
		expectedValues.put("rank5", TestData.get("leaderboard.rank5"));
	}
	
	@Test(groups = {"ChromeWin32"})
	public void testSearch() throws Exception {
		XboxGamertagHomePage xboxGamertagHomePage = new XboxGamertagHomePage();
		xboxGamertagHomePage.open();
		XboxGamertagLeaderboardPage leaderboard = xboxGamertagHomePage.gotoLeaderboard();
		CustomAssertion customAssertion = new CustomAssertion();
		customAssertion.equals(leaderboard.rank1.getText(), expectedValues, "rank1");
		customAssertion.equals(leaderboard.rank2.getText(), expectedValues, "rank2");
		customAssertion.equals(leaderboard.rank3.getText(), expectedValues, "rank3");
		customAssertion.equals(leaderboard.rank4.getText(), expectedValues, "rank4");
		customAssertion.equals(leaderboard.rank5.getText(), expectedValues, "rank5");
		
	}
	
}
