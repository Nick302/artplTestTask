import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        reverseLine();
    }


    //If you want, you can change the reverse method, I commented it out. Use to choose)
    public static void reverseLine() {
        String line = "";
        String newLine = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the line: ");
            line = reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        var oneThousand = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
          newLine =  new StringBuilder(line).reverse().toString();
            //newLine = reverseString(line);
        }

        System.out.println("Result: " + newLine + "\n" + (System.currentTimeMillis() - oneThousand));

        var tenThousand = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            new StringBuilder(line).reverse().toString();
            //reverseString(line);
        }

        System.out.println(System.currentTimeMillis() - tenThousand);

        var oneHundredThousand = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            new StringBuilder(line).reverse().toString();
            //reverseString(line);
        }

        System.out.println(System.currentTimeMillis() - oneHundredThousand);
    }

    public static String reverseString(String line) {
        char[] array = line.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }


}
