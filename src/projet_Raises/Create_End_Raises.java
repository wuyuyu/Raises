package projet_Raises;


import java.util.List;
import java.util.Scanner;

public class Create_End_Raises {


    public static void createAddRaises (List<User> listUsers, List<Items> listItems,List<Raises> listRaises){
        try {
            System.out.println("Enter your first name: ");
            Scanner sc = new Scanner(System.in);
            String firstName = sc.nextLine();
            System.out.println("Enter your last name: ");
            Scanner s = new Scanner(System.in);
            String lastName = s.nextLine();
            System.out.println("Enter the reference of your item : ");
            Scanner scan = new Scanner(System.in);
            String ref = scan.nextLine();
            System.out.println("Enter the date of purchase: ");
            Scanner ct = new Scanner(System.in);
            String db = ct.nextLine();

            /*
            //- si la référence de l'objet n'existe pas on affiche une erreur.
            for (Items items : listItems) {
                if (!items.getReference().equals(ref)) {
                    System.out.println("Error: the item is not exist, please try again.");
                }
            }
            // - si l'objet est deja en cours d'utilisation, c'est à dire dans une entrée de la troisème table mais avec une date
            // de rendu / date d'arrivée / date de fin non remplie, alors on affiche une erreur.
            for (Raises raises : listRaises) {
                if (raises.getRef().equals(ref)) {
                    System.out.println("Error: the item is not available, please try again.");
                }
            }

             */

            //- si l'utilisateur n'existe pas on affiche une erreur.
            if(!Finder.isUserExist(firstName, lastName, listUsers)){
                System.out.println("Error: the user do't exist, please try again.");
            }
            else{
                for(Items items :listItems){
                    for(Raises raises : listRaises){
                        if (!items.getReference().equals(ref)) {
                            System.out.println("Error: the item is not exist, please try again.");
                        }
                        if(raises.getRef().equals(ref)) {
                            System.out.println("Error: the item is not available, please try again.");
                        }
                        break;
                    }
                }
                Raises raiseCreated = new Raises(firstName,lastName,ref,db,"unpaid");
                listRaises.add(raiseCreated);
                System.out.println("First name: " + firstName + ", " + "Last name: " + lastName + ", " + "Reference: " + ref + ", " + "Date buy: " + db);

            }

        } catch (Exception e) {
            System.out.println("Error.");
            e.getMessage();
        }

    }

    /**
     * - cette commande prend en paramètre la référence d'un objet
     * - si cette référence n'existe pas dans la troisième table , alors on affiche une erreur
     * - si cet objet n'est pas dans une entrée en cours, on affiche une erreur
     * - si cet objet est actuellement dans une entrée en cours, alors on met a jour la date de fin (mettre une date aléatoire
     * mais qui soit supérieure à la date départ)
     * - afficher le récapitulatif de l'entrée (nom, prénom de l'utilisateur, ref de l'objet, date de debut, date de fin)
     * @param listRaises
     */
    /*
    public static void endRaise(List<Raises> listRaises) {
        Scanner s = new Scanner(System.in);
        String ref = s.nextLine();
        if(Finder.finTheRaiseInListRaise(ref,listRaises)!=null){
            if(){

            }
        }else {
            System.out.println("The reference did't exist in the raises list.");
        }


    }

     */
}
