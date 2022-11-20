import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestGraphe {
	//cette classe est à effacer. C'est juste pour tester les classes
	
	public static void main(String[] argv)
	{
		Scanner sc = new Scanner(System.in);
		
		Graphe g = Menus.Menu1(sc);
		
		Menus.Menu2(g, sc);
		
		sc.close();
		
		//Graphe g2 = new Graphe(7);
		//g2.afficher();
		
		/*Graphe g = new Graphe();
		g.ajouterNoeud(new Node("A"));
		g.ajouterNoeud(new Node("B"));
		g.ajouterNoeud(new Node("C"));
		g.ajouterNoeud(new Node("D"));
		
		g.ajouterContradiction(new Node("A"), new Node("B"));
		g.ajouterContradiction(new Node("B"), new Node("C"));
		g.ajouterContradiction(new Node("B"), new Node("D"));*/
		/*Graphe g = new Graphe();
		g.ajouterNoeud(new Node("A"));
		g.ajouterNoeud(new Node("B"));
		g.ajouterNoeud(new Node("C"));
		g.ajouterNoeud(new Node("D"));
		
		g.ajouterContradiction(new Node("A"), new Node("B"));
		g.ajouterContradiction(new Node("B"), new Node("C"));
		g.ajouterContradiction(new Node("C"), new Node("D"));
		g.ajouterContradiction(new Node("D"), new Node("C"));
		g.ajouterContradiction(new Node("C"), new Node("B"));
		g.ajouterContradiction(new Node("B"), new Node("A"));
		
		g.afficher();
		
		//g.retirerNoeud(new Node("A"));
		//g.afficher();*/
		
		//creation d'une solution
		/*
		Scanner sc = new Scanner(System.in);
		ArrayList<Node> noeuds = new ArrayList<Node>();
		noeuds.add(new Node("A"));
		noeuds.add(new Node("D"));
		noeuds.add(Menus.demanderNoeud(sc));
		
		Solution sol = new Solution(noeuds);
		sol.afficher_noeuds();
		//sol.retirerNoeud(new Node("A"));
		sol.retirerNoeud(Menus.demanderNoeud(sc));
		sol.afficher_noeuds();
		
		sc.close();*/
		//verifions si la solution est admissible
		//System.out.println(sol.verifie_critere2(g));
		
	}
	
	
}
