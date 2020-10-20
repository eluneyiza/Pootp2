package Correo;

public class Destinatario {
	private String nombre,apellido,domicilio,localidad,provincia;
	private int codigoPostal,dni;
	
	public String firmar() {
		String firma = "Kevin";
		return firma;
	}
	
	public Paquete recibir(Paquete paquete) {
		
		return paquete;
	}
	
	public boolean confirmarEnvio(Paquete paquete) {
		if(paquete == entregado) {
			return true;
		}else {
			return false;
		}
	}
	
}
