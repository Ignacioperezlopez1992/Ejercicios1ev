import java.util.Scanner;

public class EjemploRelacionales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int x, y;
		String cadena;
		boolean resultado;
		System.out.print("Introduce el primer numero: ");
		x = teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		y = teclado.nextInt();
		cadena=(x==y)?"Iguales":"distintos";
		System.out.printf("Los numeros %d y %d son %s\n", x,y,cadena);
		resultado= (x!=y);
		System.out.println("x != y // es " + resultado);
		resultado = (x < y);
		System.out.println("x < y // es " + resultado);
		resultado = (x > y);
		System.out.println("x > y // es " + resultado);
		resultado = (x <= y);
		System.out.println("x <= y // es " + resultado);
		resultado = (x >= y);
		System.out.println("x >= y // es " + resultado);
	}

}
