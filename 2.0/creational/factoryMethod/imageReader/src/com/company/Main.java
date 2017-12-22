package com.company;

public class Main {
    public static void main(String[] args) {

        DecodedImage decodedImage;
        ImageReader reader = null;

        //insert value here
        String image = "gif";

        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;

        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
