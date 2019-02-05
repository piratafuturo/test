package a�adid;

public class ejerciciosFuncionesYVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec= {2,7,4,7,7}, vec2= {1,2,3,4,5};
		int[] vectorMultiplicado,vectorSuma, vectorPares, vectorPosicionesNumero;
		int numero=7;
		
		/*System.out.println("La primera posici�n donde "				
				+ "est� el n�mero "+numero+" es la: "
						+devuelvePosicion(vec,numero));*/
		/*
		System.out.println("Vector antes de ser modificado..");
		muestraVector(vec);
		
		System.out.println("\nModificando vector multiplicando por 10...\n");
		multiplicaPropioVector(vec,numero);
		
		System.out.println("Vector despu�s de ser modificado...");
		muestraVector(vec);
		
		System.out.println("Vector inicial antes de llamar la funci�n..");
		muestraVector(vec);
		
		vectorMultiplicado=multiplicaVectorEnOtro(vec,10);
		
		System.out.println("Vector inicial despu�s de llamar la funci�n..");
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
			System.out.println("Posici�n "+vectorPosicionesNumero[i]+" es:"+vec[vectorPosicionesNumero[i]]);
		}*/
		
		
	}
	
	public static void muestraVector(int [] vector)
	{
		for(int i=0;i<vector.length; i++)
			System.out.println("En la posici�n "+i+" est� el valor "+vector[i]);
		}
	
	//Alejandro S�nchez
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

	//�lvaro
	public static int [] multiplicaVectorEnOtro(int [] vector,int multiplicador) {
			int [] vector2=vector.clone();
			
			for(int i=0;i<vector.length;i++) {
				vector2[i]*=multiplicador;				
			}
			return vector2;
	}
	
	// Ver�nica 
	public static int[] sumaVectores(int []v1, int []v2)
	{
		/*sumaVectores: que recibe como par�metro dos vectores (se suponen del mismo tama�o) 
		y devuelve un vector que en cada posici�n contiene la suma de los valores de los vectores 
		pasados como par�metros para la misma posici�n. */

			int []v_aux= new int[v1.length];

			for(int i=0; i<v_aux.length; i++)
				v_aux[i]=v1[i]+v2[i];
			
			return v_aux;
	}
	
	
	//Javier Comp�s
	public static int[] valoresPares(int vector[]) {
			int [] vectorPares = new int [vector.length];
			int posVectorPares=0,tamVectorPares=0;
			
			//cuenta cuantos n�meros pares hay
			for (int i = 0; i < vector.length; i++) {
				if (vector[i]%2==0) {
					tamVectorPares++;
				}
			}
						
			//le doy el tama�o justo de n�meros pares
			vectorPares = new int [tamVectorPares];
			
			//a�ado los n�meros pares al vector vectorPares
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
	
	//�ngel Correro
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
