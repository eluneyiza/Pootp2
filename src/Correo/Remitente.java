package Correo;
import java.util.*;
public class Remitente {
	private String nombre,apellido,domicilio,localidad,provincia,tipoDePago;
	private int codigoPostal,dni,cuil;
	private double billetera;
	private List<Paquete> paquetes = new ArrayList();
	
	public Remitente(String nombre,String apellido,String domicilio,String localidad,String provincia,String tipoDePago,int codigoPostal,int dni, double billetera) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.provincia = provincia;
		this.tipoDePago = tipoDePago;
		this.codigoPostal = codigoPostal;
		this.dni = dni;
		this.billetera = billetera;
	}

	public String firmar() {
		String firma = "Kevin";
		return firma;
	}
	
	public double pagarTotal(){
		return 2;
	}
	
	public void llevarASucursal(Paquete paquete) {
		if(paquete == entregado) {
			
		}else {
			
		}
	}
	
	public void poseerPaquete(Paquete paquete) {
		paquetes.add(paquete);
		
	}
	public List<Paquete> getPaquetes(){
		return this.paquetes;
	}
	
	public double getBilletera() {
		return this.billetera;
	}
	public void setBilletera(double billetera) {
		this.billetera = billetera;
	}
	public void entregarPaquete(Cajero cajero, Paquete paquete) {
		
	}
	
	public String elegirTipoEnvio(){
		if(tipoDeEnvio == "Express") {
			Paquete.tipoDeEnvio = "Express";
		}else {
			Paquete.tipoDeEnvio = "Normal";
		}
		
	}
}
