package pildora_poo_2;

public class uso_coche2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coche1 nissan = new coche1();
		
		
		System.out.println(nissan.dime_datos_general());
		
		nissan.establece_color("black");
		System.out.println(nissan.dime_color());
		
		
		
		nissan.configura_asiento("si");
		System.out.println(nissan.dime_asietos());
		
		
		nissan.configura_climatizador("si");
		System.out.println(nissan.dime_climatizador());
		
		System.out.println(nissan.dime_peso_coche());
		
		
		System.out.println("el precio final del coche es: "+nissan.precio_coche());
	}

}
