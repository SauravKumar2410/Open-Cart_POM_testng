package qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.opencart.base.BaseTest;
import qa.opencart.constants.Constants;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public void accsetup()
	{
		loginpage.doLogin(Constants.username, Constants.password);
		
	}
	
	
	
	
	@Test
	public void Accountspagetitletest()
	{
		//we can call properties also.
	Assert.assertEquals(acc.getAccountspagetitle(), Constants.ACCOUNTS_PAGE_TITLE);	
	}

	
	@Test
	public void Accountspagelogotest()
	{
	acc.Accountsheader();
	}

	
	@Test
	public void Accountspagesectionheadertest()
	{
	acc.getAccountspagesectionlist();
	}
	
	
	@Test
	public void logoutlinktest()
	{
		Assert.assertTrue(acc.islogoutExist());	
	}
	
	@Test
	public void searchbartest()
	{
		acc.getsearch();
	}

}
