package S1T7N1E1;

public class TreballadorOnline extends Treballador {
	//atributs
	private static final int internet = 120;
 
	//constructor
	public TreballadorOnline(String nom, String cognom, double preuhora, double horas) {
		super(nom, cognom, preuhora, horas);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSou(double horas) {
		double preuFinal = (super.getHoras() * super.getPreuhora()) + internet;
		
		return preuFinal;
	}
	
	@Override
	public String toString() {
		return "El treballador " + super.getNom() + " " + super.getCognom() + " treballa des de casa i te un sou de "
				+ super.getPreuhora() + " euros l'hora amb una nomina final de " + this.calcularSou(super.getHoras()) + " euros/mes.";
	}
	

}
