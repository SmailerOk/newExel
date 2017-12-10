package exel;

import java.io.*;
import java.util.ArrayList;

public class FileWorker {
//    public static ArrayList<String> newRead (String fileName) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(fileName));
//        ArrayList<String> arrayString = new ArrayList<String>();
//        String line = null;
//        while ((line = reader.readLine()) != null) {
//            arrayString.add(line);
//        }
//        reader.close();
//        return arrayString;
//
//    }

    public static void write(String fileName, String text){
        File file = new File(fileName);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.println(text);
            } finally {
                out.close();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<ArrayList<String>> newReadWithArrayList (String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
        ArrayList<String> inner = new ArrayList<String>();
        String line = null;
        
        while ((line = reader.readLine()) != null) {
            inner.add(line.split(" ")[0]);
            outer.add(inner);
        }
        reader.close();
        return outer;
    }
}
