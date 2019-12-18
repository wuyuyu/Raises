package projet_Raises;


import java.util.List;
import java.util.Scanner;

public class Create_Remove_Raises {


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



            //- si l'utilisateur n'existe pas on affiche une erreur.
            if(!Finder.isUserExist(firstName, lastName, listUsers)){
                System.out.println("Error: the user do't exist, please try again.");
            }
            else{
                //- si la référence de l'objet n'existe pas on affiche une erreur.
                for (Items items : listItems) {
                    if (!items.getReference().equals(ref)) {
                        System.out.println("Error: the item is not exist, please try again.");
                        break;
                    }
                }
                // - si l'objet est deja en cours d'utilisation, c'est à dire dans une entrée de la troisème table mais avec une date
                // de rendu / date d'arrivée / date de fin non remplie, alors on affiche une erreur.
                for (Raises raises : listRaises) {
                    if (raises.getRef().equals(ref)) {
                        System.out.println("Error: the item is not available, please try again.");
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

}
