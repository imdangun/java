package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		UI.in();
		// console.in();
		// browser.in();
		// Console.in();
		// Browser.in();
		
		chrome.out();
		// chrome.in();
		// Chrome.in();
		chrome.play();
		Chrome.play();
	}
}
