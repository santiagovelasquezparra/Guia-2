import java.util.Scanner;
/**
 * El siguiente programa permite hallar el área entre un círculo y un cuadrado  
 * estando este último dentro del circulo.
 * @author (Santiago Velasquez Parra) 
 * @version (a version number or a date)
 */
public class Ej2Circulo
{
    public static void main(String[] args)
    {
        //Datos de entrada .
        double radio;
        //Datos de salida .
        double arecirculo, ladocuadrado, arecuadrado, aresombra;
        //Acceso al teclado
        Scanner teclado = new Scanner(System.in);
        //Preguntar datos de entrada.
        System.out.print("Por favor ingrese el radio del circulo: ");
        radio = teclado.nextDouble();
        //Calcular los datos de salida.
        arecirculo = Math.PI * Math.pow(radio, 2);
        arecuadrado = (Math.pow((radio * 2), 2)) / 2;
        aresombra = arecirculo - arecuadrado;
        //Mostrar los datos de salida
        System.out.printf("El área de sombreada que está entre el círculo y el cuadrado es: %.2f", aresombra);
    }
}
