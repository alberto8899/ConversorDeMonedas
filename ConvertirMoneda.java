import java.util.Scanner;

public class ConvertirMoneda {

    // Method to convert a specified amount from one currency to another
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;  // Variable to store the amount to convert

        // Fetch the exchange rate between monedaBase and monedaTarget
        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);

        // Display the current conversion rate
        System.out.println("La tasa de conversion para hoy\n1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);

        // Prompt the user to enter the amount they want to convert
        System.out.println("Ingrese la cantidad de " + monedaBase);

        // Read and parse the amount entered by the user
        cantidad = Double.parseDouble(lectura.nextLine());

        // Calculate the converted amount by multiplying the input amount by the conversion rate
        double cantidadConvertida = cantidad * monedas.conversion_rate();

        // Display the conversion result
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }

    // Method to prompt user input for custom currency codes and perform the conversion
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        // Prompt user for the base currency code
        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();

        // Prompt user for the target currency code
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();

        // Call the convertir method with the specified currencies
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
