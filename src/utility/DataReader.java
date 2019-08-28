package utility;

import java.io.*;
import java.util.Scanner;

public class DataReader {
    public static void main(String[] args) throws FileNotFoundException {
        String text;
        String a= null;
        File file = new File("D:\\CoreJava\\src\\utility\\information.txt");


//        try {
//            FileReader reader = new FileReader(file);
//            BufferedReader buf = new BufferedReader(reader);
//            String x= buf.readLine();
//
//            while (x!=null){
//                System.out.println(x);
//                x=buf.readLine();
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }


    }
    }

