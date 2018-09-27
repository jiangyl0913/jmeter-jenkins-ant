package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;
import testData.Baiduinfo;

public class BaiduLoginPage extends BasePage{

	public BaiduLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
@FindBy(xpath="//*[@id=\"u1\"]/a[7]")

WebElement login_in;
	
@FindBy(xpath="//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")

WebElement use_account;

@FindBy(xpath="//*[@id=\"TANGRAM__PSP_10__userName\"]")
WebElement login_account;

@FindBy(xpath="//*[@id=\"TANGRAM__PSP_10__password\"]")
WebElement login_password;

@FindBy(xpath="[@xpath=\"TANGRAM__PSP_10__submit\"]")
WebElement login_button;
//*
/*
 * 登录
 */
public void login() {
	verifyElementIsPresent(login_in);
	click(login_in);
	click(use_account);
	clean(login_account);
	type(login_account, Baiduinfo.baidu_account);
	type(login_password, Baiduinfo.baidu_password);
	click(login_button);
	
}

}
