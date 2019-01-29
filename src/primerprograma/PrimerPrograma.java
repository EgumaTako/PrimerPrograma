package primerprograma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimerPrograma {

    public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int a;
        System.out.println("Indique un valor numerico");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = " + a);
        System.out.println("----------------");
    }
    
}
