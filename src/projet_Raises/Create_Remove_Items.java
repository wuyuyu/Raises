package projet_Raises;

import java.util.List;
import java.util.Scanner;

/**
 * [# 7] add item
 * add an object to the list in accordance with the second table (respectively Books, Cars, Objects, Packages, Houses, Actions)
 * the command takes all the fields described in the table above
 * the command first searches if the object reference is present in the third table, and if the object already exists an
 * error message is displayed
 * if the object reference does not exist, then we create it in a list
 */


public class Create_Remove_Items {

    private static int rarity;

    public static void createAddItem(List<Items> listItems, List<Raises> listRaise) {
        System.out.println("Add a item === Ajouter un objet");

        try {
            System.out.println("Enter the title of your object ===  Entrez le titre de votre objet: ");
            Scanner sc = new Scanner(System.in);
            String title = sc.next();
            System.out.println("Enter the reference of your object === Entrez la référence de votre objet: ");
            Scanner scan = new Scanner(System.in);
            String reference = scan.next();
            System.out.println("Enter the category of your object === Entrez le catégory de votre objet: ");
            Scanner ct = new Scanner(System.in);
            String category = ct.next();

            do{ // faire
                try{
                    // rentrer les donnees
                    System.out.println("Enter the rarity of your object (between 0 and 100) === Entrez la rareté de votre objet: ");
                    Scanner a = new Scanner(System.in);
                    String ag = a.next();
                    rarity = Integer.parseInt(ag);
                    if(rarity >= 0 && rarity <= 100){
                        // ajout a la liste
                        if (!Finder.isReferenceExistInListRaises(reference, listRaise)) { // if ref not exist
                            Items createAddItem = new Items(title, reference, category, rarity);
                            listItems.add(createAddItem);
                            System.out.println("The item has been created with success === L'objet a bien été enregistré!");
                            System.out.println(createAddItem);

                        } else { // ref of item exist in the list raises already
                            System.out.println("Error: the item is not available === Erreur: l'objet n'est plus disponible, il est déjà acheté par une autre personne.");
                        }

                    }

                }catch (NumberFormatException e){
                    System.out.println("Error: rarity is a number === Erreur: Veuillez entrez un nombre pour la rareté de votre objet. ");
                    e.getMessage();
                }

            }while (!(rarity > 0 && rarity < 100));

        }catch (Exception e) {
                e.getMessage();
            }

    }



    /**
     * [# 9] remove item
     * this command takes as a parameter the reference of the object to modify
     * this command searches for an object with the same reference entered and will delete it from the list.
     * if the object sought does not exist, then an error message is displayed stating that it cannot be found.
     * if the object exists, it is deleted from the list in memory, and a message of successful deletion is displayed.
     * if the object is used in the third table (loans, rentals, auctions, deliveries, actions, transactions), then the deletion of this object cannot be done and an error message will be displayed
    */

    public static void removeItem(List<Items> listItems, List<Raises> listRaises) {

        System.out.println("The reference of the item that you wants to delete === Entrez la référence de l'objet que vous voulez supprimer: ");
        Scanner s = new Scanner(System.in);
        String ref = s.nextLine();

        boolean isInRaisesList = false;
        for (Raises raises : listRaises) {
            if (raises.getRef().equals(ref)) {
                isInRaisesList = true;
            }
        }

        try {
            for (Items items : listItems) {
                if (items.getReference().equals(ref)) {
                    if (isInRaisesList) {
                        System.out.println("The item can't be remove because it exist in the raises list === L'objet vendu, il ne peut plus être supprimé.");
                    } else {
                        listItems.remove(items);
                        System.out.println("The item has been deleted with success === L'objet supprimé.");
                    }
                } else {
                    System.out.println("n'exsite pas dans la liste de Items === L'objet que vous avez saisie n'existe pas");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}



