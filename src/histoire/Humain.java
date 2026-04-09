package histoire;
public class Humain{
	
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom,String boissonFavorite,int argent) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.argent=argent;
	}
	public String getnom() {
		return this.nom;
	}
	public int getARgent() {
		return this.argent;
	}
	private void parler(String texte) {
		System.out.println(nom+" : "+texte);
	}
	private void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonFavorite);
	}
	public void Boire() {
		System.out.println("Mmmmm, un bon verre de "+boissonFavorite+" GLOUPS!");
	}
	
	private void gagnerargent(int gain){
		this.argent+=gain;
	}
	private void perdreargent(int perte){
		this.argent-=perte;
	}
	public void acheter(String bien,int prix) {
		if (prix<this.argent) {
			this.perdreargent(prix);
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");}
	}
	public static void main(String[] args) {
		
		Humain robin = new Humain("Robin","Oasis",0);
		Humain louis = new Humain("Louis","Coca",0);
		
		robin.direBonjour();
		louis.direBonjour();
		
		robin.parler("comment ca va?");
		louis.parler("ca va bien merci !");
		
		robin.gagnerargent(100);
		
		robin.acheter("Oasis", 10);
		louis.acheter("Coca", 10);
		
		System.out.println(robin.getnom()+" à "+ robin.getARgent()+" sous en poche!");
		System.out.println(louis.getnom()+" à "+ louis.getARgent()+" sous en poche!");
		
		
	}
}