package Correo;

import java.util.ArrayList;
import java.util.List;

public class Cartero {
	private String nombre,apellido,transporte;
	private int legajo;
	private List<Paquete> paquetesAEntregar = new ArrayList();
	// paquetesAEntregar: paquete[];
	
	public Cartero(String nombre) {
		nombre = this.nombre;
	}
	
	public void paquetesParaEntregar(Sucursal sucursal){
		sucursal.getPaquetes().addAll(paquetesAEntregar);
		System.out.println("Paquetes para entregar a destinatarios: "+sucursal.getPaquetes().size());
	}

	public void entregarPaquete(Destinatario destinatario,Paquete paquete) {
		
		destinatario.getPaquetes().add(paquete);
		System.out.println("El destinatario ha recibido: "+ destinatario.getPaquetes().size()+" paquete");
		
	}
	
}
