package añadid;

public class ejerciciosFuncionesYVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec= {2,7,4,7,7}, vec2= {1,2,3,4,5};
		int[] vectorMultiplicado,vectorSuma, vectorPares, vectorPosicionesNumero;
		int numero=7;
		
		/*System.out.println("La primera posición donde "				
				+ "está el número "+numero+" es la: "
						+devuelvePosicion(vec,numero));*/
		/*
		System.out.println("Vector antes de ser modificado..");
		muestraVector(vec);
		
		System.out.println("\nModificando vector multiplicando por 10...\n");
		multiplicaPropioVector(vec,numero);
		
		System.out.println("Vector después de ser modificado...");
		muestraVector(vec);
		
		System.out.println("Vector inicial antes de llamar la función..");
		muestraVector(vec);
		
		vectorMultiplicado=multiplicaVectorEnOtro(vec,10);
		
		System.out.println("Vector inicial después de llamar la función..");
		muestraVector(vec);
		
		System.out.println("Vector multiplicado..");
		muestraVector(vectorMultiplicado);
		
		System.out.println("Mostrando vector 1");
		muestraVector(vec);
		
		System.out.println("\nMostrando vector 2");
		muestraVector(vec2);
		
		vectorSuma=sumaVectores(vec,vec2);		
		
		System.out.println("\nMostrando vector suma...");
		muestraVector(vectorSuma);	

		System.out.println("\nVector inicial...");
		muestraVector(vec);
		
		vectorPares=valoresPares(vec);
		
		System.out.println("\nVector pares....");
		muestraVector(vectorPares);	
		
		System.out.println("\nVector inicial....");
		muestraVector(vec);
		
		vectorPosicionesNumero=devuelvePosiciones(vec,4);
		
		System.out.println("\nVector posiciones....");
		muestraVector(vectorPosicionesNumero);
		
		for (int i=0; i<vectorPosicionesNumero.length; i++) {
			System.out.println("Posición "+vectorPosicionesNumero[i]+" es:"+vec[vectorPosicionesNumero[i]]);
		}*/
		
		
	}
	
	public static void muestraVector(int [] vector)
	{
		for(int i=0;i<vector.length; i++)
			System.out.println("En la posición "+i+" está el valor "+vector[i]);
		}
	
	//Alejandro Sánchez
	public static int devuelvePosicion(int[] vector, int num) {
		int pos=-1;
		
		for (int i = 0; i < vector.length; i++) {
			if ( vector[i] == num) {
				pos=i;
			}
		}
		return pos;
	}
	
	//Abraham

	public static void multiplicaPropioVector(int[] vector, int num) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = vector[i] * num;
		}
	}

	//Álvaro
	public static int [] multiplicaVectorEnOtro(int [] vector,int multiplicador) {
			int [] vector2=vector.clone();
			
			for(int i=0;i<vector.length;i++) {
				vector2[i]*=multiplicador;				
			}
			return vector2;
	}
	
	// Verónica 
	public static int[] sumaVectores(int []v1, int []v2)
	{
		/*sumaVectores: que recibe como parámetro dos vectores (se suponen del mismo tamaño) 
		y devuelve un vector que en cada posición contiene la suma de los valores de los vectores 
		pasados como parámetros para la misma posición. */

			int []v_aux= new int[v1.length];

			for(int i=0; i<v_aux.length; i++)
				v_aux[i]=v1[i]+v2[i];
			
			return v_aux;
	}
	
	
	//Javier Compás
	public static int[] valoresPares(int vector[]) {
			int [] vectorPares = new int [vector.length];
			int posVectorPares=0,tamVectorPares=0;
			
			//cuenta cuantos números pares hay
			for (int i = 0; i < vector.length; i++) {
				if (vector[i]%2==0) {
					tamVectorPares++;
				}
			}
						
			//le doy el tamaño justo de números pares
			vectorPares = new int [tamVectorPares];
			
			//añado los números pares al vector vectorPares
			for (int i = 0; i < vector.length; i++) {
				if (vector[i]%2==0) {
					vectorPares[posVectorPares]=vector[i];
					posVectorPares++;
				}
			}
			return vectorPares;
	}
	
	public static int numeroVecesRepetido(int[]vec,int num)
	{
		int numVeces=0;
	
		for (int i = 0; i < vec.length; i++) {	
			if (vec[i] == num) 
				numVeces++;
		}		
		
		return numVeces;
	}
	
	//Ángel Correro
	public static int [] devuelvePosiciones(int [] vector, int num) {
		int numPos = 0, j = 0;
		
		int tam=numeroVecesRepetido(vector,num);

		int[] v_aux = new int[tam];

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == num) {
				v_aux[j] = i;
				j++;
			}
		}

		return (v_aux);
	}
	
	// Ismael Pozo
	public static int []generaVectorAleatorio (int tam, int min, int max)
		{
			int vectoraleatorio[]= new int [tam];
			
			for (int i=0;i<vectoraleatorio.length;i++)
				vectoraleatorio[i]=(int)(Math.random()*(max-min+1))+min;
			
			return vectoraleatorio;
		}




}
