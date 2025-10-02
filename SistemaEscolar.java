/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];

        // Entrada das 8 notas (1 por bimestre)
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º Bimestre: ");
            notas[i] = sc.nextDouble();
        }

        // Calcular médias bimestrais (já são as notas)
        // Calcular médias semestrais (4 bimestres por semestre)
        double sem1 = (notas[0] + notas[1] + notas[2] + notas[3]) / 4.0;
        double sem2 = (notas[4] + notas[5] + notas[6] + notas[7]) / 4.0;

        // Média final
        double mediaFinal = (sem1 + sem2) / 2.0;

        // Exibir resultados
        System.out.println("\nPráticas\n");

        System.out.printf("1º Bimestre: %.1f%n", notas[0]);
        System.out.printf("2º Bimestre: %.1f%n", notas[1]);
        System.out.printf("3º Bimestre: %.1f%n", notas[2]);
        System.out.printf("4º Bimestre: %.1f%n", notas[3]);
        System.out.printf("1º Semestre: %.1f%n", sem1);
        System.out.println("----------------------");
        System.out.printf("5º Bimestre: %.1f%n", notas[4]);
        System.out.printf("6º Bimestre: %.1f%n", notas[5]);
        System.out.printf("7º Bimestre: %.1f%n", notas[6]);
        System.out.printf("8º Bimestre: %.1f%n", notas[7]);
        System.out.printf("2º Semestre: %.1f%n", sem2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        sc.close();
    }
}
