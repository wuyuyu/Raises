package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Finder {
    /**
     *
     * @param firstName
     * @param lastName
     * @param userList
     * @return
     */

    public static boolean isUserExist(String firstName, String lastName, List<User> userList){
        for (User user: userList){
            if(user.getFirstName().equals(firstName) && user.getName().equals(lastName)){
                return true;
            }
        }
         return false;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param userList
     * @return
     */

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
     *the command first searches if the object reference is present in the third table
     * @param reference
     * @param listRaises
     * @return
     */
    public static boolean isReferenceExistInListRaises(String reference, List<Raises> listRaises) {

        for (Raises raises : listRaises) {
            if (raises.getRef().equals(reference)) {
                return true;

            }
        }return false;
    }

    /**
     *
     * @param firstName user's first name
     * @param lastName user's last name
     * @param listRaise
     * @return true or false
     */
    public static boolean isUserExistInRaisesList(String firstName, String lastName, List<Raises> listRaise) {
        for(Raises raises: listRaise){
            if(raises.getFirstName().equals(firstName) && raises.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    /**
     * find a raise in list raises
     * @param ref with a reference we can find it in list raises
     * @param listRaises
     * @return a raise
     */

    public static Raises findTheRaiseInListRaise(String ref, List<Raises> listRaises) {
        Raises r = null;
        for(Raises raises: listRaises){
            if(raises.getRef().equals(ref)){
                r = raises;
            }
        }
        return r;
    }
}