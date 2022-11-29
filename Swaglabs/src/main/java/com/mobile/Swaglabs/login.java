package com.mobile.Swaglabs;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
// import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class login {
	static AppiumDriver driver;	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "33"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel_6_pro");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");



		capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
		//This package name of your app (you can get it from apk info app)
			capabilities.setCapability("appActivity","com.swaglabsmobileapp.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create WebDriver instance and connect to the Appium server


		//capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		//capabilities.setCapability("appActivity","com.amazon.mShop.android.shopping.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)

		driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']")).click();

		System.out.println("I'm on login page");

		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc='test-Item'])[1]/android.view.ViewGroup/android.widget.ImageView")).click();
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='test-ADD TO CART']")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.TextView")).click();
	}

}
