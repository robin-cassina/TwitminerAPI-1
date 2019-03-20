import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class csvWriter {


    public static void writer(String line) {


    try {
        CSVWriter writer = new CSVWriter(new FileWriter("marseille.csv"), ';');
        String[] tweet = (line);//.split(" ")
        writer.writeNext(tweet);
        writer.close();
    }

    catch (IOException e) {
        e.printStackTrace();
    }

    }

}
