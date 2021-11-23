package pe.egcc.vendedorexitoso.prueba;

import pe.egcc.vendedorexitoso.service.VentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

    public static void main(String[] args) {
		 
		 // Datos
		 int mes = 5;
		 double ventas = 70000.0;
		 // Proceso
		 VentaService service = new VentaService();
		 double comision = service.calcComision(mes, ventas);
		 double bono = service.calcBono(mes, ventas);
		 double pagoTotal = service.calcPagoTotal(comision, bono);
		 // Reporte
		 System.out.println("Comision: " + comision);
		 System.out.println("Bono: " + bono);
		 System.out.println("Pago total: " + pagoTotal);
        
    }

}
