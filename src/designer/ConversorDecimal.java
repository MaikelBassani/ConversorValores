package designer;

public class ConversorDecimal {

    StringBuilder valorSaida = new StringBuilder();

    public String convDecToBin(int numero) {

        valorSaida.setLength(0);
        while (numero != 0) {

            valorSaida.append(numero % 2);
            numero = numero / 2;
        }
        return new StringBuilder(valorSaida).reverse().toString();
    }

    public String convDecToHex(int numero) {

        valorSaida.setLength(0);
        char hexadecimal[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (numero != 0) {

            valorSaida.append(hexadecimal[numero % 16]);
            numero = numero / 16;
        }
        return new StringBuilder(valorSaida).reverse().toString();
    }

    public String convDecToOctal(int numero) {

        valorSaida.setLength(0);
        while (numero != 0) {

            valorSaida.append(numero % 8);
            numero = numero / 8;
        }
        return new StringBuilder(valorSaida).reverse().toString();
    }
}
