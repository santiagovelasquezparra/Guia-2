import java.util.Scanner;
/**
 * Write a description of class Ej4impuesto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej4impuesto
{
    public static void main(String[] args)
    {
        //Tenemos 2 datos de entrada
        int tipovehiculo;
        double precio;
        //Datos de salida .
        double impuesto, neto;
        //Acceso al teclado
        Scanner teclado = new Scanner(System.in);
        //Preguntar datos de entrada.
        System.out.print("Tipos de vehículo" + "\n‘1’ para camioneta" + "\n‘2’ para automovil");
        System.out.print("\nIngrese el número correspondiente a su tipo de vehículo:  ");
        tipovehiculo = teclado.nextInt();
        System.out.print("Ingrese el precio bruto de su vehículo: ");
        precio = teclado.nextInt();
        //Calcular y mostrar los datos de salida. 
        if (tipovehiculo == 1)
        {
            if(precio < 80)
            {
                impuesto = 0;
                neto = precio + impuesto;
                System.out.print("Su impuesto a pagar es de  " + impuesto + " pesos.");
                System.out.print("\nEl precio neto es igual a : " + neto + " pesos.");
            }
            else if(precio >= 80)
            {
                impuesto = precio / 2;
                neto = precio + impuesto;
                System.out.print("Su impuesto a pagar es de  " + impuesto + " pesos.");
                System.out.print("\nEl precio neto es igual a : " + neto + " pesos.");
            }
        }
        if (tipovehiculo == 2)
        {
            if(precio < 20)
            {
                impuesto = 5;
                neto = precio + impuesto;
                System.out.print("Su impuesto a pagar es de  " + impuesto + " pesos.");
                System.out.print("\nEl precio neto es igual a : " + neto + " pesos.");
            }
            else if(precio >= 20 && precio <= 40)
            {
                impuesto = precio / 5;
                neto = precio + impuesto;
                System.out.print("Su impuesto a pagar es de  " + impuesto + " pesos.");
                System.out.print("\nEl precio neto es igual a : " + neto + " pesos.");
            }
            else if (precio > 40)
            {
                impuesto = 9;
                neto = precio + impuesto;
                System.out.print("Su impuesto a pagar es de  " + impuesto + " pesos.");
                System.out.print("\nEl precio neto es igual a : " + neto + " pesos.");
            }
        }
        
    }
}
