package class24;

public class Computer {/*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods
     */
    int RAM;
    int storage;
    String OS;

    void playVideo() {
        System.out.println("Video is playing");
    }

    void browserInternet() {
        System.out.println("Browse the internet");
    }
}


    class Apple extends Computer {
        @Override
        void browserInternet() {
            System.out.println("Browsing the internet using safari");
        }

        @Override
        void playVideo() {
            System.out.println("Playing the video on quick time player");
        }

        void editVideo() {
            System.out.println("Editing on iMovies");
        }

        void installApp() {
            System.out.println("Installing the apps from App Store");
        }

    }

    class Lenovo extends Computer {
    }


    class HP extends Computer {
        @Override
        void browserInternet() {
            System.out.println("Browsing using chrome");
        }

        @Override
        void playVideo() {
            System.out.println("Playing the video using VLC player");
        }

        void installApps() {
            System.out.println("You can install any app on me");
        }
    }

    class Dell extends Computer {
    }



class Task1{
public static void main(String[] args) {

    Computer [] laptops={new Apple(), new HP()};

    for (Computer allLaptops: laptops) {
        allLaptops.browserInternet();
        allLaptops.playVideo();

        if(allLaptops instanceof Apple){Apple apple=(Apple)allLaptops;
            apple.editVideo();
            apple.installApp();
        }

    }
}

}
