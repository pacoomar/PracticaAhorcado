package es.rgmf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String frase;
        String[] frases;
        char[] fraseOculta;
        Scanner entrada = new Scanner(System.in);
        Path path;

        // Carga el fichero con las frases
        path = Paths.get("src/es/rgmf/frases.txt");
        try {
            frases = Files.lines(path).toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
            frases = new String[] {"Hola Amigo"};
        }

        // Prepara la frase
        frase = frases[(int) (Math.random() * frases.length)];
        fraseOculta = new char[frase.length()];

        // Construye la frase oculta.
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                fraseOculta[i] = ' ';
            } else {
                fraseOculta[i] = '_';
            }
        }

        // Muestra la frase oculta.
        System.out.println(fraseOculta);

        // TODO Completa el programa.

        entrada.close();
    }
}
// Luego lo hago

