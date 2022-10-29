import java.io.*;
import java.util.ArrayList;
public class PersonIOUtil {
        public static void writePersons (String fileName, ArrayList<Person> persons){
        try (FileWriter writer = new FileWriter(fileName)) {
                  for (Person a : persons){
                          writer.write(a.toString());
                          writer.write(System.getProperty("line.separator"));
                  }
                  writer.flush();
                        } catch (IOException e) {
                    e.printStackTrace();
            }
        }
       public static void readPersons (String fileName) throws EmptySourceFileException {
           try (BufferedReader reader = new BufferedReader(new FileReader("Test.txt"))) {
               String a;
                while ((a = reader.readLine()) != null){
                    System.out.println(a);
                }
           } catch (IOException e) {
               throw new EmptySourceFileException("Файл не найден");
             }
       }
}