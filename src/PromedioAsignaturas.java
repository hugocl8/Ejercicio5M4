import java.util.Scanner;

public class PromedioAsignaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] asignaturas = new String[5];
        double[] promedios = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la asignatura: ");
            asignaturas[i] = scanner.nextLine();
            System.out.println("Ingrese el promedio de la asignatura " + asignaturas[i] + ":");
            promedios[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nSus notas son las siguientes: ");
        double sumaPromedios = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(asignaturas[i] + ": " + promedios[i]);
            sumaPromedios += promedios[i];
        }

        double promedioGeneral = sumaPromedios/5;
        System.out.printf("\nSu promedio general es de: %.2f\n", promedioGeneral);
    }
}
