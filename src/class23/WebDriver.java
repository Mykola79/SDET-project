package class23;

public class WebDriver {

    public void startBrowser() {
        System.out.println("starting the browser");
    }
    public void openURL() {
        System.out.println("checking url");
    }
    public void testLoginPage() {
        System.out.println("checking if login page works");
    }
    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}


class Chrome extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Staring Google Chrome");
    }
    @Override
    public void openURL() {
        System.out.println("Opening the url in Google Chrome");
    }
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}


        class FireFox extends WebDriver {
        @Override
        public void startBrowser() {
            System.out.println("Staring FireFox FireFox");
        }
        @Override
        public void openURL() {
            System.out.println("Opening the url in FireFox");
        }
        @Override
        public void testLoginPage() {
            System.out.println("Testing the login page in FireFox");
        }
        @Override
        public void closeBrowser() {
            System.out.println("Closing the FireFox");
        }
    }


            class Safari extends WebDriver{
            @Override
            public void startBrowser() {
                System.out.println("Staring Safari");
            }
            @Override
            public void openURL() {
                System.out.println("Opening the url in Safari");
            }
            @Override
            public void testLoginPage() {
                System.out.println("Testing the login page in Safari");
            }
            @Override
            public void closeBrowser() {
                System.out.println("Closing the Safari");
            }



            public static void main(String[] args) {

        Chrome googleChrome = new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();


        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();


        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();


        WebDriver browsers[] = {new Chrome(), new FireFox(), new Safari()};

        for (WebDriver browserNames : browsers) {
            browserNames.startBrowser();
            browserNames.openURL();
            browserNames.testLoginPage();
            browserNames.closeBrowser();
        }
    }
}


