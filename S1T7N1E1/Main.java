package S1T7N1E1;
 
import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		ArrayList<Treballador> empresa = new ArrayList<Treballador>();
		
		Treballador treballador1 = new Treballador("Ismael", "Tortosa", 30, 160);
		TreballadorPresencial treballador2 = new TreballadorPresencial("Federico", "Fernández", 17, 160, 100);
		TreballadorOnline treballador3 = new TreballadorOnline("Bruce", "Wayne", 20, 160);
		
		empresa.add(treballador1);
		empresa.add(treballador2);
		empresa.add(treballador3);
		
		
		System.out.println(treballador1.toString());
		System.out.println(treballador2.toString());
		System.out.println(treballador3.toString());
		// TODO Auto-generated method stub

	}

}
