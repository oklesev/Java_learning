
public class Krogi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int N = 8; //Definiramo število krogov
		final int A = 10; //Definiramo dolžino kvadrata
		
		int v = 0; //število krogov v kvadratu
		int izven = 0; //število krogov izven kvadrata
		int seka = 0; //število krogov, ki sekajo kvadrat
		
		for(int i=0; i<N; i++){//For zanka za vnos premerov krogov
			System.out.print("Vtipkaj premer: ");//Izpis teksta
			double premer = BranjePodatkov.preberiDouble();//Vnos premera kroga
			if(premer < A)//preverjanje ali je premer manjši od dolžine kvadrata 
				v++;
			else if(premer > A*Math.sqrt(2))//Preverjanje ali je premer veèji od dolžine diagonale kvadrata
				izven++;
			else//Drugaèe krog seka ali se dotika stranice kvadrata
				seka++;
		}
		System.out.println("Znotraj je " + v + " krogov.");//Izpis rezultatov
		System.out.println("Kvadrat seka " + seka + " krogov.");
		System.out.println("Izven je " + izven + " krogov.");
	}

}
