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
            for (User user : listUsers) {
                toStringUser = user.toString();
                myWriter.write(toStringUser);
                myWriter.write("\n");
            }
            for (Items items : listItems) {
                toStringItems = items.toString();
                myWriter.write(toStringItems);
                myWriter.write("\n");
            }
            for (Raises raises : listRaises) {
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

}
/*
    public static void restore(List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {



        // lire les 3 fichiers

        //lecture du fichier texte


        try {
            File save = new File("save.txt");
            Scanner scSave = new Scanner(save);
            FileReader fr = new FileReader("save.txt");
            BufferedReader br = new BufferedReader(fr);

            while (scSave.hasNextLine()) {
                String data = scSave.nextLine();
               // System.out.println(data);
                //System.out.println(scSave.toString());

                if (data.startsWith("User")){
                    System.out.println(data);
                    String [] st = data.split(", ");
                    while (data.split(", ") == true){

                        User user = new User(st[0], st[1], st[2], Integer.parseInt(st[3]), st[4]);
                        listUsers.add(user);
                    }
                }

            }

            scSave.close();
            fr.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception eAll){
            eAll.getMessage();
        }
    }
}



                /*
                if (save.exists()) {
                    System.out.println("existe");
                    System.out.println(fr.toString().toString());
                    while (fr.toString().startsWith("User")) {
                        String[] st = fr.toString().split(", ");
                        User user = new User(st[0], st[1], st[2], Integer.parseInt(st[3]), st[4]);
                        listUsers.add(user);
                        System.out.println(user);
                    }
                }
            } catch (FileNotFoundException Throwable e;
            e) {
                e.printStackTrace();
            }

            } catch(Exception e1){
                System.out.println(e1.toString());
            }


            // add dans les lists


    String [] = data. data.startsWith("='") && data.endsWith("',")

                    String[] st = data.split(", ");
                    User user = new User(st[0], st[1], st[2], Integer.parseInt(st[3]), st[4]);
                    listUsers.add(user);




    }
}
                /*
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



                while (data.startsWith("user")){
                    data.v

                    if(data.startsWith("firstName='")){
                        listUsers.add()
                    }


                }

                System.out.println(data);
            }


            try {
                File f = new File("save.txt");
                Scanner myReader = new Scanner(f);
                myReader.close();*/