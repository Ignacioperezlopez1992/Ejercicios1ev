
public class OperadoresAsignacion {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
		System.out.printf("El valor de x es %d y el valor  y es %d\n", x,y);
		x += y;
		System.out.println("Suma combinada x += y" + "..... x vale " +x);
		x=5;
		x-=y;
		System.out.println("Resta combinada x -= y" + "..... x vale " +x);
		x=5;
		x*=y;
		System.out.println("Multiplicación combinada x += y" + "..... x vale " +x);
		x=5;
		x/=y;
		System.out.println("Division combinada x += y" + "..... x vale " +x);
		x=5;
		x%=y;
		System.out.println("Resto combinada x += y" + "..... x vale " +x);
		
	}

}
