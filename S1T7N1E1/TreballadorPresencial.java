package S1T7N1E1;

public class TreballadorPresencial extends Treballador {
	 
	private static int benzina;

	//constructor
	public TreballadorPresencial(String nom, String cognom, double preuhora, double horas, int benzina) {
		super(nom, cognom, preuhora, horas);
		TreballadorPresencial.benzina = benzina; //com es static benzina s'ha de posar el nom de la clase.benzina i no el this.
		// TODO Auto-generated constructor stub
	}
	
	//getters
	public int getBenzina() {
		return TreballadorPresencial.benzina;
	}
	
	//setters
	public void setBenzina(int benzina) {
		TreballadorPresencial.benzina = benzina;
	}

	@Override
	public double calcularSou(double horas) {
		
		double preuFinal = (super.getHoras() * super.getPreuhora()) + TreballadorPresencial.benzina;
				
				return preuFinal;	
	}

	@Override
	public String toString() {
		return "El treballador " + super.getNom() + " " + super.getCognom() + " treballa de manera presencial i te un sou de "
				+ super.getPreuhora() + " euros l'hora amb una nomina final de " + this.calcularSou(super.getHoras()) + " euros/mes.";
	}

}
