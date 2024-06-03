public class Main {

    public static void main(String[] args) {

        Image image = new Image("hello.psdss", 200, 100);

        System.out.println("Known file type: " + image.isKnownFileType());
        System.out.println("Is Portrait: " + image.isPortrait());
        System.out.println("Is Landscape: " + image.isLandscape());


    }

}
