package com.Hooks;

import com.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Nop_Commerce_Hook  extends BaseClass{

	@Before
	public void browserLaunch() {
		
		browserLauch("chrome");
	}
	
	@After
	public void CloseBrowser() {
		terminateBrowser();
	}
}
