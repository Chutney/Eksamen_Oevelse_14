public class Image {

    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType() {
        String fileEnd = fileName.split("\\.")[1];
        String[] endType = {"gif","jpg","jpeg","png","webp","bmp"};

        for (String fileType : endType) {
            if(fileEnd.equalsIgnoreCase(fileType)) {
                return true;
            }
        }

        return false;

    }


    public boolean isPortrait() {
        return height > width;
    }

    public boolean isLandscape() {
        return height < width;
    }

}
