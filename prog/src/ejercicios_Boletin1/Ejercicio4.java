package ejercicios_Boletin1;

public class Ejercicio4 {

	public static void main(String[] args) {
		//  Pide al usuario el radio del c�rculo, calculas �rea y per�metro del c�rculo
		
		double radio=0, area=0, perimetro=0;
		
		System.out.println("Introduzca un radio");
		radio=Entrada.real();
		
		area=Math.PI*Math.pow(radio, 2);
		area = Math.round(area * 100) / 100d;
		System.out.println("El resultado del �rea de un c�rculo de radio "+radio+"es: "+area);
		
		perimetro=2*Math.PI*radio;
		perimetro = Math.round(perimetro * 100) / 100d;
		System.out.println("El resultado del per�metro de un c�rculo de radio"+radio+"es: "+perimetro);
		
			
	}

}
