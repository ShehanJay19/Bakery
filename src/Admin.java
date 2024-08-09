import java.io.BufferedReader;
import java.io.FileReader;

public class Admin {
    static boolean authenticateAdmin(String username, String password){
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\123\\admin.txt"))){
           String line1;
           while((line1 = reader.readLine()) != null){
               String[] parts1 = line1.split(":");
               if(parts1.length == 2){
                   String fileUsername = parts1[0];
                   String filePassword = parts1[1];

                   if (fileUsername.equals(username) && filePassword.equals(password)){

                       return true;
                   }
               }
           }
        }
        catch(Exception e){
            System.out.println(e);
        }
               return false;
    }


public static void viweItems(){
        String Item;
        int Quantity;
        int Price;
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\123\\items.txt"))){
        String line3;
            System.out.println("Items     Quantity     Price \n");
        while((line3 = reader.readLine()) != null){
            String[] parts=line3.split(":");

                Item = parts[0];
                Quantity = Integer.parseInt(parts[1]);
                Price= Integer.parseInt(parts[2]);

                System.out.println(Item +"\t"+Quantity+"\t"+"\tRS."+Price );
        }
        }
  catch(Exception e){}







    }


public static void addItems(){









}
public static void deleteItems(){





}

}
