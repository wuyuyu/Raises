package projet_Raises;

import java.io.*;
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
            String toStringUser;
            String toStringItems;
            String toStringRaises;
            for(User user: listUsers){
                toStringUser = user.toString();
                myWriter.write(toStringUser);
                myWriter.write("\n");
            }
            for(Items items: listItems){
                toStringItems = items.toString();
                myWriter.write(toStringItems);
                myWriter.write("\n");
            }
            for(Raises raises: listRaises){
                toStringRaises = raises.toString();
                myWriter.write(toStringRaises);
                myWriter.write("\n");
            }

            myWriter.close();
            System.out.println("All data has been successfully save to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void restore(List<User> listUsers, List<Items> listItems, List<Raises> listRaises){

        // lire les 3 fichiers


        String fichier ="save.txt";


            //lecture du fichier texte
            try{

                BufferedReader br = new BufferedReader(new FileReader(fichier));
                String line;
                while ((line = br.readLine())!=null){
                    if(fichier.startsWith("User")){
                        String[] st = line.split( ", ");
                        System.out.println("Nom = "+st[1]);
                    }


                    if (line.split())
                    {

                    }
                    chaine+=ligne+"\n";
                }
                br.close();
            }
            catch (Exception e){
                System.out.println(e.toString());
            }

            /*
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                while (data.startsWith("user")){
                    data.v

                    if(data.startsWith("firstName='")){
                        listUsers.add()
                    }


                }

                System.out.println(data);
            }

             */
            /*
            try {
                File f = new File("save.txt");
                Scanner myReader = new Scanner(f);
                myReader.close();
        } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

             */

        // add dans les lists


    }



}
