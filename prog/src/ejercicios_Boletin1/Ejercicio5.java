package ejercicios_Boletin1;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*PEDIR AL USUARIO DOS N�MEROS ENTEROS Y MUESTRE POR PANTALLA EL 
		   COCIENTE DE LA DIVISI�N DEL PRIMERO POR EL SEGUNDO Y TAMBI�N EL RESTO 
		   QUE DA DE DIVIDIR LOS DOS*/
		 
		int dividendo=0, divisor=0, cociente=0, resto=0;
		
		System.out.println("Introduzca el dividendo");
		dividendo=Entrada.entero();
		
		System.out.println("Introduzca el divisor");
		divisor=Entrada.entero();
		
		cociente=dividendo/divisor;
		System.out.println("El cociente de la divisi�n es:"+cociente);
		
		resto=dividendo%divisor;
		System.out.println("El resto de la divisi�n es:"+resto);
		
	}

}
