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
                System.out.println("Your raise has been create with success, detail:");
                System.out.println("First name: " + firstName + "\n " + "Last name: " + lastName + "\n " + "Reference: " + ref + "\n " + "Date buy: " + db);
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

    public static void endRaise(List<Raises> listRaises) {
        System.out.println("Enter the reference of raise that you want to pay.");
        Scanner s = new Scanner(System.in);
        String ref = s.nextLine();
        System.out.println("Enter the date the you wants to pay.");
        Scanner d = new Scanner(System.in);
        String dp = d.nextLine();
        if(Finder.finTheRaiseInListRaise(ref,listRaises)!=null){ // reference existe dans la troisième table
            if(Finder.finTheRaiseInListRaise(ref, listRaises).getDatePay().equals("unpaid")){// il faut que cette référence ne possède pas de date de fin (deuxieme check)
                Finder.finTheRaiseInListRaise(ref,listRaises).setDatePay(dp);
                System.out.println("Pay success!");
            }else {
                System.out.println("Error: the reference of the item has been paid.");
            }
        }else {
            System.out.println("Error: the reference did't exist in the raises list.");
        }
    }


}
