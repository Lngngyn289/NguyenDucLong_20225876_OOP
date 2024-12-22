package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:\\Users\\longn\\OneDrive\\Máy tính\\JAVA_\\Lab3\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test.txt"; 
        byte[] inputBytes = new byte[0]; 
        long startTime, endTime;
        
        try {
          
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();

           
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b; 
            }

            endTime = System.currentTimeMillis();
            System.out.println("Thời gian xử lý với String concatenation (sử dụng +): " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();

            StringBuffer sb = new StringBuffer();
            for (byte b : inputBytes) {
                sb.append((char) b); 
            }
            outputString = sb.toString(); // Chuyển StringBuffer thành chuỗi

            endTime = System.currentTimeMillis();
            System.out.println("Thời gian xử lý với StringBuffer: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.out.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}