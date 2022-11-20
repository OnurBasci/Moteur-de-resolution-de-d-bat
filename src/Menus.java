import java.util.Scanner;
import java.util.ArrayList;

public class Menus {
	
	public static void Bienvenu() {
		System.out.println("########################################################### Nous avons les solution à vos débats ! ###########################################################");
	}
	
	public static Graphe Menu1(Scanner sc) {
		/*Cette fonction cree un graphe à partir des instructions des utilisateurs et retourne ce graphe*/
		
		//demander la taille du graphe
		//sc = new Scanner(System.in);
		int nombre_arguments = 0;
		System.out.println(" Combien y a t-il d'arguments ? : ");
		
		do{
			 nombre_arguments=sc.nextInt();
		}while(nombre_arguments<0);
		
		//créeons le graphe
		Graphe g = new Graphe(nombre_arguments);
		
		int choix;
		boolean fin=false;
		while(!fin) {
			System.out.println("        Choissiez entre  :           ");
			System.out.println("1) Ajouter une contradiction");
			System.out.println("2) Finir");
			
			//demander choix
			do{
				System.out.println("Rentrer 1 ou 2 selon votre choix s'il vous plaît :");
				choix = sc.nextInt();
			}while(choix!=1 && choix!=2);
			
			//ajouter contradiction
			if(choix==1) {
				sc.nextLine();
				System.out.println("Voici la liste des arguments");
				g.afficherNoeud();
				System.out.println("L'argument contradictoire est :");	
				String Arg_contradictoire=sc.nextLine();
				System.out.println("L'argument contredit est :");
				String Arg_contredit=sc.nextLine();
				
				try
				{
					g.ajouterContradiction(new Node(Arg_contradictoire), new Node(Arg_contredit));
				}catch(IllegalArgumentException e)
				{
					System.out.println(e.toString());
					continue;
				}
				
				//afficher la situation actuelle du graphe
				System.out.println("La situation actuelle du graphe");
				g.afficher();
			}//sortir
			else {
				fin=true;
			}
			
		}
		
		//afficher la situation finale du graphe
		System.out.println("La situation finale du graphe");
		g.afficher();
		
		return g;
	}
	
	public static Solution Menu2(Graphe g, Scanner sc)
	{
		System.out.println("\n");
		/*Cette fonction cree une solution à partir des instructions des utilisateurs et retourne cette solution*/
		System.out.println("Pour proposer une solution");
		
		//creeons la solution
		Solution sol = new Solution();
		
		//Scanner sc = new Scanner(System.in);
		
		int choix;
		boolean fin = false;
		
		do
		{
			System.out.println("La situation actuelle de la solution :");
			sol.afficher_noeuds();
			//demander choix
			System.out.println("Veuillez choissir entre :");
			System.out.println("1) Ajouter un argument dans votre solution");
			System.out.println("2) Retirez un argument de votre solution");
			System.out.println("3) Vérifiez la solution");
			System.out.println("4) Finir");
			choix = sc.nextInt();
			
			switch(choix)
			{
			case 1: //ajouter noeud
				try
				{
					System.out.println("Voici la liste des arguments :");
					g.afficherNoeud();
					sol.ajouterNoeud(demanderNoeudGraphe(sc), g);
				}catch(IllegalArgumentException e)
				{
					System.out.println(e.toString());
				}
				break;
			case 2:
				System.out.println("Voici la liste des arguments :");
				sol.afficher_noeuds();
				sol.retirerNoeud(demanderNoeudSolution(sc));
				break;
			case 3:
				sol.verifie_criteres(g);
				break;
			case 4:
				fin = true;
				System.out.println("La situation actuelle de la solution :");
				sol.afficher_noeuds();
				sol.verifie_criteres(g);
				break;
			}
		}while(!fin);
		
		return sol;
	}
	
	public static Node demanderNoeudGraphe(Scanner sc)
	{
		System.out.println("Veuillez choisir un argument du graphe");
		String contenu = sc.next();
		Node noeud = new Node(contenu);
		return noeud;
	}
	public static Node demanderNoeudSolution(Scanner sc)
	{
		System.out.println("Veuillez choisir un argument de la solution");
		String contenu = sc.next();
		Node noeud = new Node(contenu);
		return noeud;
	}
}
