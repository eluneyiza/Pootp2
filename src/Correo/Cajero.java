package Correo;

public class Cajero {
	private String nombre,apellido;
	public Cajero(String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Paquete recibirPaquete(Paquete paquete) {
		return paquete;
	}
	double total;
	public void cobrarTotal(Remitente remitente,Factura factura) {
		
		remitente.setBilletera(remitente.getBilletera() - factura.totalACobrar);
		System.out.println("El saldo de tu billetera es: "+remitente.getBilletera());
	}
	public double pesarPaquete(Paquete paquete){
		return paquete.getPeso();
	}

	public void calcularPrecio(Factura factura) {
		this.calcularPrecio(factura);
		
	}
}
