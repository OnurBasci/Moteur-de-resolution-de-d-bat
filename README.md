# Moteur-de-resolution-de-d-bat
U.Paris Cité  2022/2023                                                                                                                                                              
L3 Info 
BASCI Onur, MABROUK Mohy, SINGH Manjot




Projet : Moteur de résolution de débat


##. Description du projet


Ce projet est fait pour le cours de programmation avancée. Il s’agit d’implémenter un programme qui propose une modélisation de débat simple. Nous avons pour l’instant réalisé la première partie du projet. Dans cette partie le programme vérifie si la solution saisie par l’utilisateur est admissible ou pas. 


###  Execution du programme
            
            2.1) Execution via Eclipse


                      D’abord ouvrir le logiciel Eclipse. Puis cliquez sur le bouton droit de la souris sur la fenêtre “Package Explorer”. Choisir “import” → “Existing projects into workspace”. “Select archive file” → “Browse” Trouver et choisir le fichier Debat_Singh_Basci_Mabrouk.zip dans votre répertoire. Enfin clique droit sur le projet importé → “Run as” → “Java application”.






            2.2) Execution via le terminal de commandes


                     Tout d’abord verifier la version de java avec “java -version” Le projet a été sous java version 17.0.3.
Tout d’abord il faut se placer dans le bon chemin d’accés avec la commande ”cd” .
Puis compiler le programme avec “ javac TestGraphe.java”.
Puis exécuter le programme avec “java TestGraphe” .


#### Fonctionnement du programme


Les méthodes de chaque classe sont détaillés dans la java doc qui sera réalisé pendant la phase 2


Notre projet java contient 5 classes : 


Node : Cette classe permet de représenter d’un nœud d’un graphe. Chaque nœud contient une chaîne de caractères en tant qu’identifiant.


Graphe : Dans cette classe un graphe est modélisé par un HashMap, les clés sont les noeuds du graphe  c’est à dire les arguments du débat et les valeurs la liste d’adjacence de chaque noeud c’est à dire les arguments qui sont contredits par la clé.


Menus : Cette classe utilitaire sert à l'interaction utilisateur/programme (i.e Entrée/Sortie). 


Solution : Une solution est représentée par une liste de chaîne de caractères.


Test Graphe : Cette classe contient la méthode main.
