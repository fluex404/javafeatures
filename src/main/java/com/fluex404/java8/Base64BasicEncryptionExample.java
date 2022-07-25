package com.fluex404.java8;


import java.util.Base64;

public class Base64BasicEncryptionExample {
    public static void main(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();

        // Creating byte array
        byte byteArr[] = {1, 2};

        // endcoding byte array
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encoded byte array : "+byteArr2);

        byte byteArr3[] = new byte[5]; // Make sure it has enough size to store copied bytes
        int x = encoder.encode(byteArr, byteArr3); // return number of byte writter
        System.out.println("Encoded byte array written to another array : "+byteArr3);
        System.out.println("Number of bytes written: "+x);

        // Encoding string
        String str = encoder.encodeToString("Isa Subani".getBytes());
        System.out.println("Encoding string: "+str);

        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();

        // Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: "+dStr);

        // Encoding URL
        String eStrURL = encoder.encodeToString("https://github.com/fluex404".getBytes());
        System.out.println("Encoded URL: "+eStrURL);

        // Decoding URL
        String dStrURL = new String(decoder.decode(eStrURL));
        System.out.println("Decoding URL: "+dStrURL);


        // Getting MIME encoder
        Base64.Encoder encoder2 = Base64.getMimeEncoder();
        String message = "Hello, \n You are informed regarding your inconsistency of work";
        String eStr2 = encoder2.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message : "+eStr2);

        // Getting MIME decoder
        Base64.Decoder decoder2 = Base64.getMimeDecoder();
        String dStr2 = new String(decoder2.decode(eStr2));
        System.out.println("Decoding message: "+dStr2);
    }
}
