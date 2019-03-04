

import java.io.*;

public class Convert {





public static void ConvertCSVToTrans(String file) {


    try {

        FileInputStream fileInputStream = new FileInputStream(file);
        File fileOutputStream = new File("resultat.txt");
        fileOutputStream.createNewFile();
        FileWriter fileWriter = new FileWriter(fileOutputStream);

        for (int i = fileInputStream.read(); i != -1; i = fileInputStream.read()  ) {
            fileWriter.write((char)i);
        }
        fileInputStream.close();
        fileWriter.close();

    }


    catch (FileNotFoundException e) {
        System.out.printf("Aucun fichier trouvé");
        e.printStackTrace();
    }

    catch (IOException e) {
        e.printStackTrace();
    }

}



public void ConvertTransToCSV(String file) {

}

}
