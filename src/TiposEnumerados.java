
public class TiposEnumerados {

    public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};	
	public static void main(String[] args) {
		Dias diaactual = Dias.Jueves;
		Dias diasiguiente = Dias.Viernes;
		
		System.out.print("Hoy es: ");
		System.out.println(diaactual);
		System.out.println("Mañana\nes\n" + diasiguiente);
				

	}

}
