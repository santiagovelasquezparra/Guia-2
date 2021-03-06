import java.util.Scanner;
/**
 * El siguiente programa permite realizar la conversión de pies, centímetros, legua y yardas a pulgadas. .
 * 
 * @author (Santiago Velasquez) 
 */
public class Ej1Pulgadas
{
    public static void main(String[] args)
    {
        //Datos de entrada .
        char unidadmedida;
        double numeroconvertir;
        //Datos de salida .
        double pulgadas;
        //Acceso al teclado
        Scanner teclado = new Scanner(System.in);
        //Preguntar datos de entrada.
        System.out.print("‘P’ para pie" + "\n‘C’ para centímetro" + "\n‘L’ para legua" + "\n‘Y’ para yarda  ");
        System.out.print("\nIngrese la letra correspondiente a la unidad de medida a convertir:  ");
        unidadmedida = teclado.next().charAt(0);
        System.out.print("Ingrese el  número a convertir: ");
        numeroconvertir = teclado.nextDouble();
        //Calcular y mostrar los datos de salida. 
        //Usamos los key codes dependiendo de la unidad de medida que necesite el usuario. 
        //[P]=80, [p]=112, [C]=67, [c]=99 , [L]=76, [l]=108, [Y]=89, [y]=121.
        //Calculamos la respectiva conversión. 
        int keycode = (int) unidadmedida;
        if(keycode == 80 || keycode == 112)
        {
            double pie = 0.0833;  // 1 pulgada equivale a 0.0833 pies.
            pulgadas = numeroconvertir / pie;
            System.out.println(numeroconvertir + " pies equivale a " + String.format("%.4f", pulgadas) + " pulgadas.");
        }
        else if(keycode == 67 || keycode == 99)
        {
            double centimetro = 2.54;  //1 pulgada equivale a 2.54 centímetros.
            pulgadas = numeroconvertir / centimetro;
            System.out.println(numeroconvertir + " centímetros equivale a " + String.format("%.2f", pulgadas) + " pulgadas.");
        }
        else if(keycode == 76 || keycode == 108)
        {
            double legua = 190080.02;  //1 legua equivale a 190080.02 pulgadas.
            pulgadas = numeroconvertir * legua;
            System.out.println(numeroconvertir + " leguas equivale a " + String.format("%.2f", pulgadas) + " pulgadas.");
        }
        else if(keycode == 89 || keycode == 121)
        {
            double yarda = 36;  // 1 yarda son 36 pulgadas.
            pulgadas = numeroconvertir * yarda;
            System.out.println(numeroconvertir + " yardas equivale a " + String.format("%.2f", pulgadas) + " pulgadas.");
        }
    }
}
