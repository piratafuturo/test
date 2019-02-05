package ejercicios_Boletin1;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*PEDIR AL USUARIO DOS NÚMEROS ENTEROS Y MUESTRE POR PANTALLA EL 
		   COCIENTE DE LA DIVISIÓN DEL PRIMERO POR EL SEGUNDO Y TAMBIÉN EL RESTO 
		   QUE DA DE DIVIDIR LOS DOS*/
		 
		int dividendo=0, divisor=0, cociente=0, resto=0;
		
		System.out.println("Introduzca el dividendo");
		dividendo=Entrada.entero();
		
		System.out.println("Introduzca el divisor");
		divisor=Entrada.entero();
		
		cociente=dividendo/divisor;
		System.out.println("El cociente de la división es:"+cociente);
		
		resto=dividendo%divisor;
		System.out.println("El resto de la división es:"+resto);
		
	}

}
