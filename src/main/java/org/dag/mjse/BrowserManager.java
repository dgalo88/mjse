package org.dag.mjse;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserManager {

	private RemoteWebDriver browser;

	public BrowserManager() {
		// TODO Auto-generated constructor stub
	}

	public RemoteWebDriver getBrowser() {
		return browser;
	}

	public void setBrowser(RemoteWebDriver browser) {
		this.browser = browser;
	}

}
