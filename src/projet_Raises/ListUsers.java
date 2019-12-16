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

        if(firstName.equals(userList) && lastName.equals(userList)){
            return true;
        }
         return false;
    }

}