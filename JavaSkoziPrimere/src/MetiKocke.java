
public class MetiKocke {

	public static void main(String[] args) {
		System.out.print("Stevilo metov: ");//Izpis
		int n = BranjePodatkov.preberiInt();//Vnos �tevila metov
		int stevilo1 = 0, stevilo2 = 0, stevilo3 = 0, stevilo4 = 0, stevilo5 = 0, stevilo6 = 0;//�tevilke kocke
		for(int i = 0; i < n; i++){
			int met = (int)(6*Math.random()+1);//naklju�no izbrano �tevilo, Math.random() vrne �tevilo med 0.0 in 1.0, nikoli ne poda 1.0
			//System.out.print(met + "\n");//izpis vrednosti kocke
			
			switch(met){//Switch za se�tevanje metov za posamezno �tevilo
				case 1: 
					stevilo1++;
					break;
				case 2:
					stevilo2++;
					break;
				case 3:
					stevilo3++;
					break;
				case 4:
					stevilo4++;
					break;
				case 5:
					stevilo5++;
					break;
				case 6:
					stevilo6++;
					break;
			}
		}
		//Izpis rezultatov
		System.out.print("�tevilo 1: " + stevilo1 + "\n�tevilo 2: " + stevilo2 + "\n�tevilo 3: " + stevilo3 + "\n�tevilo 4: " + stevilo4 + "\n�tevilo 5: " + stevilo5 + "\n�tevilo 6: " + stevilo6);
	}

}
