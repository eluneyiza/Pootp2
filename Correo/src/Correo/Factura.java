package Correo;

public class Factura {
	// public precio(paquete):pesos
	// public sucursal(sucursal): sucu
	public int fechaFacturacion,horaFacturacion;
	double totalACobrar;
	private String nombreRemitente;
	
	public double calcularPrecio(Remitente remitente) {
		double precioKilo = 500;
		double tipoDeEnvio = 250;

		totalACobrar = totalACobrar + tipoDeEnvio;
		for (int i = 0; i < remitente.getPaquetes().size();i++){
			Paquete paquete = remitente.getPaquetes().get(i);
			totalACobrar = totalACobrar + paquete.getPeso() * precioKilo; 
		}
		return totalACobrar;
		
		
	}
	
	public Factura(Remitente remitente) {
		this.nombreRemitente = remitente.getNombre();
		this.totalACobrar = this.calcularPrecio(remitente);
	}
}
