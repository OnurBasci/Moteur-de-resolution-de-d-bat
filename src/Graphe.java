import java.util.ArrayList;
import java.util.HashMap;

public class Graphe {
	
	private HashMap<Node, ArrayList<Node>> noeuds_map;
	//private ArrayList<Node> noeuds;
	//private ArrayList<Node[]> Liste_adjacence;
	
	//Si les noeuds et les adjacences sont définies
	public Graphe(HashMap<Node, ArrayList<Node>> noeuds_map)
	{
		this.noeuds_map = noeuds_map;
	}
	
	//si on ne connait rien
	public Graphe()
	{
		this(new HashMap<Node, ArrayList<Node>>());
	}
	
	public Graphe(int n)
	{
		/*Cette construction génere automatiquement un arbre de n noeud en les nommant A1, A2...An*/
		//Creons le Hashmap
		this();
		//ajoutons les noeuds
		for(int i = 1; i <= n; i++)
		{
			ajouterNoeud(new Node("A"+i));
		}
	}
	
	public void ajouterNoeud(Node noeud, ArrayList<Node> voisins)
	{
		noeuds_map.put(noeud, voisins);
	}
	
	public void ajouterNoeud(Node noeud)
	{
		this.ajouterNoeud(noeud, new ArrayList<Node>());
	}
	
	public void ajouterContradiction(Node n, Node contradiction) throws IllegalArgumentException
	{
		//Si les arguments ne sont pas dans le Hashmap
		if(!noeuds_map.containsKey(n) || !noeuds_map.containsKey(contradiction))
		{
			throw new IllegalArgumentException("Les noeuds doivent être dans le graphe");
		}
		noeuds_map.get(n).add(contradiction);
	}
	
	public void retirerNoeud(Node noeud)
	{
		//On retire le noeud de la liste s'il est dans la liste. On le signale sinon
		if(!noeuds_map.containsKey(noeud))
		{
			System.out.println(noeud.toString() + "n'est pas dans la graphe");
		}
		noeuds_map.remove(noeud);
	}
	
	//a effacer/pour tester
	public void afficher()
	{
		for(Node n : noeuds_map.keySet())
		{
			System.out.println(n.toString() + ": " + noeuds_map.get(n).toString());
		}
	}
	
	public void afficherNoeud() {
		System.out.println(noeuds_map.keySet());
	}
	
	public void initialiserGraphe()
	{
		for(Node n : noeuds_map.keySet())
		{
			n.setTraite(false);
		}
	}

	public HashMap<Node, ArrayList<Node>> getNoeuds_map() {
		return noeuds_map;
	}

	public void setNoeuds_map(HashMap<Node, ArrayList<Node>> noeuds_map) {
		this.noeuds_map = noeuds_map;
	}
}
