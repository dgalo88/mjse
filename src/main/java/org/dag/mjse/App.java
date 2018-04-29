package org.dag.mjse;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/linux/chromedriver");

		RemoteWebDriver browser = new ChromeDriver();

		browser.get("http://agrega.educacion.es/visualizadorcontenidos2/Portada/Portada.do");

		System.out.println("Title = " + browser.getTitle());

		browser.quit();

	}

}
