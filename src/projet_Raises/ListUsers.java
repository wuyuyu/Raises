package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class ListUsers {

    /*
    public ListUsers() {
        List<User> listUsers;
        listUsers.add();

    }

     */



    public static boolean isUserExist(String firstName, String lastName, List<User> userList){

        for (User user: userList){
            if(user.getFirstName().equals(firstName) && user.getName().equals(lastName)){
                return true;
            }
        }

         return false;
    }

}