package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Finder {

    public static boolean isUserExist(String firstName, String lastName, List<User> userList){


        for (User user: userList){
            if(user.getFirstName().equals(firstName) && user.getName().equals(lastName)){
                return true;
            }
        }
         return false;
    }

    public static User findTheUserExistInList(String firstName, String lastName, List<User> userList){
        User userFound = null;
        for(User user: userList){
            if(user.getFirstName().equals(firstName) && user.getName().equals(lastName)){
                userFound = user;
            }
        }
        return userFound;
    }

    public static Items findTheItemInList (String reference, List<Items> itemsList,List<Raises> RaisesList){
        Items item = null;
        for(Raises ){
            if(items.getReference().equals())
        }
    }
}