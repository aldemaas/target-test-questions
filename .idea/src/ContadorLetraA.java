import java.util.Scanner;

public class ContadorLetraA {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int quantidadeA = contarLetraA(texto);

        if (quantidadeA > 0) {
            System.out.println("A letra 'a' aparece " + quantidadeA + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int contarLetraA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        return contador;
    }

}

