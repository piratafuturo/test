package añadid;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=2;
		int[] vectorAleatorio = new int[20];

		for (int i = 0; i < vectorAleatorio.length; i++) {
			vectorAleatorio[i] = (int) (Math.random() * 50 + 1);
		}
		
		for (int i = 0; i < vectorAleatorio.length; i++) {	
			while(j<=(i/2) && (i%j!=0)) {
				j++;
			}//Solucionar, porque considera el numero 0 un número primo.
			if(j>(i/2) && i!=0) {
				System.out.println(vectorAleatorio[i]);				
			}
			
			j=2;
		}
	}

}
