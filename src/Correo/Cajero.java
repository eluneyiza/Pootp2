package Correo;

public class Cajero {
	private String nombre,apellido;
	
	public Paquete recibirPaquete(Paquete paquete) {
		return paquete;
	}
	public double cobrarTotal(Factura factura) {
		// get total desde factura 
		double total = this.factura.total;
		return total;
	}
	public Paquete pesarPaquete(Paquete paquete){
		//getter de peso paquete
		return paquete;
	}
	public Factura entregarTicket(Factura factura) {
		return factura;
	}
}
