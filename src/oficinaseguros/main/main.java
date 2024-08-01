/*



Programa para el análisis de datos de accidentes de tránsito.
Problema 3: Una oficina de seguros ha reunido datos concernientes a todos 
los accidentes de tránsito ocurridos en el área metropolitana de Bogotá en el 
último año. Por cada conductor involucrado en un accidente se toman los 
siguientes datos: año de nacimiento, sexo (1: Femenino, 2: Masculino) y 
registro del carro (1: Bogotá, 2: Otras ciudades). Desarrollar una solución 
básica de programación que calcule: 
• El porcentaje de conductores menores de 30 años. 
• Porcentaje de conductores del sexo masculino y femenino. 
• Porcentaje de conductores masculinos con edades entre 12 y 30 años. 
• Porcentaje de conductores cuyos carros están registrados fuera de Bogotá.

Estructuras de control utilizadas:
- Sentencias condicionales (if-else): Para clasificar los datos de los conductores según diferentes criterios.
- Estructuras de repetición (for): Para iterar sobre los datos de los conductores.
Métodos utilizados:
- capturarDatos: Captura los datos de cada conductor.
- calcularPorcentaje: Calcula el porcentaje de una cantidad con respecto a un total.
- esMenorDe30: Determina si un conductor es menor de 30 años.
- esMasculino: Determina si un conductor es masculino.
- estaEntre12y30: Determina si un conductor tiene una edad entre 12 y 30 años.
- registroFueraDeBogota: Determina si el carro de un conductor está registrado fuera de Bogotá.
*/

package oficinaseguros.main;
import java.util.Scanner;
import static oficinaseguros.logica.logica.calcularYMostrarPorcentajes;
import static oficinaseguros.logica.logica.capturarDatos;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar el número de conductores
        System.out.println("Ingrese el número de conductores involucrados en accidentes: ");
        int numeroConductores = scanner.nextInt();

        // Arrays/Vectores para almacenar datos de conductores
        int[] añoNacimiento = new int[numeroConductores];
        int[] sexo = new int[numeroConductores];
        int[] registroCarro = new int[numeroConductores];

        // Capturar los datos de los conductores
        capturarDatos(scanner, añoNacimiento, sexo, registroCarro);

        // Calcular y mostrar los porcentajes requeridos
        calcularYMostrarPorcentajes(añoNacimiento, sexo, registroCarro, numeroConductores);
    }
}
