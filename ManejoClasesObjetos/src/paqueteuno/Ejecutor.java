package paqueteuno;
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        FacturaTelefono ft = new FacturaTelefono();
 
        // Valores de entrada
        String nombresCompletos = "Rene Elizalde";
        String numeroTelefono = "098321321";
        double minutos = 230;
        double valorMinuto = 0.25;
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        ft.establecerNombresCompletos(nombresCompletos);
        ft.establecerNumeroTelefono(numeroTelefono);
        ft.establecerMinutosMes(minutos);
        ft.establecerValorMinuto(valorMinuto);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        
        ft.calcularValorFactura();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Factura de Teléfono\n\nNombres y Apellidos: %s\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", ft.obtenerNombresComletos(), ft.obtenerNumeroTelefono(),
                ft.obtenerMinutosMes(), ft.obtenerValorMinuto(),
                ft.obtenerValorFactura());
    }
}
