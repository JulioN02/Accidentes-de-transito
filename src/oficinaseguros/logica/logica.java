package oficinaseguros.logica;

import java.util.Scanner;

public class logica { 
    public static void capturarDatos(Scanner scanner, int[] añoNacimiento, int[] sexo, int[] registroCarro) {
        for (int i = 0; i < añoNacimiento.length; i++) {
            System.out.println("Conductor " + (i + 1) + ":");
            System.out.println("Ingrese el año de nacimiento: ");
            añoNacimiento[i] = scanner.nextInt();

            System.out.println("Ingrese el sexo (1: Femenino, 2: Masculino): ");
            sexo[i] = scanner.nextInt();

            System.out.println("Ingrese el registro del carro (1: Bogotá, 2: Otras ciudades): ");
            registroCarro[i] = scanner.nextInt();
        }
    }

    public static void calcularYMostrarPorcentajes(int[] añoNacimiento, int[] sexo, int[] registroCarro, int totalConductores) {
        int menoresDe30 = 0;
        int femeninos = 0;
        int masculinos = 0;
        int masculinosEntre12y30 = 0;
        int registroOtrasCiudades = 0;

        for (int i = 0; i < totalConductores; i++) {
            if (esMenorDe30(añoNacimiento[i])) menoresDe30++;
            if (esMasculino(sexo[i])) {
                masculinos++;
                if (estaEntre12y30(añoNacimiento[i])) masculinosEntre12y30++;
            } else {
                femeninos++;
            }
            if (registroFueraDeBogota(registroCarro[i])) registroOtrasCiudades++;
        }

        System.out.println("Porcentaje de conductores menores de 30 años: " + calcularPorcentaje(menoresDe30, totalConductores) + "%");
        System.out.println("Porcentaje de conductores femeninos: " + calcularPorcentaje(femeninos, totalConductores) + "%");
        System.out.println("Porcentaje de conductores masculinos: " + calcularPorcentaje(masculinos, totalConductores) + "%");
        System.out.println("Porcentaje de conductores masculinos entre 12 y 30 años: " + calcularPorcentaje(masculinosEntre12y30, totalConductores) + "%");
        System.out.println("Porcentaje de conductores con carros registrados fuera de Bogotá: " + calcularPorcentaje(registroOtrasCiudades, totalConductores) + "%");
    }

    public static boolean esMenorDe30(int añoNacimiento) {
        int edad = 2024 - añoNacimiento; // Asumiendo que el año actual es 2024
        return edad < 30;
    }

    public static boolean esMasculino(int sexo) {
        return sexo == 2;
    }

    public static boolean estaEntre12y30(int añoNacimiento) {
        int edad = 2024 - añoNacimiento; // Asumiendo que el año actual es 2024
        return edad >= 12 && edad <= 30;
    }

    public static boolean registroFueraDeBogota(int registroCarro) {
        return registroCarro == 2;
    }

    public static double calcularPorcentaje(int cantidad, int total) {
        return (cantidad * 100) / total;
    }
}
