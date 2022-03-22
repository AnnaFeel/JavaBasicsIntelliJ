package com.syntax.class24;

public class BrowserTester {

    public static void main(String[] args) {
     /*   GoogleChrome chrome=new GoogleChrome();   That would be a very long way of executing this code
        chrome.openBrowser();                       instead, we would be using array below
        chrome.loadPage("www.google.com");
        chrome.testThePage();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.openBrowser();
        fireFox.loadPage("www.google.com");
        fireFox.testThePage();
        fireFox.closeBrowser();
        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage("www.google.com");
        safari.testThePage();
        safari.closeBrowser();
        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage("www.google.com");
        ie.testThePage();
        ie.closeBrowser();*/

        Browser[] br = {new GoogleChrome(), new FireFox(), new Safari(), new IE()};

        for (Browser b : br) {
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }

        // break till 11:45


    }
}

