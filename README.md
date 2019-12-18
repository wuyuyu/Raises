@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[CONSIGNES GENERALES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

[>] Le but de l'exercice est de créer une application en ligne de commande.
- il y a 6 sujets différents mais tous demandent le meme type de travail
- le but est de gérer une liste d'utilisateurs, une liste d'objets, et une liste qui associe les utilisateurs avec des objets.
- les différents sujets portent sur :
    - [books]   des personnes qui peuvent emprunter des livres
    - [cars]    des personnes qui peuvent louer des voitures
    - [raises]  des acquéreurs qui peuvent acheter des objets aux enchères
    - [drivers] des conducteurs qui peuvent livrer des colis
    - [houses]  des acheteurs qui peuvent acquérir des maisons
    - [stocks]  des acheteurs qui peuvent acquérir des actions en bourse

[>] Votre application sera orientée objet
c'est à dire que vous devez créer dans la mesure du possible des classes pour chaque information nécessaire dans l'exercice.
Faire une application qui répondra fonctionnellement aux demandes mais dans laquelle tout le code aura été mis dans une seule classe ne rapportera pas tous les points.
On demande donc ici de concevoir correctement l'application.

[>] Vous devrez fournir un diagramme de classe
qui montre le contenu de chaque classe (attributs, méthodes)
ainsi que les relations entre les classes.
On ne demande pas un schéma respectant totalement la norme UML mais il faut s'en rapprocher le plus possible.

[>] Il n'y aura pas de base de données au sens où on l'entend dans le web pour sauvegarder les données
Ici vous allez créer votre propre système de stockage de données sous forme de fichiers textes.

[>] Utilisez des listes chainees plutot que des tableaux

[>] Certaines classes doivent redéfinir les méthodes toString() et/ou equals() afin de faire respectivement un affichage de l'objet ou une comparaison de l'objet.

[>] Le langage utilisé sera Java.

[>] Vous devrez nommer vos éléments de code dans un anglais correct (noms des variables, méthodes, classes, interfaces, ...) et vous devrez commenter votre code en anglais au format JavaDoc.
[>] La documentation du projet devra être stockée dans les fichiers de votre projet (JavaDoc)

[>] Vous devrez compiler votre application dans un fichier .JAR et vous devrez être en mesure d'exécuter ce JAR en ligne de commande pour lancer votre application.

[>] RAPPEL : cette application s'exécute en ligne de commande dans un terminal. Il n'est pas demandé de créer une interface graphique.



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[LES DONNEES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Pour chaque type d'objet de votre application,vous aurez plusieurs données à traiter.
Voici les données principales à implémenter obligatoirement (créer une classe pour chaque table ci-dessous, la 1ere pour les utilisateurs, la 2eme pour les objets, la 3eme pour les liens entre utilisateurs et objets).
Vous pouvez créer d'autres classes qui vous semblent judicieuses du moment que celles énoncées ci-dessous existent.

=================================================================================================
============================================= BOOKS =============================================
=================================================================================================
[>] Les emprunteurs (users)
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- le numéro du jour de naissance (entier)
- le numéro de mois de naissance (entier)
- l'année de naissance (entier)

[>] Les livres (books)
- le titre (chaine de caractères)
- l'année de parution (entier)
- le nom de l'éditeur (chaine de caractère)
- la référence (chaine de caractères arbitraire et unique par livre ex: B312)

[>] Les emprunts (borrows)
- nom de l'utilisateur (chaine de caractères)
- le prénom de l'utilisateur (chaine de caractères)
- la référence du livre (chaine de caractères)
- la date du jour de l'emprunt (vous êtes libres du format exact à implémenter)
- la date de rendu (vous êtes libres du format exact à implémenter)

================================================================================================
============================================= CARS =============================================
================================================================================================
[>] Les loueurs (users)
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- nationalite (chaine de caractères)
- département (entier)
- age (entier)

[>] Les voitures (cars)
- marque (chaine de caractères)
- modèle (chaine de caractères)
- l'année de parution (entier)
- la référence (chaine de caractères arbitraire et unique par voiture ex: B312)

[>] Les locations (rents)
- nom de l'utilisateur (chaine de caractères)
- le prénom de l'utilisateur (chaine de caractères)
- la référence de la voiture (chaine de caractères)
- la date du jour de la location (vous êtes libres du format exact à implémenter)
- la date de rendu (vous êtes libres du format exact à implémenter)

==================================================================================================
============================================= RAISES =============================================
==================================================================================================
[>] Les acquéreurs (users)
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- le pays de naissance (chaine de caractères)
- l'age (entier)
- la spécialité de l'acquéreur (chaine de caractères)

[>] Les objets (items)
- l'intitulé (chaine de caractères)
- la catégorie (chaine de caracteres
- la rareté (entier en pourcentage de 0 à 100)
- la référence (chaine de caractères arbitraire et unique, ex: B312)

[>] Les enchères (raises)
- nom de l'utilisateur (chaine de caractères)
- le prénom de l'utilisateur (chaine de caractères)
- la référence de l'objet (chaine de caractères)
- la date du jour de l'enchère (vous êtes libres du format exact à implémenter)
- la date de paiement de l'enchère (vous êtes libres du format exact à implémenter)

===================================================================================================
============================================= DRIVERS =============================================
===================================================================================================
[>] Les conducteurs (users)
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- la nationalité (chaine de caractères)
- l'age (entier)
- le nombre d'années d'ancienneté (entier)

[>] Les Colis (packets)
- intitulé (chaine de caractères)
- type de colis (chaine de caractères)
- poids (entier)
- la référence (chaine de caractères arbitraire et unique, ex: B312)

[>] Les livraisons (deliveries)
- nom de l'utilisateur (chaine de caractères)
- le prénom de l'utilisateur (chaine de caractères)
- la référence du colis (chaine de caractères)
- la date de depart (vous êtes libres du format exact à implémenter)
- la date d'arrivée (vous êtes libres du format exact à implémenter)

==================================================================================================
============================================= HOUSES =============================================
==================================================================================================
[>] Les acheteurs (users)
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- la banque (chaine de caractères)
- l'emprunt en euros (entier)
- le taux d'emprunt en pourcentage (nombre entier entre 0 et 100)

[>] Les maisons (houses)
- l'intitulé (chaine de caractères)
- la référence (chaine de caractères arbitraire et unique, ex: B312)
- la catégorie (chaine de caracteres)
- le prix (entier)

[>] Les transactions (sales)
- nom de l'utilisateur (chaine de caractères)
- le prénom de l'utilisateur (chaine de caractères)
- la référence de la maison (chaine de caractères)
- la date de signature du compromis (vous êtes libres du format exact à implémenter)
- la date de signature définitive (vous êtes libres du format exact à implémenter)

==================================================================================================
============================================= STOCKS =============================================
==================================================================================================
[>] Les acheteurs (users)
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- métier (chaine de caractères)
- département (entier)
- age (entier)

[>] Les actions en bourse (stocks)
- intitulé (chaine de caractères)
- montant ouverture
- montant fermeture (entier)
- la référence (chaine de caractères arbitraire et unique, ex: B312)

[>] Les achats (purchases)
- nom de l'utilisateur (chaine de caractères)
- le prénom de l'utilisateur (chaine de caractères)
- la référence de l'action (chaine de caractères)
- la date d'achat (vous êtes libre du format à implémenter)
- la date de revente (vous êtes libre du format à implémenter)



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[LES COMMANDES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

[>] quand vous aurez lancé votre application, elle vous demandera en boucle d'entrer une commande.
Si vous entrez une commande qu'elle ne connait pas, elle vous affichera un message d'erreur en indiquant de recommencer.
La liste des commandes possibles devra s'afficher également (voir commande 'help')

[>] Votre application devra donc implémenter les commandes avec un certain formalisme.
CHAQUE commande devra vérifier que TOUS les paramètres requis sont présents avant de s'exécuter.
Si un paramètre manque, un message d'erreur devra s'afficher.



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[LE DETAIL DES COMMANDES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

[#1] help
- cette commande doit afficher toutes les commandes possibles de votre application ainsi que le formalisme (décrit ci-dessous pour chaque commande)

[#2] exit
- cette commande permet de sortir de la boucle infinie de votre application, et donc de terminer son exécution. C'est grâce à cette commmande exit que vous pouvez quitter votre application normalement.



[#3] adduser <...> <...>
- La commande sera suivie de tous les paramètres définis plus haut pour un utilisateur
- La commande doit créer en mémoire un nouvel utilisateur.
- Un utilisateur devra être considéré comme déjà existant si le nom ET le prénom correspondent parfaitement à une entrée déjà enregistrée. Dans ce cas un message d'erreur s'affichera
- La commande doit vérifier que les paramètres de types entiers sont bornés
- La commande ajoutera l'utilisateur dans une liste si toutes les conditions sont correctes

[#4] edituser <firstname> <lastname>
- la commande va modifier un utilisateur déjà enregistré
- la commande recherche un utilisateur avec exactement le patronyme rentré. Si l'utilisateur existe, alors la commande demande d'entrer tous les nouveaux paramètres un à un. Si pour un paramètre on entre une chaine vide, on garde la valeur précédente
- la commande va ensuite vérifier les nouvelles informations entrées (comme le fait adduser) et enregistrer les modifications de l'utilisateur DANS LE MEME OBJET (on modifie l'utilisateur, on n'en créé pas de nouveau). SI une erreur est survenue dans la saisie des nouvelles valeurs (ex : le nouveau nom et le nouveau prénom existent deja, ou bien un champ de type entier qui contient des lettres) alors on ne modifie pas l'utilisateur et on affiche un message d'erreur.
- si l'utilisateur recherché n'existe pas dans la liste, alors on affiche un message d'erreur.
- si l'utilisateur est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors la modification de cet utilisateur ne pourra pas se faire et un message d'erreur sera affiché

[#5] removeuser <firstname> <lastname>
- cette commande recherche un utilisateur avec le meme nom ET prénom rentrés et va le supprimer de la liste.
- si l'utilisateur recherché n'existe pas, alors on affiche un message d'erreur comme quoi il est introuvable.
- si l'utilisateur existe, il est supprimé de la liste en mémoire, et on affiche un message de réussite de l'effacement.
- si l'utilisateur est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors l'effacement de cet utilisateur ne pourra pas se faire et un message d'erreur sera affiché

[#6] listusers
- affiche tous les utilisateurs

[#7] addbook / addcar / additem / Addpacket / addhouse / addstock
- ajoute un objet dans la liste conformément à la deuxième table (respectivement Livres, Voitures, Objets, Colis, Maisons, Actions)
- la commande prend tous les champs décrits dans la table plus haut
- la commande cherche d'abord si la référence de l'objet est présente dans la troisème table, et si l'objet existe dejà un message d'erreur s'affiche
- si la reference de l'objet n'existe pas, alors on le créé dans une liste

[#8] editbook / editcar / edititem / editpacket / edithouse / editstock
- cette commande prend en paramètre la référence de l'objet à modifier
- la commande va modifier un objet déjà enregistré
- la commande recherche un objet avec exactement la référence entrée. Si l'objet existe, alors la commande demande d'entrer tous les nouveaux paramètres un à un. Si pour un paramètre on entre une chaine vide, on garde la valeur précédente
- la commande va ensuite vérifier les nouvelles informations entrées (comme le fait la commande add) et enregistrer les modifications de l'objet DANS LE MEME OBJET (on modifie l'objet, on n'en créé pas de nouveau). SI une erreur est survenue dans la saisie des valeurs alors on ne modifie pas l'objet et on affiche un message d'erreur.
- si l'objet recherché n'existe pas dans la liste, alors on affiche un message d'erreur.
- si l'objet est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors la modification de cet objet ne pourra pas se faire et un message d'erreur sera affiché

[#9] removebook / removecar / removeitem / removepacket / removehouse / removestock
- cette commande prend en paramètre la référence de l'objet à modifier
- cette commande recherche un objet avec la meme référence rentrée et va le supprimer de la liste.
- si l'objet recherché n'existe pas, alors on affiche un message d'erreur comme quoi il est introuvable.
- si l'objet existe, il est supprimé de la liste en mémoire, et on affiche un message de réussite de l'effacement.
- si l'objet est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors l'effacement de cet objet ne pourra pas se faire et un message d'erreur sera affiché

[#10] listbooks / listcars / listitems / listpackets / listhouses / liststocks
- affiche tous les objets enregistrés

[#11] createborrow / createrent / createraise / createdelivery / createsale / createpurchase
- cette commande prend en paramètre le prénom et le nom d'un utilisateur ainsi que la référence de l'objet associé
- si l'utilisateur n'existe pas on affiche une erreur.
- si la référence de l'objet n'existe pas on affiche une erreur.
- si l'objet est deja en cours d'utilisation, c'est à dire dans une entrée de la troisème table mais avec une date de rendu / date d'arrivée / date de fin non remplie, alors on affiche une erreur.
- dans tous les autres cas, on stocke l'entrée avec la date du jour (mettre une valeur aléatoire histoire d'avoir des dates différentes)
- afficher le récapitulatif de l'ajout (nom , prénom de l'utilisateur, ref de l'objet, date de debut)

[#12] endborrow / endrent / endraise / enddelivery / endsale / endpurchase
- cette commande prend en paramètre la référence d'un objet
- si cette référence n'existe pas dans la troisième table , alors on affiche une erreur
- si cet objet n'est pas dans une entrée en cours, on affiche une erreur
- si cet objet est actuellement dans une entrée en cours, alors on met a jour la date de fin (mettre une date aléatoire mais qui soit supérieure à la date départ)
- afficher le récapitulatif de l'entrée (nom, prénom de l'utilisateur, ref de l'objet, date de debut, date de fin)

[#13] listborrow / listrent / listraise / listdelivery / listsale / listpurchase
- cette commande affiche la liste des entrées (troisième table)
- vous êtes libres du formalisme d'affichage mais toutes les informations doivent apparaitre
- nom et prénom de l'utilisateur, infos de l'objet + référence + dates de début et de fin

[#14] save
- cette commande va sauvegarder toutes vos données liés aux utilisateurs, objets et entrées de la troisième tables sur le disque dur dans des fichiers.
- vous êtes libres de sauvegarder un seul fichier qui contient toutes les données ou bien un fichier par donnée quelle qu'elle soit.
- le format des données à l'intérieur des fichiers peut etre du texte pur ou tout autre format qui vous semble plus pratique à manipuler.
- vous aurez un bonus sur l'évaluation si vous sauvegardez dans vos fichiers les objets RAM sérialisés (cf. sérialisation et désérialisation des objets Java)

[#15] restore
- cette commande va détecter la présence des fichiers sauvegardés précédemment (si ils existent) et va les ouvrir en lecture et récupérer les informations contenues dedans pour créer de nouveaux objets en mémoire
- le but est de restaurer l'état mémoire comme au moment de la sauvegarde, et ce, meme si l'application a redémarré




@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[EVALUATION] : Critères de notation
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 
[CRASH]
x - crash lors de l'exécution : perte de 10% de la note à chaque crash de cause différente (ex: 1 crash pour un ArrayIndexOutOfBoundsException et 1 autre pour NullPointerException donneront une note réduite de 19% de la note obtenue normalement (note*0.9*0.9 = note*0.81)

[CONCEPTION](40pts)
10- diagramme de classes complet 
5 - expliquer la conception décrite dans le diagramme de classe (5pts)
5 - nommage des éléments en anglais + commentaires (5pts)
2 - génération de la javadoc
8 - contenu de la javadoc correct et en anglais
8 - séparation en classes (8pts)
1 - rédéfinition des méthodes toString (1pt)
1 - redéfinition des méthodes equals (1pt)
0 - utilisation de hashmaps plutot que des listes chainées (+5pts)
0 - utilisation de la sérialisation plutot que des copies de chaines de caractères pour la sauvegarde/restauration (+10pts) 

[FONCTIONNEL GLOBAL] (6pts)
1 - compiler le projet (génération du .JAR) (1pt)
1 - lancer le programme en ligne de commande (1pt)
1 - taper n'importe quoi comme commande : affichage message d'erreur (1pt)
2 - help (2pts)
1 - exit (1pt)

[FONCTIONNEL utilisateurs] (14pts)
4 - commande add
4 - commande edi
3 - commande remove
3 - commande list

[FONCTIONNEL objets] (15pts)
4 - commande add
4 - commande edit
3 - commande remove
4 - commande list

[FONCTIONNEL 3ème table] (13pts)
5 - create
4 - end
4 - list

[FONCTIONNEL SAVE/RESTORE] (12pts)
2 - sauvegarde des utilisateurs (2pts)
2 - sauvegarde des objets (2pts)
2 - sauvegarde des entrées de la 3eme table (2pts)
2 - restauration des utilisateurs (2pts) 
2 - restauration des objets (2pts)
2 - restauration des entrées de la 3eme table (2pts)

