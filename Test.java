import java.io.FileWriter;
import java.io.IOException;
 

public class Test {
    public static void main(String[] args) {


        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //String stringToConvert = "0xFF";
        //System.out.println("--> " + Integer.decode(stringToConvert).byteValue());

        //convertStringToHex(stringToConvert);
    }

    private static void convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }

        System.out.println("Converted Hex from String: "+stringBuilder.toString());
    }
}