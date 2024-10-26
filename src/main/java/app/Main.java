package app;

import java.util.Scanner;

public class Main {
    private final static String BASE_PATH = "files/";

    private final static String BASE_PATH = "files/";
    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile";
        String fileContent = "My very important information.";
        String result = handler.writeFile(fileName, fileContent);
        String content = handler.readFile(BASE_PATH + fileName + ".txt");
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
//INTERACTIVE :)
//    public static void main(String[] args) {
//        FileHandler handler = new FileHandler();
//        System.out.println("Enter name of file");
//        Scanner scanName = new Scanner(System.in);
//        String fileName = scanName.nextLine();
//        System.out.println("Enter content of file");
//        Scanner scanContent = new Scanner(System.in);
//        String fileContent = scanContent.nextLine();
//        String result = handler.writeFile(fileName, fileContent);
//        String content = handler.readFile(BASE_PATH + fileName + ".txt");
//        getOutput("RESULT: " + result);
//        getOutput("FILE CONTENT: " + content);
//    }
//    private static void getOutput(String output) {
//        System.out.println(output);
//    }
}