package Correo;

import java.util.ArrayList;
import java.util.List;

public class Destinatario {
	private String nombre,apellido,domicilio,localidad,provincia;
	private int codigoPostal,dni;
	private List<Paquete> paquetesRecibidos = new ArrayList();
	public Destinatario(String nombre,int dni) {
		nombre = this.nombre;
		dni = this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String firmar(String nombre) {
		String firma = nombre;
		System.out.println("Firma: " + firma);
		return firma;
	}
	
	public List<Paquete> getPaquetes(){
		return this.paquetesRecibidos;
	}
	
//	public boolean confirmarEnvio(Paquete paquete) {
//		if(paquete == entregado) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
}
