package Correo;

public class Remitente {
	private String nombre,apellido,domicilio,localidad,provincia,tipoDePago;
	private int codigoPostal,dni,cuil;
	private double total;
	
	public Remitente(String nombre,String apellido,String domicilio,String localidad,String provincia,String tipoDePago,int codigoPostal,int dni,int cuil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.provincia = provincia;
		this.tipoDePago = tipoDePago;
		this.codigoPostal = codigoPostal;
		this.dni = dni;
		this.cuil = cuil;
	}

	public String firmar() {
		String firma = "Kevin";
		return firma;
	}
	
	public double pagarTotal(){
		return 2;
	}
	
	public boolean llevarASucursal(Paquete paquete) {
		if(paquete == entregado) {
			return true;
		}else {
			return false;
		}
	}
	
	public String elegirTipoEnvio(){
		if(tipoEnvio == "Premium") {
			Paquete.tipoDeEnvio = "Premium";
		}else {
			Paquete.tipoDeEnvio = "Normal";
		}
		
	}
}
