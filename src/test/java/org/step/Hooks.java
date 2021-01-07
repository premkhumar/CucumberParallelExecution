package org.step;

import org.base.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal{
	
	@Before
	public void beforeMethod() {
		browserLaunchChrome();
		maxWindows();
		enterUrl("https://www.amazon.in/");
		implicitWait(10);
		long thread = Thread.currentThread().getId();
		System.out.println(thread);
		
	}
	@After
	public void afterMethod() {
		driver.close();
		
	}

}
