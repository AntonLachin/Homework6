package homework10;

import java.io.*;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {
        File file1 = new File("files/homework10.txt");
        File file2 = new File("files/text.txt");
        File file3 = new File("files/TEST.txt");

        Methods.fileToList(file1);

        Methods.addStringToFile(file1, " OOOGA!!!");

        Methods.concatenateFiles(file1,file2,"TryToCreate");

        Methods.changeToDollar(file3,"SWAG","$");
    }
}
