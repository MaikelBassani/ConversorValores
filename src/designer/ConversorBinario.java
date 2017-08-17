package designer;

public class ConversorBinario {
    StringBuilder valorSaida = new StringBuilder();

    public String convBinToDec(String numero) {
        
        int valor = 0;
        valorSaida.setLength(0);
        for(int i = numero.length();i > 0;i--){
            valor += Integer.parseInt(numero.charAt(i-1)+"")*Math.pow(2,(numero.length()-i));
        }
        valorSaida.append(valor);
        return new StringBuilder(valorSaida).toString();
    }

    /*public String convOctalToHex(int numero) {

        valorSaida.setLength(0);
        char hexadecimal[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (numero != 0) {

            valorSaida.append(hexadecimal[numero % 16]);
            numero = numero / 16;
        }
        return new StringBuilder(valorSaida).reverse().toString();
    }*/

    /*public String convOctalToBin(int numero) {
        
        int cont = 0;
        valorSaida.setLength(0);
        do{
            cont++;
            System.out.println(cont);
            if(cont == 3){
                valorSaida.reverse();
                System.out.println(valorSaida);
                cont = 0;
            }
            valorSaida.append(numero % 2);
            numero = numero / 2;
        }while (numero != 0);
        return new StringBuilder(valorSaida).toString();
    }*/
}
