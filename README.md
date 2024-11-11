

### Explanation of Key Parts:

1. **Scanner**: Used to read user input.
2. **ConsultarMoneda**: Likely a class managing currency data or fetching exchange rates.
3. **While Loop**: Repeats the menu display and conversion process until the user chooses to exit.
4. **Switch Statement**: Executes different conversions based on the user's choice.
5. **ConvertirMoneda.convertir()**: Method calls for predefined currency conversions (like USD to ARS).
6. **convertirOtraMoneda()**: Allows conversion for any currency pair not listed in the menu.
7. **Exit Condition**: Option 8 exits the loop and ends the program.


Explanation of Key Parts:
Gson: Library used for parsing JSON responses from the API.
buscarMoneda Method: Takes two currency codes (monedaBase and monedaTarget) and returns a Monedas object with exchange rate data.
URI Creation: Constructs the API endpoint based on the API key, base currency, and target currency.
HttpClient and HttpRequest: Create and send the HTTP GET request to the API endpoint.
Response Handling: Parses the JSON response body into a Monedas object using Gson, or throws an error if the request fails.

 Explanation of Key Parts:
convertir Method: Converts a specified amount from monedaBase to monedaTarget using the exchange rate obtained from ConsultarMoneda.

Exchange Rate Display: Shows the current conversion rate for monedaBase to monedaTarget.
Amount Input: Prompts the user to enter the amount they want to convert.
Conversion Calculation: Multiplies the entered amount by the conversion rate.
Result Display: Outputs the result of the conversion in the target currency.
convertirOtraMoneda Method: Allows the user to input custom currency codes for the base and target currencies.

User Prompts: Asks for both the base and target currency codes.
Uppercase Conversion: Ensures currency codes are in uppercase for consistency with typical currency standards.
convertir Call: Calls the convertir method with the specified currencies to perform the conversion.
