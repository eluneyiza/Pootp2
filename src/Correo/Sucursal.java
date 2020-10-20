package Correo;

public class Sucursal {
	private String direccion,provincia,localidad,servicios;
	private int codigoPostal;
	
	public Paquete almacenarPaquete(Paquete paquete){
		//getter de peso paquete
		return paquete;
	}
	public String chequearDestino(String destino){
		//getter de peso paquete
		direccion = this.destino;
		return direccion;
	}
	
	public int entregarLegajo(Cartero cartero) {
		cartero.legajo = getLastlegajo() + 1;
		return cartero.legajo;
	}
	public Paquete chequearDestino(Paquete paquetes[]){
		//getter de peso paquete
		paquetesAEntregar = setPaquetes();
		return paquetesAEntregar;
	}
}
