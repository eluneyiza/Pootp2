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

	
	public Factura facturar(Remitente remitente) {
		
		Factura factura = new Factura(remitente);
		remitente.setBilletera(remitente.getBilletera() - factura.totalACobrar);
		System.out.println("Su factura es de: $"+ factura.totalACobrar + " Queda en billetera $"+ remitente.getBilletera());
		return factura;
	}
}
