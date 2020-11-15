package Correo;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Remitente remitente = new Remitente("Carlos","Alvarez","Cabildo 3200","Belgrano","Buenos Aires","Efectivo",1428,22345699,25000);
		Paquete paquete1 = new Paquete(1.250,"Juramento 2450",1);
		Paquete paquete2 = new Paquete(1.250,"Juramento 2450",1);
		List<Paquete> paquetes = Arrays.asList(paquete1,paquete2);
		Sucursal sucursal = new Sucursal("Juramento 3500");
		Cajero cajero = new Cajero("Martin","Gutierrez");
		Cartero cartero = new Cartero("Juan");
		Destinatario destinatario = new Destinatario("Jeronimo",42105600);
		
		remitente.poseerPaquete(paquete1);
		remitente.poseerPaquete(paquete2);
		remitente.entregarPaquete(sucursal, paquetes);
		
		cajero.facturar(remitente);
		
		cartero.paquetesParaEntregar(sucursal);
		cartero.entregarPaquete(destinatario,paquete1);
		
		destinatario.firmar("KS");
		
	}

}
