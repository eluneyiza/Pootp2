package Correo;




public class Main {

	public static void main(String[] args) {
	
		Remitente remitente = new Remitente("Carlos","Alvarez","Cabildo 3200","Belgrano","Buenos Aires","Efectivo",1428,22345699,25000);
		Paquete paquete1 = new Paquete(1.250,"Juramento 2450",1);
		Paquete paquete2 = new Paquete(1.250,"Juramento 2450",1);
		// String nombre,String apellido,String domicilio,String localidad,String provincia,String tipoDePago,int codigoPostal,int dni,int cuil
		// double peso, String direccion, String tipoDeEnvio
		Cajero cajero = new Cajero("Martin","Gutierrez");
		Factura factura = new Factura();
		remitente.poseerPaquete(paquete1);
		remitente.poseerPaquete(paquete2);
		factura.calcularPrecio(remitente);
		cajero.cobrarTotal(remitente,factura);
//		remitente.poseerPaquete(paquete1); 
//		remitente.entregarPaquete(cajero,paquete1);
		
	}

}
