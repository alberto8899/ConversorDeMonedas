import com.google.gson.Gson;  // Importing Gson library for JSON parsing
import java.net.URI;  // Importing URI to handle the API endpoint
import java.net.http.HttpClient;  // Importing HttpClient for making HTTP requests
import java.net.http.HttpRequest;  // Importing HttpRequest to structure the HTTP request
import java.net.http.HttpResponse;  // Importing HttpResponse to handle the HTTP response

public class ConsultarMoneda {

    // Method to fetch exchange rate between two currencies
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){

        // API key for the currency exchange rate service
        String apiKey = "581a6657e8458915cc84e63f";

        // Construct the API endpoint URI using the base and target currencies
        URI uriDeApi = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaTarget + "/");

        // Create a new HTTP client to send the request
        HttpClient client = HttpClient.newHttpClient();

        // Build the HTTP GET request to the API endpoint
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uriDeApi)
                .build();

        try {
            // Send the request and store the response as a String
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parse the JSON response to a Monedas object and return it
            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (Exception e) {
            // Handle exceptions by throwing a runtime error with a descriptive message
            throw new RuntimeException("No se encontró ningún tipo de moneda.");
        }
    }
}
