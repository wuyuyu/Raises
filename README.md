# projet_Raises




@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[CONSIGNES GENERALES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

[>] Le but de l'exercice est de créer une application en ligne de commande qui permet de gérer a minima une liste d'articles vendus aux enchères.
Il s'agira de gérer les acquéreurs ainsi que les objets (enregistrement, édition, effacement).
Les acquéreurs seront les personnes qui peuvent acquérir les objets aux enchères.
L'application pourra également gérer la liste des enchères effectuées (avec référence vers l'acquéreur, la date de l'enchère, la date de paiement de l'objet (après les enchères), etc...).

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

[>] Le langage utilisé sera Java.

[>] Vous devrez nommer vos éléments de code dans un anglais correct (noms des variables, méthodes, classes, interfaces, ...) et vous devrez commenter votre code en anglais au format JavaDoc.
[>] La documentation du projet devra être stockée dans les fichiers de votre projet (JavaDoc)

[>] Vous devrez compiler votre application dans un fichier .JAR et vous devrez être en mesure d'exécuter ce JAR en ligne de commande pour lancer votre application.

[>] RAPPEL : cette application s'exécute en ligne de commande dans un terminal. Il n'est pas demandé de créer une interface graphique.



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[LES DONNEES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Pour chaque type d'objet de votre application,vous aurez plusieurs données à traiter. Voici les données principales à implémenter obligatoirement. Vous pouvez créer d'autres classes qui vous semblent judicieuses du moment que celles énoncées ci-dessous existent. 

[>] Les acquéreurs
- le prénom (chaine de caractères)
- le nom (chaine de caractères)
- le pays de naissance (chaine de caractères
- l'age (entier)
- la spécialité de l'acquéreur (chaine de caractère comme 'antiquités', 'horloges', 'vases', 'sculptures', ...)

[>] Les objets
- l'intitulé (chaine de caractères)
- la référence (chaine de caractères arbitraire et unique, ex: B312)
- la catégorie (chaine de caracteres
- la rareté (entier en pourcentage de 0 à 100)

[>] Les enchères
- nom de l'acquéreur (chaine de caractères)
- le prénom de l'acquéreur (chaine de caractères)
- la référence de l'objet (chaine de caractères)
- la date du jour de l'enchère (vous êtes libres du format exact à implémenter)
- la date de paiement de l'enchère (vous êtes libres du format exact à implémenter. N'oubliez pas de spécifier la valeur à utiliser pour une enchère qui n'a pas encore été payée)



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[LES COMMANDES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

[>] quand vous aurez lancé votre application, elle vous demandera en boucle d'entrer une commande.
Si vous entrez une commande qu'elle ne connait pas, elle vous affichera un message d'erreur en indiquant de recommencer.
La liste des commandes possibles devra s'afficher également (voir commande 'help')

[>] Votre application devra donc implémenter plusieurs commandes avec un certain formalisme.
CHAQUE commande devra vérifier que TOUS les paramètres requis sont présents avant de s'exécuter.
Si un paramètre manque, un message d'erreur devra s'afficher.



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[LE DETAIL DES COMMANDES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

[#1] help
- cette commande doit afficher toutes les commandes possibles de votre application ainsi que le formalisme (décrit ci-dessous pour chaque commande)

[#2] exit
- cette commande permet de sortir de la boucle infinie de votre application, et donc de terminer son exécution. C'est grâce à cette commmande exit que vous pouvez quitter votre application normalement.

[#3] adduser <firstname> <lastname> <country> <age> <specialisation>
- La commande doit créer en mémoire un nouvel utilisateur. Un utilisateur devra être considéré comme déjà existant si le nom ET le prénom d'un utilisateur correspondent parfaitement au nom ET prénom dans la commande. Dans ce cas un message d'erreur affiche que l'utilisateur existe déjà.
- La commande doit vérifier que l'age est entre 18 et 99 (en nombre entier).

[#4] edituser <firstname> <lastname> 
- la commande recherche un utilisateur avec exactement le patronyme rentré. Si l'utilisateur existe, alors la commande demande le nouveau nom (si on entre une chaine vide, alors pas de changement de nom), demande ensuite le nouveau prénom (si chaine vide, pas de changement) et va demander ensuite chaque champ (toujours avec la possibilité de ne pas changer la valeur en appuyant sur entrée pour laisser une chaine vide).
- la commande va ensuite vérifier les nouvelles informations entrées (comme le fait adduser) et enregistrer les modifications de l'utilisateur DANS LE MEME OBJET (on modifie l'utilisateur, on n'en créé pas de nouveau). SI une erreur est survenue dans la saisie des nouvelles valeurs (ex : le nouveau nom et le nouveau prénom existent deja, ou bien un age qui n'est pas un entier) alors on ne modifie pas l'utilisateur et on affiche un message d'erreur.
- si l'utilisateur recherché n'existe pas dans la liste, alors on affiche un message d'erreur.

[#5] removeuser <firstname> <lastname>
- cette commande recherche un utilisateur avec le meme nom ET prénom rentrés et va le supprimer de la liste.
- si l'utilisateur recherché n'existe pas, alors on affiche un message d'erreur comme quoi il est introuvable.
- si l'utilisateur existe, il est supprimé de la liste en mémoire, et on affiche un message de réussite de l'effacement.
- si l'utilisateur est utilisé dans une enchère , alors l'effacement de cet utilisateur ne pourra pas se faire et un message d'erreur sera affiché

[#6] listusers
- affiche tous les utilisateurs

[#7] addobject <title> <ref> <category> <rarity>
- cherche d'abord un objet qui porte la meme référence (ou le même intitulé ET la même categorie ET la meme rareté). Si un objet existe deja dans la mémoire, alors on affiche un message d'erreur (avec les infos de l'objet existant par exemple)

[#8] editobject <ref>
- cette commande va rechercher un objet d'enchère dans les données et si elle le trouve va demander de remplacer toutes les infos qui y sont liées (comme dans la commande edituser).
- si la référence de l'objet n'est pas trouvée, alors on affiche un message d'erreur.
- pour chaque champ de valeur, on peut laisser une chaine vide pour indiquer qu'on ne change pas la valeur (comme expliqué dans la commande edituser).

[#9] removeobject <ref>
- cette commande recherche une référence d'objet et la supprime de la liste en mémoire.
- si la référence n'est pas trouvée, un message d'erreur s'affiche.
- si la référence existe, il faut vérifier que cet objet n'est pas utilisé dans une enchère. Si c'est pas le cas, un message d'erreur affichera que cet objet ne peut pas être supprimé car il est actuellement utilisé.

[#10] listobject
- affiche tous les objets

[#11] createraise <firstname> <lastname> <ref>
- cette commande prend en paramètre le prénom et le nom d'un utilisateur ainsi que la référence de l'objet à emprunter
- si l'utilisateur n'existe pas on affiche une erreur.
- si la référence de l'objet n'existe pas on affiche une erreur.
- si l'objet a déjà été emprunté par qqun on affiche une erreur.
- dans tous les autres cas, on stocke l'enchère de cet objet par cet utilisateur avec la date du jour (mettre une valeur aléatoire pour le jour, le mois et l'année histoire d'avoir des dates différentes par emprunt)
- afficher le récapitulatif de l'enchère (utilisateur, ref objet, date d'enchère)

[#12] payraise <ref>
- cette commande prend en paramètre la référence d'un objet
- si cette référence n'existe pas, alors on affiche une erreur
- si cet objet n'a pas été acquis aux enchères, on affiche une erreur
- si ce livre est actuellement acquis aux enchères, alors on met a jour l'objet enchère associé pour mettre la date de paiment (mettre une date aléatoire mais qui soit supérieure à la date d'emprunt)
- afficher le récapitulatif de l'enchère terminée(utilisateur, ref objet, date d'enchères, date de paiment)

[#13] listraises
- cette commande affiche la liste des enchères
- vous êtes libres du formalisme d'affichage mais toutes les informations doivent apparaitre
- nom et prénom de l'utilisateur, intitulé de l'objet + référence (il faut donc aller chercher l'intitulé à partir de la référence stockée dans l'enchère), date d'enchère, date de paiement ou vide si pas encore payée.

[#14] save
- cette commande va sauvegarder toutes vos données liés aux utilisateurs, objets et enchères sur le disque dur dans des fichiers.
- vous êtes libres de sauvegarder un seul fichier qui contient toutes les données ou bien un fichier par donnée quelle qu'elle soit.
- le format des données à l'intérieur des fichiers peut etre du texte pur ou tout autre format qui vous semble plus pratique à manipuler.
- vous aurez un bonus sur l'évaluation si vous sauvegardez dans vos fichiers les objets RAM sérialisés (cf. sérialisation et désérialisation des objets Java)

[#15] restore
- cette commande va détecter la présence des fichiers sauvegardés précédemment (si ils existent) et va les ouvrir en lecture et récupérer les informations contenues dedans pour créer de nouveaux objets en mémoire (et donc restaurer l'etat mémoire comme au moment de la sauvegarde).



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
[CONSIGNES TECHNIQUES]
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

- la liste des acquéreurs se fait avec une liste chainee et pas de tableau.
- la liste des objets se fait au choix avec une liste chainée, ou bien une hashmap (la référence de l'objet en tant que 'clé', l'objet en tant que 'valeur') mais pas de tableau.
- la liste des enchères se fait au choix avec une liste chainee, ou bien une hashmap (la référence de l'objet en tant que 'clé', l'utilisateur en tant que 'valeur') mais pas de tableau.
- certaines classes doivent redéfinir les méthodes toString() et/ou equals() afin de faire respectivement un affichage de l'objet ou une comparaison de l'objet.



 








@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



[TEST]

[PHASE #0 : DEMARRAGE]
- compilation du projet vers un .jar [ok]
- lancement du .jar en ligne de commande [ok]
- entrée d'une commande inconnue [erreur]
- commande help : vérifiez l'affichage de la liste des commandes [ok]
- commande exit : vérifiez que le programme sort [ok]

[PHASE #1 : utilisateurs sans la gestion des emprunts]
- (re)démarrer l'application [ok]

[PHASE #1A] add
- adduser : tenter de créer un utilisateur avec juste le prénom [erreur]
- listusers : vérifier l'affichage de 0 utilisateur
- adduser : tenter de créer un utilisateur avec juste les prénom et nom [erreur]
- listusers : vérifier l'affichage de 0 utilisateur
- adduser : tenter de créer un utilisateur avec juste les prénom, nom et jour [erreur]
- listusers : vérifier l'affichage de 0 utilisateur
- adduser : tenter de créer un utilisateur avec juste les prénom, nom, jour et mois [erreur]
- listusers : vérifier l'affichage de 0 utilisateur
- adduser : créer un utilisateur [ok]
- listusers : afficher le seul utilisateur créé
- adduser : tenter de créer un utilisateur avec des jour, mois, année qui ne sont pas des entiers [erreur]
- listusers : afficher le seul utilisateur créé
[PHASE #1B] remove
- adduser : créer quatre nouveaux utilisateurs avec chacun une année différente [ok]
- listusers : vérifier l'affichage des 5 utilisateurs triés correctement par ordre croissant d'année
- removeuser : tenter de supprimer un utilisateur dont le nom n'existe pas [erreur]
- listusers : vérifier l'affichage des 5 utilisateurs triés correctement par ordre croissant d'année
- removeuser : tenter de supprimer un utilisateur dont le prénom n'existe pas [erreur]
- listusers : vérifier l'affichage des 5 utilisateurs triés correctement par ordre croissant d'année
- removeuser : supprimer le 2ème utilisateur créé [ok]
- listusers : vérifier le nouvel affichage des 4 utilisateurs
[PHASE #1C] edit
- edituser : appeler la commande en donnant juste un seul paramètre [erreur]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : tenter de modifier un utilisateur dont le nom n'existe pas [erreur]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : tenter de modifier un utilisateur dont le prénom n'existe pas [erreur]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en entrant uniquement des chaines vides (donc on conserve toutes les memes informations) [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son prénom [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son nom de famille [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son jour de naissance [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son mois de naissance [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son année de naissance [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son prénom par celui d'un autre utilisateur [ok]
- listusers : vérifier l'affichage des 4 utilisateurs
- edituser : on modifie le premier utilisateur créé en changeant uniquement son nom par celui d'un autre utilisateur (et qui correspond au prénom changé précédemment) [erreur]
- listusers : vérifier l'affichage des 4 utilisateurs
[PHASE #1D] save
- save : sauvegarder les 4 utilisateurs en mémoire
- exit : quitter l'application
- relancer l'application (.JAR)
- restore : l'application doit restaurer en mémoire les objets
- listusers : vérifier l'affichage des 4 utilisateurs


[PHASE #2 : livres sans la gestion des emprunts]
- (re)démarrer l'application
[PHASE #2A] add
- addbook : tenter de créer un livre avec juste le titre [erreur]
- listbooks : vérifier l'affichage de 0 livre
- addbook : tenter de créer un livre avec juste les titre et référence [erreur]
- listbooks : vérifier l'affichage de 0 livre
- addbook : tenter de créer un livre avec juste les titre, référence et année [erreur]
- listbooks : vérifier l'affichage de 0 livre
- addbook : créer un livre [ok]
- listbooks : afficher le seul livre créé
- addbook : tenter de créer un livre avec une année qui n'est pas un entier [erreur]
- listbooks : afficher le seul livre créé
[PHASE #2B] remove
- addbook : créer quatre nouveaux livres avec chacun des données différentes [ok]
- listbooks : vérifier l'affichage des 5 livres triés correctement par ordre croissant de référence
- removebook : tenter de supprimer un livre dont la référence n'existe pas [erreur]
- listbooks : vérifier l'affichage des 5 livres
- removebook : supprimer le 2ème livre créé [ok]
- listbooks : vérifier le nouvel affichage des 4 livres
[PHASE #2C] edit
- editbook : appeler la commande en ne donnant aucun paramètre [erreur]
- listbooks : vérifier l'affichage des 4 livres
- editbook : tenter de modifier un livre dont la référence n'existe pas [erreur]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en entrant uniquement des chaines vides (donc on conserve toutes les memes informations) [ok]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en changeant uniquement son titre [ok]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en changeant uniquement sa référence [ok]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en changeant uniquement son éditeur [ok]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en changeant uniquement son année de parution [ok]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en changeant uniquement son titre, année de référence, éditeur par ceux d'un autre livre [erreur]
- listbooks : vérifier l'affichage des 4 livres
- editbook : on modifie le premier livre créé en changeant uniquement sa reférence par celle d'un autre livre [erreur]
- listbooks : vérifier l'affichage des 4 livres
[PHASE #1D] save
- save : sauvegarder les 4 livres en mémoire
- exit : quitter l'application
- relancer l'application (.JAR)
- restore : l'application doit restaurer en mémoire les objets
- listbooks : vérifier l'affichage des 4 livres

[PHASE #3 : emprunts]
- (re)démarrer l'application

[PHASE #3A] borrow
- adduser : créer 5 utilisateurs [ok]
- listusers : vérifier l'affichage
- addbook : créer 5 livres [ok]
- listbooks : vérifier l'affichage
- borrowbook : tenter de créer un emprunt avec juste un prénom [erreur]
- listborrow : vérifier l'affichage de 0 emprunt
- borrowbook : tenter de créer un emprunt avec juste un prénom et un nom [erreur]
- listborrow : vérifier l'affichage de 0 emprunt
- borrowbook : créer un emprunt [ok]
- listborrow : vérifier l'affichage de 1 emprunt
- borrowbook : tenter de créer un emprunt avec un nom et prénom qui n'existent pas dans la liste des utilisateurs [erreur]
- listborrow : vérifier l'affichage de 1 emprunt
- borrowbook : tenter de créer un emprunt avec une reférence qui n'existe pas dans la liste des livres [erreur]
- listborrow : vérifier l'affichage de 1 emprunt
- borrowbook : tenter d'emprunter un livre avec une référence déjà empruntée [erreur]
- listborrow : vérifier l'affichage de 1 emprunt
[PHASE #3B] return
- borrowbook : créer 2 nouveaux emprunts de 2 autres livres par 2 autres utilisateurs [ok]
- listborrow : vérifier l'affichage trié des 3 emprunts
- borrowbook : créer 2 nouveaux emprunts des 2 derniers livres par 2 utilisateurs qui ont déjà empruntés [ok]
- listborrow : vérifier l'affichage trié des 5 emprunts
- returnbook : tenter de rendre un livre dont la référence n'existe pas [erreur]
- listborrow : vérifier l'affichage trié des 5 emprunts
- returnbook : tenter de rendre un livre dont la référence existe mais n'est pas emprunté [erreur]
- listborrow : vérifier l'affichage trié des 5 emprunts
- returnbook : rendre 1 livre
- listborrow : verifier l'affichage trié des 5 emprunts (dont 1 terminé)
- returnbook : rendre 1 livre
- listborrow : verifier l'affichage trié des 5 emprunts (dont 2 terminés)
[PHASE #3C] save
- save : sauvegarder les 5 emprunts en mémoire (ainsi que les 5 livres et les 5 utilisateurs)
- exit : quitter l'application
- relancer l'application (.JAR)
- restore : l'application doit restaurer en mémoire les objets
- listusers : vérifier l'affichage des 5 utilisateurs
- listbooks : vérifier l'affichage des 5 livres
- listborrow : verifier l'affichage des 5 emprunts


 

 
//========================================================================================================================== 
// EVALUATION RATTRAPAGE : application Java en ligne de commande
//========================================================================================================================== 
 
[CRASH]
x - crash lors de l'exécution : perte de 10% de la note à chaque crash de cause différente (ex: 1 crash pour un ArrayIndexOutOfBoundsException et 1 autre pour NullPointerException donneront une note réduite de 19% de la note obtenue normalement (note*0.9*0.9 = note*0.81)

[CONCEPTION](40pts)
10- diagramme de classes fourni avec les liaisons entre classes (3pts), les méthodes (3pts) et les attributs (3pts) (indiquer les types des attributs, paramètres, retours : 1pts) 
5 - expliquer la conception décrite dans le diagramme de classe (5pts)
5 - nommage des éléments en anglais + commentaires (5pts)
2 - génération de la javadoc
8 - contenu de la javadoc correct et en anglais
1 - une classe pour les livres (1pt)
1 - une classe pour les utilisateurs (1pt)
1 - une classe pour gérer la liste des livres (1pt)
1 - une classe pour gérer la liste des utilisateurs (1pt)
1 - une classe pour gérer les emprunts (1pt)
1 - une classe, ou à défaut des services dans les classes précédentes pour gérer la sauvegarde et la restauration des données (fichiers texte sur le disque dur) (1pt)
1 - une classe, ou services, pour gérer les commandes et l'analyse des chaines de caractères entrées au clavier (1pt)
1 - une classe principale pour orchestrer l'application (1pt)
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

[FONCTIONNEL USERS] (14pts)
4 - adduser err param manquant (1pt), err param type (1pt), err utilisateur existant (1pt), nominal ok (1pt)
4 - edituser err param manquant (1pt), err utilisateur non existant (1pt), champ vide non modifié (1pt), champ non vide modifié (1pt)
3 - removeuser err param manquant (1pt), err utilisateur non existant (1pt), nominal ok (1pt)
3 - listusers aff tous les utilisateurs (1pt) + toString(2pts)

[FONCTIONNEL BOOKS] (15pts)
4 - addbook err param manquant (1pt), err param type (1pt), err livre existant (1pt), nominal ok (1pt)
4 - editbook err param manquant (1pt), err livre non existant (1pt), champ vide non modifié (1pt), champ non vide modifié (1pt)
3 - removebook err param manquant (1pt), err livre non existant (1pt), nominal ok (1pt)
4 - listbooks aff tous les livres (1pt) + toString(2pts)

[FONCTIONNEL BORROW] (13pts)
5 - borrowbook : err param manquant (1pt), err utilisateur non existant (1pt), err reference non existante (1pt), err livre deja emprunté (1pt), nominal ok (1pt)
4 - returnbook : err param manquant (1pt), err reference non existante (1pt), err référence existante mais pas empruntée (1pt), nominal ok (1pt)
4- listborrow : aff tous les emprunts (1pt) + toString(2pts)

[FONCTIONNEL SAVE/RESTORE] (12pts)
2 - sauvegarde des utilisateurs (2pts)
2 - sauvegarde des livres (2pts)
2 - sauvegarde des emprunts (2pts)
2 - restauration des utilisateurs (2pts) 
2 - restauration des livres (2pts)
2 - restauration des emprunts (2pts)





client   : NOM, PRENOM, nationalite, departement, age  
voiture  : marque, modele, annee, REFERENCE 
location : NOM, PRENOM, REFERENCE, DATE EMPRUNT, DATE RENDU
 
societe      : NOM, TYPE, pays, capital, CA  
actions      : intitulé, montant ouverture, montant fermeture, REFERENCE 
acquisitions : NOM, TYPE, REFERENCE, DATE ACHAT, DATE VENTE


conducteur : NOM, PRENOM, pays, age, annees conduite
trajet     : ville depart, ville arrivee, distance, REFERENCE
livraisons : NOM, PRENOM, REFERENCE, DATE DEPART, DATE ARRIVEE

acheteur     : NOM, PRENOM, banque, emprunt, taux
maison       : intitulé, catégorie, prix, REFERENCE
transactions : NOM, PRENOM, REFERENCE, DATE COMPROMIS, DATE VENTE REELLE 