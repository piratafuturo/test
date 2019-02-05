package añadid;

public class ejerciciosInicialesMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1= {{3,5,7},
					   {1,-1,9},	
				       {3,3,3}};
		
		int[][] matIdent= {{1,0,0},
						   {0,7,0},	
			               {0,0,1}};
		
		int[][]mat2= {{1,9},{3,7,4,6,7,9,11,13}};
		
		//muestraValoresMatriz(matIdent);
		
		//System.out.println("La suma de la matriz mat2 es:"
		//							+sumaMatriz(mat1));
		
		//buscaElemento(mat2, -6);
		
	/*	if(esMatrizCuadrada(mat1))
			System.out.println("La matriz es cuadrada");
		else
			System.out.println("La matriz NO es cuadrada");*/
		
	 /*if(esMatrizIdentidad(matIdent))
			System.out.println("La matriz es identidad");
		else
			System.out.println("La matriz NO es identidad");
	  
		int [][] matTrianguSup= {{7,4,0,2},{0,1,1,1},{0,0,9,3},{0,,0,5}};
		muestraMatriz(matTrianguSup);
		
		if(esMatrizTriangularSuperior(matTrianguSup))
			System.out.println("La matriz es triangular superior");
		else
			System.out.println("la matriz no es trinagular superior");
		
		int [][] matTrianguInf= {{5,0,0,0},{9,3,0,0},{1,1,1,0},{7,4,0,2}};		
		
		muestraMatriz(matTrianguInf);
		if(esMatrizTriangularInferior(matTrianguInf))
			System.out.println("La matriz es triangular inferior");
		else
			System.out.println("la matriz no es triangular inferior");
			*/
	}
		
	public static void muestraValoresMatriz(int[][]mat)
	{
		for (int i = 0; i < mat[0].length; i++) {
			System.out.print("\t"+i);
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
	// Juan Manuel Moreno
	public static int sumaMatriz(int[][] matriz) {
		int suma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}
	
	// Sandra
	public static void buscaElemento(int [][]matriz, int num) {
			int aparicion=0;
			
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++)	{
					if (matriz[i][j]==num) {
						System.out.println("\nEl número "+num+
												" se encuentra en la fila "
														+i+" y en la columna "+j);
						aparicion++;
					}
				}
			}
			
			
			System.out.println("\nEl número ha aparecido "+aparicion+" veces");			
		}
	
	//Javier
	public static boolean esMatrizCuadrada (int [][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			if(matriz.length!=matriz[i].length)
				return false;
		}
		
		return true;
	}

	//Ángel
	public static boolean esMatrizEscalar(int [][] matriz) {
		int i=1, diagonal=matriz[0][0];		
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		while(i<matriz.length) {
			if (matriz[i][i]!=diagonal) {
				return false;
			}
			i++;
		}
		
	/*	for(i=1;i<matriz.length;i++)
		{
			if(matriz[i-1][i-1]!=matriz[i][i])
				return false;
		}*/
		
		return true;
	}

	//Antonio
/*	public static boolean esMatrizIdentidad (int [][] m) {
		int contadorIguales=0;
		int cont=0;
		
		if(esMatrizCuadrada(m)) {

			for (int i=0; i<m.length; i++) {
				for (int j=0; j<m[i].length; j++) {
					if(contadorIguales<m.length-1) {
						if (m[i][cont]==1 && m[i+1][cont+1]==1)
							contadorIguales++;
						else if(m[i][j]!=0 ) 
							return false;
					}
				}
				cont++;
			}
			return true;
		}
		return false;
	}*/

	public static boolean esMatrizIdentidad(int[][] matriz) {
		if(!esMatrizCuadrada(matriz))
			return false;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {			
				if(i==j && matriz[i][j]!=1)
					return false;
				else if(i!=j && matriz[i][j]!=0)
					return false;				
			}
		}
		
		return true;
	}

	// Verónica	
	public static int tamanyoMaximoColumnas(int[][]mat)
	{
		int max=0;
		for (int i=0; i<mat.length; i++)
			if(max<mat[i].length)
				max=mat[i].length;
		
		return max;			
	}
	
	public static void muestraMatriz(int [][]mat)
	{
		int tam=tamanyoMaximoColumnas(mat);
		
		for (int i=0; i<tam; i++)
			System.out.print("\t"+i);
		System.out.println();
		
		for (int i=0; i<mat.length; i++)
		{
			System.out.print(i);
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println();
		}
	}

	//GAONA

	public static boolean esMatrizTriangularSuperior(int[][] matriz) {
		if(!esMatrizCuadrada(matriz))
			return false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j < i && matriz[i][j] != 0) {
					return false;

				}
			}

		}

		return true;
		
		}
		

		
		public static boolean esMatrizTriangularInferior(int[][] matriz) {
			if(!esMatrizCuadrada(matriz))
				return false;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (j > i && matriz[i][j] != 0) {
						return false;

					}
				}

			}

			return true;
			
		}


		// Manuel
		
		public static boolean diagonalDistintoACero(int [][]mat)
		{
			for(int i=0;i<mat.length;i++)
				if(mat[i][i]==0)
					return false;
			
			return true;
		}
	public static String esMatrizTriangular(int[][] matrix) {

		if (esMatrizCuadrada(matrix) 
				&& esMatrizTriangularInferior(matrix) 
					&& esMatrizTriangularSuperior(matrix) 
					&& diagonalDistintoACero(matrix)) {
			return new String("Es diagonal");
		} else {

			if (esMatrizTriangularSuperior(matrix)) {

				return new String("Es triangular superior");

			} else {

				if (esMatrizTriangularInferior(matrix)) {

					return new String("Es triangular inferior");

				} else {

					return new String("No es triangular");

				}
			}
		}
	}

		//Fran Muñoz

		public static double[][] sumaMatrices(double[][] matriz, double[][] matriz2) {
				double[][] matrizSuma = matriz;

				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						matrizSuma[i][j] = matrizSuma[i][j] + matriz2[i][j];
					}
				}
				return matrizSuma;
			}



		//Francisco Javier
		public static double [][] multiplicaMatrices(double [][] matriz1, double [][] matriz2) {
			double [][] resultado=new double [matriz1.length][matriz2[0].length];
			if (matriz1.length==matriz2[0].length) {
				for (int i=0; i<matriz1.length; i++) {
					for (int j=0; j<matriz2[i].length; j++) {
						for (int k=0; k<matriz1[i].length;k++) {
							resultado[i][j]+=(matriz1[i][k]*matriz2[k][j]);
						}
					}
				}
			}
			return resultado;
		}


}
