package pildora_poo_2;

public class coche1 {
	//declaramos lo condiciones
		private int rueda;
		private int largo;
		private int ancho;
		private int motor;
		private int peso_plataforma;
		private String color;
		private int peso_total;
		private boolean asientos_cuero,climatizador;
		//METODO CONSTRUCTOR:
		
		public coche1() { //mismo noombre que la clase
		
			rueda = 4;
			largo = 2000;
			ancho = 300;
			motor = 1600;
			peso_plataforma = 500;
		}
		//GETER-----------
		public String dime_datos_general() {
			return "la plataforma del vehiculo tiene "+rueda+" mide "+
		largo/1000+" metros con un ancho "+ancho+" cm y un peso de plataforma de "+
		peso_plataforma+"kg";
		}
		
		
		//METODO SETERS
		public void establece_color(String color_coche) {//seter
			color = color_coche;//se le coloca asi las cosas----------
		}//se hace asi para que ejecute en uso coche
		
		
		//-----GETER
		public String dime_color() {
			return "el color del coche es "+color;
		}
		//VOID ES EL SETERS NO DEVUELVE NADA-------------
		public void configura_asiento(String asientos_cuero) {
			
			if(asientos_cuero.equalsIgnoreCase("si")) {
				this.asientos_cuero=true;
			}else {
				this.asientos_cuero=false;
				
				}
		}
		
		
			//es EL METODO GETERS
			public String dime_asietos() {
				if(asientos_cuero==true) {
					return "el coche tiene asientos de cuero: ";
				}else {
					return "el coche tiene asientos de serie";
		}
	}
			//METODO SETERS-----
		public void configura_climatizador(String climatizador) {
			if(climatizador.equalsIgnoreCase("si")) {//compara cadena de caracteres con equals 
				
				this.climatizador=true;
			}else {
				this.climatizador=false;
			}
		}
		
		//geters--------
		
		public String dime_climatizador() {
			if(climatizador == true) {
				
				return "el coche incorpora climatizador: ";
			
		}else {
			return "el coche lleva aire acondicionado";
		}
		}
		//setery geter ala vez no	 NO RECOMANDADO
		public String dime_peso_coche() {//seter y geter a la vez
			int  peso_carroceria = 500;
			peso_total = peso_plataforma+peso_carroceria;
			
			if(asientos_cuero==true) {
				peso_total= peso_total+50;
			}
			if(climatizador == true) {
				peso_total = peso_total+20;
			}
			return "el eso del coche es:"+peso_total;
		}
		
		//------------------------------------------------------
		public int precio_coche() {
			int precio_final = 10000;
			
			if(asientos_cuero==true) {
				precio_final+=2000;
			}
			if(climatizador==true) {
				precio_final+=1500;
			}
			
			return precio_final;
			
			
		}
		
		
		
		
		
}
