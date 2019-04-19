package samples;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Names {
    static String fileSeparator = System.getProperty("file.separator");
    static String absoluteFilePath = fileSeparator + "Users" + fileSeparator + "ilamparithinatarajan" + fileSeparator
            + "Documents" + fileSeparator + "names.txt";

    public static void main(String[] args) throws IOException {


        //absolute file name with path

        File file = new File(absoluteFilePath);
        if (file.createNewFile()) {
            System.out.println(absoluteFilePath + " File Created");
        }

        String pool = "ilamparithijayalakshmi";

//        List<String> babyNames = new ArrayList<>();
        Set<String> babyNames = new HashSet<>();


        int startLimit = 3;
        int endLimit = 11;

        for (int i = startLimit; i <= endLimit; i++) {
            String babyName = "";
            int tries = 0;
            do {
                for (int j = 1; j <= i; j++) {
                    babyName = babyName + selectAChar(pool);
                }
                    /*if (!babyNames.contains(babyName)) {
                        babyNames.add(babyName);
                    } else {
                        tries = tries + 1;
                    }*/

                if (!babyNames.add(babyName)) {
                    tries = tries + 1;
                }

                babyName = "";
            } while (tries < 100);

//            System.out.println("NAMES WITH "+ i + " CHARACTERS ARE : \n" + Arrays.toString(babyNames.toArray()));


//            printListToFile(babyNames);
            printListToFile(Arrays.asList(babyNames.toString()));


            /*for(String name : babyNames) {
                printStringToFile(name);
            }*/


        }
    }

    private static void printStringToFile(String data) {
        try {
            Files.write(Paths.get(absoluteFilePath), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printListToFile(List<String> data) {
        try {
            Files.write(Paths.get(absoluteFilePath), data, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static char selectAChar(String s) {

        Random random = new Random();
        int index = random.nextInt(s.length());
        return s.charAt(index);

    }
}
