import java.io.BufferedReader;
import java.io.FileReader;

public class User {



    static boolean authenticateUser(String username, String password){

        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\123\\user.txt"))){
        String line2;
        while((line2 = reader.readLine()) != null){
            String[] parts2 = line2.split(":");
            if(parts2.length == 2){
                String fileUsername = parts2[0];
                String filePassword = parts2[1];

                if (fileUsername.equals(username) && filePassword.equals(password)){

                    return true;
                }
            }



        }



    }catch(Exception e){
        System.out.println(e);



    }
    return false;




}


}
