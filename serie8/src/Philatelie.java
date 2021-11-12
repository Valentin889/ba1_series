import java.util.ArrayList;

class Timbre {

    public static final int ANNEE_COURANTE = 2016;
    public static final int VALEUR_TIMBRE_DEFAUT = 1;
    public static final String PAYS_DEFAUT = "Suisse";
    public static final String CODE_DEFAUT = "lambda";

    public static final int BASE_1_EXEMPLAIRES = 100;
    public static final int BASE_2_EXEMPLAIRES = 1000;
    public static final double PRIX_BASE_1 = 600;
    public static final double PRIX_BASE_2 = 400;
    public static final double PRIX_BASE_3 = 50;

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    
    private String nom;
    private int annee;
    private String pays;
    private double valFacial;
    
    public Timbre() {
    	this(CODE_DEFAUT, ANNEE_COURANTE, PAYS_DEFAUT, VALEUR_TIMBRE_DEFAUT);
    }
    
    public Timbre(String n) {
    	this(n, ANNEE_COURANTE, PAYS_DEFAUT, VALEUR_TIMBRE_DEFAUT);
    }
    
    public Timbre(String n, int a) {
    	this(n, a, PAYS_DEFAUT, VALEUR_TIMBRE_DEFAUT);
    }
    
    public Timbre(String n, int a, String p) {
    	this(n, a, p, VALEUR_TIMBRE_DEFAUT);
    }
    
    public Timbre(String n, int a, String p, double val) {
    	nom = n;
    	annee = a;
    	pays = p;
    	valFacial = val;
    }
    
    
    
    
    @Override
    public String toString() {
    	return "Timbre de code " + nom + " datant de  " + annee + " (provenance " + pays + ") ayant pour valeur faciale " + valFacial+" francs";
    }
    
    public int age() {
    	return ANNEE_COURANTE-annee;
    }
    
    public String getCode() {
    	return nom;
    }
    
    public int getAnnee() {
    	return annee;
    }
    
    public String getPays() {
    	return pays;
    }
    
    public double getValeurFaciale() {
    	return valFacial;
    }
    
    public double vente() {
    	if(age() < 5) {
    		return valFacial;
    	}
    	
    	return valFacial*age()*2.5;
    	
    }
}

class Rare extends Timbre{
	
	private int nbExemplaire;
	
	
	Rare(int nb){
		super();
		nbExemplaire= nb;
	}
	
	Rare(String nom, int nb){
		super(nom);
		nbExemplaire= nb;
	}
	
	
	Rare(String nom, int annee, int nb){
		super(nom, annee);
		nbExemplaire= nb;
	}
	
	Rare(String nom, int annee, String pays, int nb){
		super(nom, annee, pays);
		nbExemplaire= nb;
	}
	
	Rare(String nom, int annee, String pays, Double val, int nb){
		super(nom, annee, pays, val);
		nbExemplaire= nb;
	}
	
	public int getExemplaires() {
		return nbExemplaire; 
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nNombre d’exemplaires -> "+nbExemplaire;
	}
	
	@Override
	public double vente() {
		
		double prixBase = 0;
		if(nbExemplaire<100) {
			prixBase = PRIX_BASE_1;
		} else if(nbExemplaire<1000) {
			prixBase = PRIX_BASE_2;
		} else {
			prixBase = PRIX_BASE_3;
		}
		
		return prixBase * (age() / 10.0);
		
	}
}

class Commemoratif extends Timbre{

	
	public Commemoratif() {
		super();		
	}
	
	public Commemoratif(String nom) {
		super(nom);		
	}
	
	public Commemoratif(String nom, int annee) {
		super(nom, annee);		
	}
	
	public Commemoratif(String nom, int annee, String pays) {
		super(nom, annee, pays);		
	}
	
	public Commemoratif(String nom, int annee, String pays, double val) {
		super(nom, annee, pays, val);		
	}
	
	@Override
	public String toString(){
		return super.toString() + " \n Timbre celebrant un evenement";
	}
	
	@Override
	public double vente() {
		return 2*super.vente();
	}
}



	
/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/

class Philatelie {

    public static void main(String[] args) {

        // ordre des parametres: nom, annee d'emission, pays, valeur faciale,
        // nombre d'exemplaires
        Rare t1 = new Rare("Guarana-4574", 1960, "Mexique", 0.2, 98);

        // ordre des parametres: nom, annee d'emission, pays, valeur faciale
        Commemoratif t2 = new Commemoratif("700eme-501", 2002, "Suisse", 1.5);
        Timbre t3 = new Timbre("Setchuan-302", 2004, "Chine", 0.2);

        Rare t4 = new Rare("Yoddle-201", 1916, "Suisse", 0.8, 3);


        ArrayList<Timbre> collection = new ArrayList<Timbre>();

        collection.add(t1);
        collection.add(t2);
        collection.add(t3);
        collection.add(t4);

        for (Timbre timbre : collection) {
            System.out.println(timbre);
            System.out.println("Prix vente : " + timbre.vente() + " francs");
            System.out.println();
        }
    }
}

