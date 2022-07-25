package com.fluex404.java7;


import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        // Using try-with-resources
        try(FileOutputStream fileOutputStream = new FileOutputStream("/home/fluex404/Downloads/abc.txt")){
            String msg = "Hallo World";
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfuly!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // using mutiple resources
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("/home/fluex404/Downloads/abc.txt");
                InputStream inputStream = new FileInputStream("/home/fluex404/Downloads/abc.txt")
        ) {

            String msg = "Hallo World!";
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);

            System.out.println("------------Data Written into file-----------");
            System.out.println(msg);

            // creating input Stream instance
            DataInputStream inst = new DataInputStream(inputStream);
            int data = inputStream.available();
            // returns an  estimate of the number of bytes that can be read from this input stream
            byte[] byteArray2 = new byte[data];
            inst.read(byteArray2);
            String str = new String(byteArray2);// pasing byte array into String constructor
            System.out.println("--------------Data read from file--------------");
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
