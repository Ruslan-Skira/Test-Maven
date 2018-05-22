import java.io.*;

public class AppMain {
    public static void main(String[] args) {
        readTestFile();
    }
    public static void readTestFile(){
        String path = "/Users/ruslanskira/Sites/Testing-Maven/src/main/java/test.csv";
        //Read the file
        File file = new File(path);
       try  (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader);) {
           String line;

           while ((line = br.readLine())!=null){
               System.out.println(line);
           }

       } catch (IOException e) {
           e.printStackTrace();
       }


    };
}
