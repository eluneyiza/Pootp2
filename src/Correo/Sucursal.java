package Correo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	private String direccion,provincia,localidad,servicios;
	private int codigoPostal;
	private List<Paquete> paquetesSucursal = new ArrayList();
	public Sucursal(String direccion) {
		this.direccion = direccion;
	}
	public List<Paquete> getPaquetes(){
		return this.paquetesSucursal;
	}
//	public Paquete almacenarPaquete(Paquete paquete){
//		//getter de peso paquete
//		return paquete;
//	}
//	public String chequearDestino(String destino){
//		//getter de peso paquete
//		direccion = this.destino;
//		return direccion;
//	}
//	
//	public int entregarLegajo(Cartero cartero) {
//		cartero.legajo = getLastlegajo() + 1;
//		return cartero.legajo;
//	}
//	public Paquete chequearDestino(Paquete paquetes[]){
//		//getter de peso paquete
//		paquetesAEntregar = setPaquetes();
//		return paquetesAEntregar;
//	}
}
