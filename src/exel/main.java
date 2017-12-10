package exel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        String inputFile = "src/exel/input.csv";
        System.out.println(FileWorker.newReadWithArrayList(inputFile).get(0));
//        System.out.println(FileWorker.newRead(inputFile));
//        String outputFile = "src/exel/output.csv";
//        System.out.println("What do you want to change? Input line:");
//        Scanner scanner = new Scanner(System.in);
//        int lineNumber = scanner.nextInt();
//        System.out.println("Enter data for change");
//        scanner.nextLine();
//        String newInput = scanner.nextLine();
//        List<String> lines = FileWorker.newRead(inputFile);
//        lines.set(lineNumber,newInput);
//        FileWorker.write(outputFile, lines.toString());
    }
}
