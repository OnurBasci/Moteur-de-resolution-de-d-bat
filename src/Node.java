import java.util.Objects;

public class Node implements Comparable<Node>{
	
	//Je represente le noeud avec une chaine de caractère
	private String contenu;
	private boolean traite; //pour dfs
	private boolean verifie_criteres;  //pour les critères
	
	public Node(String contenu)
	{
		this.contenu = contenu;
		this.traite = false;
		this.verifie_criteres = false;
	}
	
	
	@Override
	public int compareTo(Node noeud)
	{
		if(this == noeud)
		{
			return 0;
		}
		else if(contenu == noeud.getContenu())
		{
			return 0;
		}
		else if(this.contenu.compareTo(noeud.getContenu()) > 1)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	@Override
	public String toString()
	{
		return contenu;
	}
	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contenu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return Objects.equals(contenu, other.contenu);
	}

	public boolean isTraite() {
		return traite;
	}

	public void setTraite(boolean traite) {
		this.traite = traite;
	}

	public boolean isVerifie_criteres() {
		return verifie_criteres;
	}

	public void setVerifie_criteres(boolean verifie_criteres) {
		this.verifie_criteres = verifie_criteres;
	}

}
