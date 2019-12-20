package projet_Raises;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Save_Restore {
    /**
     * [# 14] save
     * this command will save all your data related to users, objects and entries from the third tables on the hard disk in files.
     * you are free to save a single file which contains all the data or one file per data whatever it is.
     * the format of the data inside the files can be pure text or any other format which seems more practical to you to handle.
     * you will have a bonus on the evaluation if you save the serialized RAM objects in your files (cf. serialization and
     * deserialization of Java objects)
     */

    public static void save(List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {
        File fu = new File("saveUser.txt");
        File fi = new File("saveItem.txt");
        File fr = new File("saveRaise.txt");
        String toStringUser;
        String toStringItems;
        String toStringRaises;
        try {
            if (fu.createNewFile()) {
                System.out.println("File created. path= " + fu.getAbsolutePath());
            }
            if (fi.createNewFile()) {
                System.out.println("File created. path= " + fi.getAbsolutePath());
            }
            if (fr.createNewFile()) {
                System.out.println("File created. path= " + fr.getAbsolutePath());
            }
            FileWriter myWriterUser = new FileWriter("saveUser.txt");
            FileWriter myWriterItem = new FileWriter("saveItem.txt");
            FileWriter myWriterRaise = new FileWriter("saveRaise.txt");

            for (User user : listUsers) {
                toStringUser = user.getFirstName()+","+user.getName()+","+user.getCountry()+","+user.getAge()+","+user.getSpecialty();
                myWriterUser.write(toStringUser);
                myWriterUser.write("\n");
            }
            for (Items items : listItems) {
                toStringItems = items.getTitle()+","+items.getReference()+","+items.getCategory()+","+items.getRarity();
                myWriterItem.write(toStringItems);
                myWriterItem.write("\n");
            }
            for (Raises raises : listRaises) {
                toStringRaises = raises.getFirstName()+","+raises.getLastName()+","+raises.getRef()+","+raises.getDateBuy()+","+raises.getDatePay();
                myWriterRaise.write(toStringRaises);
                myWriterRaise.write("\n");
            }

            myWriterUser.close();
            myWriterItem.close();
            myWriterRaise.close();
            System.out.println("All data has been successfully save to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


  /**
     * [# 15] restore
     * - this command will detect the presence of previously saved files (if they exist) and will open them for reading and retrieve
     * the information contained therein to create new objects in memory
     * - the goal is to restore the memory state as at the time of the backup, even if the application has restarted
     * <p>
     * - cette commande va détecter la présence des fichiers sauvegardés précédemment (si ils existent) et va les ouvrir en lecture et récupérer les informations contenues dedans pour créer de nouveaux objets en mémoire
     * - le but est de restaurer l'état mémoire comme au moment de la sauvegarde, et ce, meme si l'application a redémarré
     *
     * @param listUsers
     * @param listItems
     * @param listRaises
     */
    public static void restore(List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {


        try {
            BufferedReader readerUser = new BufferedReader(new FileReader("saveUser.txt"));
            BufferedReader readerItem = new BufferedReader(new FileReader("saveItem.txt"));
            BufferedReader readerRaise = new BufferedReader(new FileReader("saveRaise.txt"));
            String line1;
            String line2;
            String line3;

            while ((line1 = readerUser.readLine()) != null) {
                String[] lt1 = line1.split(",");
                User user = new User(lt1[0], lt1[1], lt1[2], Integer.parseInt(lt1[3]), lt1[4]);
                listUsers.add(user);
                System.out.println("Users restore with success.");
            }
            while ((line2 = readerUser.readLine()) != null) {
                String[] lt2 = line2.split(",");
                User user = new User(lt2[0], lt2[1], lt2[2], Integer.parseInt(lt2[3]), lt2[4]);
                listUsers.add(user);
                System.out.println("Users restore with success.");
            }
            while ((line3 = readerUser.readLine()) != null) {
                String[] lt3 = line3.split(",");
                User user = new User(lt3[0], lt3[1], lt3[2], Integer.parseInt(lt3[3]), lt3[4]);
                listUsers.add(user);
                System.out.println("Users restore with success.");
            }




            readerUser.close();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception eAll){
            eAll.getMessage();
        }
    }
}

/*

try {
            File save = new File("save.txt");
            Scanner scSave = new Scanner(save);
            FileReader fr = new FileReader("save.txt");
            BufferedReader br = new BufferedReader(fr);

// parcourir le fichier
            while (scSave.hasNextLine()){
                    // parcourir ligne par ligne du fichier , trouver toutes les ligne qui commence par User
                    // parcourir le fichier avec un Bufferedreader et tu incremente une variable nbrLigne dès que tu tombe sur un retour chariot.
                    for(int i = 0, i<= nbrLigne ,i++){
                    //quand la ligne commance par User
                    String ligne = contenuDeLigne(i);
                    if(ligne.startsWith("User")){
                    //parcourir le separateur

                    }
                    }
                    }*/

         /*  while (scSave.hasNextLine()) {
                String data = scSave.nextLine();
                int numberLine = scSave.nextInt();
                //System.out.println(numberLine);
               System.out.println(data);
               while (data.startsWith("User")){
                   int i =0;
                   System.out.println(scSave.nextInt());

                   System.out.println(data);

                i++;
               }*/
//System.out.println(scSave.toString());

              /*  if (data.startsWith("User")){
                    System.out.println(data);
                    String [] st = data.split(", ");
                    while (data.split(", ") == true){

                        User user = new User(st[0], st[1], st[2], Integer.parseInt(st[3]), st[4]);
                        listUsers.add(user);
                    }
                }*/
/*
if (data.startsWith("firstName",4)){
    System.out.println("oui");
}
*/


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