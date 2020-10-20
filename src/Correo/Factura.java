package Correo;

public class Factura {
	// public precio(paquete):pesos
	// public sucursal(sucursal): sucu
	public int fechaFacturacion,horaFacturacion;
	double totalACobrar = 0;
	
	public void calcularPrecio(Remitente remitente) {
		double precioKilo = 100;
		double tipoDeEnvio = 250;
//		double precio = paquete.getPeso() * precioKilo + tipoDeEnvio;
		totalACobrar = totalACobrar + tipoDeEnvio;
		for (int i = 0; i < remitente.getPaquetes().size();i++){
			Paquete paquete = remitente.getPaquetes().get(i);
			totalACobrar = totalACobrar + paquete.getPeso() * precioKilo; 
		}
		
		System.out.println("El precio de tu factura es de: " + totalACobrar);
	}
	
	public Factura() {
		
	}
}
