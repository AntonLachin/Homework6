package homework10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;


public class Methods {
    public static List<String> fileToList(File file) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                int i = 0;
                String[] inputS = input.split(" ");
                while (i < inputS.length) {
                    stringList.add(inputS[i] + " ");
                    i++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println(stringList);
        return stringList;
    }

    public static void addStringToFile(File file, String add) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write(add);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void concatenateFiles(File file1, File file2, String fileName) throws IOException {
        int i = 0;
        int j = 0;
//        File.createTempFile(fileName, ".txt", new File("files"));
        File fileNew = new File("files/" + fileName + ".txt");
        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        FileWriter writer = new FileWriter(fileNew, true);

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                stringList1.add(input + " ");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String input;
            while ((input = reader.readLine()) != null) {
                stringList2.add(input + " ");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        while (j < stringList2.size()) {
            if (i < stringList1.size()) {
                try {
                    writer.write(stringList1.get(i));
                    i++;
                } catch (IOException e) {
                    System.out.println("Error2");
                }
                if (i == stringList1.size()) {
                    writer.write("\n");
                }
            } else {
                try {
                    writer.write(stringList2.get(j));
                    j++;
                } catch (IOException e) {
                    System.out.println("Error3");
                }
            }
        }
        writer.flush();
        System.out.println("Длина первого файла - " + file1.length() + "\n" + "Длина второго файла - " + file2.length() + "\n" + "Длина нового файла - " + fileNew.length());
    }

    public static void changeToDollar(File file, String fileName, String symbol) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            File fileWithSwag = new File("files/" + fileName + ".txt");
            FileWriter writer = new FileWriter(fileWithSwag, true);
            String input;

            while ((input = reader.readLine()) != null) {
                String result = input.replaceAll("[^\\da-zA-Zа-яА-ЯёЁ]", Matcher.quoteReplacement(symbol));
                writer.write(result + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Error4");
        }
    }
}