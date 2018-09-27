package testSuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.BrowserEngine;
import pageObjects.BaiduLoginPage;

public class TestBaiduLogin {
	
WebDriver driver;

@BeforeClass
public void setUp() throws IOException{
	
	BrowserEngine browserEngine = new BrowserEngine();
	browserEngine.initConfigData();
	driver = browserEngine.getBrowser();
	
}

@Test
public void login() {
	BaiduLoginPage bdp=PageFactory.initElements(driver, BaiduLoginPage.class);
	bdp.login();
}

}
