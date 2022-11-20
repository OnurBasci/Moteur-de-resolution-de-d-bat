import java.util.ArrayList;

public class Solution {
	/*Cette classe représente la solution proposé par l'utilisateur*/
	
	private ArrayList<Node> noeuds;
	
	//ces valuers sont pour grader les noeuds qui posent le problème pour obtenir une sollution admissible
	private Node n_problematique1;
	private Node n_problematique2;
	
	private Node n_problematique3;
	
	public Solution(ArrayList<Node> noeuds)
	{
		this.noeuds = noeuds;
		
		n_problematique1 = null;
		n_problematique2 = null;
		n_problematique3 = null;
	}
	
	public Solution()
	{
		//créer une liste vide
		this(new ArrayList<Node>());
		
		n_problematique1 = null;
		n_problematique2 = null;
		n_problematique3 = null;
	}
	
	public void ajouterNoeud(Node noeud, Graphe g) throws IllegalArgumentException
	{
		//si le noeud n'est pas dans la graphe envoie un erreur
		if(!g.getNoeuds_map().keySet().contains(noeud))
		{
			throw new IllegalArgumentException("Le noeud inserré n'est pas dans le graphe.");
		}
		//si le noeud est déja dans la solution on le signale
		if(noeuds.contains(noeud))
		{
			System.out.println("Le noeud est déjà dans la solution");
			return;
		}
		noeuds.add(noeud);
	}
	
	public void retirerNoeud(Node noeud)
	{
		//On retire le noeud de la liste s'il est dans la liste. On le signale sinon
		if(noeuds.contains(noeud))
		{
			Node n_supprime = noeuds.remove(noeuds.indexOf(noeud));
			System.out.println(n_supprime.toString() + " est efface");
			return;
		}
		System.out.println(noeud.toString() + "n'est pas dans la solution");
		/*
		int i;
		for(i = 0; i < noeuds.size(); i ++)
		{
			if(noeuds.get(i).compareTo(noeud) == 0)
			{
				//on supprime l'element et on sort de la boucle
				Node n_supprime = noeuds.remove(i);
				System.out.println(n_supprime.toString() + " est efface");
				break;
			}
		}
		
		//si l'element n'est pas dans la liste on l'enonce
		if(i == noeuds.size())
		{
			System.out.println(noeud.toString() + "n'est pas dans la solution");
		}*/
	}
	
	public void afficher_noeuds()
	{
		if(noeuds.size()==0)
			System.out.print("Vide");
		else {
			for(int i = 0; i < noeuds.size(); i ++){ 
				if(i==0)
					System.out.print(noeuds.get(0).toString());
				else
					System.out.print(", "+noeuds.get(i).toString());
			}
			
		}
		
		//sauter une ligne
		System.out.print("\n");
	}
	
	public boolean verifie_critere2(Graphe G)
	{
		for(Node a: noeuds)
		{
			for(Node b: G.getNoeuds_map().keySet())
			{
				//si (b,a) existe
				if(G.getNoeuds_map().get(b).contains(a))
				{
					boolean trouve = false;
					for(Node c: noeuds)
					{
						//si (c,a) existe
						if(G.getNoeuds_map().get(c).contains(b))
						{
							trouve = true;
						}
					}
					if(!trouve)
					{
						n_problematique3 = a;
						return false;
					}
				}
			}
		}
		//si (b,a) n'appartient pas dans noeuds alors retourne vrai aussi
		return true;
	}
	
	public boolean verifie_critere1(Graphe g)
	{
		for(Node a:noeuds)
		{
			for(Node b:noeuds)
			{
				//si (b,a) existe
				if(g.getNoeuds_map().get(a).contains(b))
				{	
					n_problematique1 = a;
					n_problematique2 = b;
					return false;
				}
			}
		}
		return true;
	}
	
	public void verifie_criteres(Graphe g)
	{
		if(!verifie_critere1(g))
		{
			System.out.println("Deux arguments se contredisent: " + n_problematique1 + " " + n_problematique2);
			return;
		}
		else if(!verifie_critere2(g))
		{
			System.out.println("Argument " + n_problematique3 + " non defendu");
			return;
		}
		System.out.println("La solution actuelle est une solution admissible.");
	}
	
	public ArrayList<Node> getNoeuds() {
		return noeuds;
	}

	public void setNoeuds(ArrayList<Node> noeuds) {
		this.noeuds = noeuds;
	}
}
