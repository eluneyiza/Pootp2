package Correo;

public class Paquete{
	private String direccion,sello,firmaDestinatario,aclaracion,selloSucursal,selloDestino,firmaCartero,prioridad,estado;
	// remitente remitente
	// destinatario destinatario
	private double peso,valorDeclarado,tipoDeEnvio,precio;
	private int cantidadDeAvisos;
	
	public Paquete(double peso, String direccion, int tipoDeEnvio){
		this.peso = peso;
		this.direccion = direccion;
		this.tipoDeEnvio = tipoDeEnvio;
	}

	public double getPeso() {
		return peso;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
