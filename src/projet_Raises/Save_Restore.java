package projet_Raises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Save_Restore {
    /**
     * - cette commande va sauvegarder toutes vos données liés aux utilisateurs, objets et entrées de la troisième tables sur le disque dur
     * dans des fichiers.
     * - vous êtes libres de sauvegarder un seul fichier qui contient toutes les données ou bien un fichier par donnée quelle qu'elle soit.
     * - le format des données à l'intérieur des fichiers peut etre du texte pur ou tout autre format qui vous semble plus pratique à manipuler.
     * - vous aurez un bonus sur l'évaluation si vous sauvegardez dans vos fichiers les objets RAM sérialisés (cf. sérialisation et
     * désérialisation des objets Java)
     */

    public static void save(List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {
        File f = new File("save.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File created. path= " + f.getAbsolutePath());
            }
            FileWriter myWriter = new FileWriter("save.txt");

            // lire les 3 tableaux

            myWriter.write(readTable(listUsers,listItems,listRaises));


            myWriter.close();
            System.out.println("All data has been successfully save to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void restore(List<User> listUsers, List<Items> listItems, List<Raises> listRaises){


    }

    private static void readFile(){
        // pour lire le fichier save
        try {
            File f = new File("save.txt");
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String readTable(List<User> listUsers, List<Items> listItems, List<Raises> listRaises){
        // lire les 3 tableaux et les transformer en ligne
        // parcourir les 3 table
        String tostring = null;
        for(User user: listUsers){
            System.out.println(user);
            tostring = user.toString();
        }
        String tostring1 = tostring;
        return tostring1;

    }


}
