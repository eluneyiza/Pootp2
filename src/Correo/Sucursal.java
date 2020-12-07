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

}
