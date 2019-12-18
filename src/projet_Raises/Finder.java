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


    /**
     *la commande cherche d'abord si la référence de l'objet est présente dans la troisème table, et si l'objet existe dejà error
     * @param reference
     * @param RaisesList
     * @return
     */
    public static boolean isReferenceExistInListRaises(String reference, List<Raises> listRaises) {

        for (Raises raises : listRaises) {
            if (raises.getRef().equals(reference)) {
                return true;

            }
        }return false;
    }
}