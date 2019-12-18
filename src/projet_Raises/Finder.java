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


    public static boolean isUserExistInRaisesList(String firstName, String lastName, List<Raises> listRaise) {
        for(Raises raises: listRaise){
            if(raises.getFirstName().equals(firstName) && raises.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }


    /**
     * !!!!!!!!!!!!!!!!!
     * ça ne marche pas!!!!!
     * @param ref
     * @param listItems
     * @param listRaises
     * @return
     */
    public static boolean isTheItemExistWithRefInListRaise(String ref,List<Items> listItems,List<Raises> listRaises){

        for(Raises raises: listRaises) // parcourir dans la liste raises
            if(raises.getRef().equals(ref)){ // la referene trouvé dans la liste raises
                for(Items itemsFound: listItems){
                    if(itemsFound.getReference().equals(ref)){
                        return true;
                    }
                }
            }
        return false;
    }
    public static Items findTheItemExistWithRefInListRaise(String ref, List<Items> listItems,List<Raises> listRaises) {
        Items items = null;
        for(Raises raises: listRaises) // parcourir dans la liste raises
            if(raises.getRef().equals(ref)){ // la referene trouvé dans la liste raises
               for(Items itemsFound: listItems){
                   if(itemsFound.getReference().equals(ref)){
                       items = itemsFound;
                   }
               }
            }
        return items;
    }

    public static Raises finTheRaiseInListRaise(String ref,List<Raises> listRaises) {
        Raises r = null;
        for(Raises raises: listRaises){
            if(raises.getRef().equals(ref)){
                r = raises;
            }
        }
        return r;
    }
}