
public class Krogi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int N = 8; //Definiramo �tevilo krogov
		final int A = 10; //Definiramo dol�ino kvadrata
		
		int v = 0; //�tevilo krogov v kvadratu
		int izven = 0; //�tevilo krogov izven kvadrata
		int seka = 0; //�tevilo krogov, ki sekajo kvadrat
		
		for(int i=0; i<N; i++){
			System.out.print("Vtipkaj premer: ");
			double premer = BranjePodatkov.preberiDouble();
			if(premer < A)
				v++;
			else if(premer > A*Math.sqrt(2))
				izven++;
			else
				seka++;
		}
		System.out.println("Znotraj je " + v + " krogov.");
		System.out.println("Kvadrat seka " + seka + " krogov.");
		System.out.println("Izven je " + izven + " krogov.");
	}

}
