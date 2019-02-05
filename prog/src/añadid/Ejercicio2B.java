package añadid;

public class Ejercicio2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] vectorInicial = new int[5];		
				int[] vectorPares;
				int[] vectorImpares;
				int contP=0,contI=0;
				int posVectorPar=0, posVectorImpar=0;

				for (int i = 0; i < vectorInicial.length; i++) {
					System.out.println("Dale un valor entre 1 y 20 para la posición " + i);
					vectorInicial[i] = Entrada.entero();

				}
				
				for(int i=0; i<vectorInicial.length;i++) {
					if(vectorInicial[i]%2==0)
						contP++;
					else
						contI++;
				}
				
				vectorPares=new int[contP];
				vectorImpares=new int[contI];
				
				
				for (int i = 0; i < vectorInicial.length; i++) {
					if(vectorInicial[i]%2==0) {
						vectorPares[posVectorPar]=vectorInicial[i];
						posVectorPar++;
					}else {
						vectorImpares[posVectorImpar]=vectorInicial[i];
						posVectorImpar++;
						
					}
				}
				
				for(int i=0;i<vectorPares.length;i++) {
					System.out.println("Posición "+i+":"+vectorPares[i]);
					  
				 }
				
				System.out.println();
				for(int i=0;i<vectorImpares.length;i++) {
					System.out.println("Posición "+i+":"+vectorImpares[i]);
				}
				
			}

}

