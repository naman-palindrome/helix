package utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileExtraUtility {
    public static boolean createFile(String fileNameWithPath) {
        File file = new File(fileNameWithPath);
        boolean fileCreated = false;
        try {

            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileCreated;
    }

    public static ArrayList<String> readAndPrintFile(String fileName) {
        Scanner scanner = null;
        ArrayList<String> strings = new ArrayList<String>();
        try {

            File file = new File(fileName);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.next();
                strings.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }

        return strings;
    }

    public static boolean writeToFile(String fileNameWithPath, String content) {
        try {
            FileWriter fileWriter = new FileWriter(fileNameWithPath);
            fileWriter.append(content);
            fileWriter.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean appendToFile(String fileName, String content) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append(content);
            fileWriter.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String nameofNewFile = "C:\\Users\\91931\\IdeaProjects\\TechCodingMafia\\DATA\\PRACTICE\\FILE" + "create-file.txt";
        Boolean created = createFile(nameofNewFile);
        System.out.println("file created:" + created);
        ArrayList<String> stringArrayList = readAndPrintFile(nameofNewFile);
        for (String row : stringArrayList) {
            System.out.println("line:" + row);
        }
        System.out.println("No of lines in file:" + stringArrayList);

        String nameOfWriteFile = "C:\\Users\\91931\\IdeaProjects\\TechCodingMafia\\DATA\\PRACTICE" + "write-file.txt";
        boolean wroteToFile = writeToFile(nameOfWriteFile, "this file is generated");
        System.out.println(wroteToFile);
    }
}
