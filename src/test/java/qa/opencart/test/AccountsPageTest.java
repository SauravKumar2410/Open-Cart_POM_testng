package qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import qa.opencart.base.BaseTest;
import qa.opencart.constants.Constants;

public class AccountsPageTest extends BaseTest{
	
	
	@Test
	public void Accountspagetitletest()
	{
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

}
