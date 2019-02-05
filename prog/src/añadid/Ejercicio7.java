package añadid;

public class Ejercicio7 {
	public static void main(String[] args) {
		int [] vectorOrdenados = new int [10];
		int numAleatorio = 0;
		int i=1;
		
		vectorOrdenados[0] = (int) (Math.random() * 10) + 1;
		
		while(i<vectorOrdenados.length) {
			numAleatorio= (int) (Math.random() * 10) + 1;			
			if(numAleatorio>=vectorOrdenados[i-1]) {
				vectorOrdenados[i]=numAleatorio;				
				i++;
			}			
		}
		
		for(i=0;i<vectorOrdenados.length;i++)
			System.out.println("Vector: "+vectorOrdenados[i]);
	}
}
