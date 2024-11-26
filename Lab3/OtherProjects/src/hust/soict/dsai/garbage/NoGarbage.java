package hust.soict.dsai.garbage;

import java.io.*;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        try {
            // Đọc tệp "largefile.txt" sử dụng StringBuffer để nối chuỗi
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\longn\\OneDrive\\Máy tính\\JAVA_\\Lab3\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test.txt");
            int content;
            while ((content = fileInputStream.read()) != -1) {
                sb.append((char) content);
            }
            fileInputStream.close();
            // Chuyển StringBuffer thành String cuối cùng
            String result = sb.toString();
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}