
public class MetiKocke {

	public static void main(String[] args) {
		System.out.print("Stevilo metov: ");//Izpis
		int n = BranjePodatkov.preberiInt();//Vnos števila metov
		int stevilo1 = 0, stevilo2 = 0, stevilo3 = 0, stevilo4 = 0, stevilo5 = 0, stevilo6 = 0;//Številke kocke
		for(int i = 0; i < n; i++){
			int met = (int)(6*Math.random()+1);//nakljuèno izbrano število, Math.random() vrne število med 0.0 in 1.0, nikoli ne poda 1.0
			//System.out.print(met + "\n");//izpis vrednosti kocke
			
			switch(met){//Switch za seštevanje metov za posamezno število
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
		System.out.print("Število 1: " + stevilo1 + "\nŠtevilo 2: " + stevilo2 + "\nŠtevilo 3: " + stevilo3 + "\nŠtevilo 4: " + stevilo4 + "\nŠtevilo 5: " + stevilo5 + "\nŠtevilo 6: " + stevilo6);
	}

}
