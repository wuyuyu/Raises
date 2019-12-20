package projet_Raises;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Save_Restore {
    /**
     [# 14] save
     this command will save all your data related to users, objects and entries from the third tables on the hard disk in files.
     you are free to save a single file which contains all the data or one file per data whatever it is.
     the format of the data inside the files can be pure text or any other format which seems more practical to you to handle.
     you will have a bonus on the evaluation if you save the serialized RAM objects in your files (cf. serialization and
     deserialization of Java objects)
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


    /**
     [# 15] restore
     - this command will detect the presence of previously saved files (if they exist) and will open them for reading and retrieve
     the information contained therein to create new objects in memory
     - the goal is to restore the memory state as at the time of the backup, even if the application has restarted

     * - cette commande va détecter la présence des fichiers sauvegardés précédemment (si ils existent) et va les ouvrir en lecture et récupérer les informations contenues dedans pour créer de nouveaux objets en mémoire
     * - le but est de restaurer l'état mémoire comme au moment de la sauvegarde, et ce, meme si l'application a redémarré
     * @param listUsers
     * @param listItems
     * @param listRaises
     */
    public static void restore(List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {

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