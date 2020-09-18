package pildora_poo;

public class coche {
	//declaramos lo condiciones
	private int rueda;//LO ESTOY ENCAPSULANDO ESCRIBIENDO PRIVATE solo desde clase
	private int largo;//modificador de acceso a private
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero,climatizador;
	//METODO CONSTRUCTOR:
	
	public coche() { //mismo noombre que la clase
	
		rueda = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	//modificador de acceso es public---GETER-----------
	public String dime_largo() {
		return "el largo del coche es "+largo;
	}
	//METODO SETERS-----------void significa que no devuelve dato
	public void establece_color() {
		color = "azul";
	}
	//-----GETER
	public String dime_color() {
		return "el color del coche es "+color;
	}
	
	
	
}
