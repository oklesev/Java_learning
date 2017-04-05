
public class Krogi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int N = 8; //Definiramo �tevilo krogov
		final int A = 10; //Definiramo dol�ino kvadrata
		
		int v = 0; //�tevilo krogov v kvadratu
		int izven = 0; //�tevilo krogov izven kvadrata
		int seka = 0; //�tevilo krogov, ki sekajo kvadrat
		
		for(int i=0; i<N; i++){//For zanka za vnos premerov krogov
			System.out.print("Vtipkaj premer: ");//Izpis teksta
			double premer = BranjePodatkov.preberiDouble();//Vnos premera kroga
			if(premer < A)//preverjanje ali je premer manj�i od dol�ine kvadrata 
				v++;
			else if(premer > A*Math.sqrt(2))//Preverjanje ali je premer ve�ji od dol�ine diagonale kvadrata
				izven++;
			else//Druga�e krog seka ali se dotika stranice kvadrata
				seka++;
		}
		System.out.println("Znotraj je " + v + " krogov.");//Izpis rezultatov
		System.out.println("Kvadrat seka " + seka + " krogov.");
		System.out.println("Izven je " + izven + " krogov.");
	}

}
