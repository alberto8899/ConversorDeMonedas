import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner lectura = new Scanner(System.in);

        // Create an instance of ConsultarMoneda, which likely handles currency data or conversion rates
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0; // Variable to store the user's menu choice

        // Loop until the user chooses to exit (option 8)
        while (opcion != 8) {
            // Display the main menu
            System.out.println("""
                    *******************************
                    Bienvenidos al conversor de monedas
                    Ingresa la conversion que deseas realizar
                    1. Dolar a Peso Argentino.
                    2. Peso Argentino a Dolar.
                    3. Dolar a Real Brasileño.
                    4. Real Brasileño a Dolar.
                    5. Dolar a Peso Colombiano.
                    6. Peso Colombiano a Dolar.
                    7. Convertir otra moneda.
                    8. Salir
                    """);

            // Read user choice
            opcion = lectura.nextInt();
            lectura.nextLine(); // Clear the newline character after reading an integer

            // Switch statement to handle user's choice
            switch (opcion) {
                case 1:
                    // Convert from USD to Argentine Peso
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    // Convert from Argentine Peso to USD
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    // Convert from USD to Brazilian Real
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    // Convert from Brazilian Real to USD
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    // Convert from USD to Colombian Peso
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    // Convert from Colombian Peso to USD
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    // Convert other currencies (prompt for custom currency codes)
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    // Exit the program
                    System.out.println("Saliendo.......");
                    break;
                default:
                    // Handle invalid option input
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
