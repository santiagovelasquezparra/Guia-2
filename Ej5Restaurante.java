import java.util.Scanner;
/**
 * Este programa permite mostrar varios tipos de menú, seleccionar los platillos y mostrar el precio a pagar. 
 * 
 * @author (Santiago Velasquez)
 */
public class Ej5Restaurante
{
    public static void main(String[] args)
    {
        //Datos de entrada.
        //Tipos de comida y cantidad de platos.
        int tipoComida, tipoPlato, cant;
        //Datos de salida .
        double precio = 0, iva = 0, descuento = 0, total = 0;
        //Acceso al teclado
        Scanner teclado = new Scanner(System.in);
        //Preguntar datos de entrada.
        System.out.print("Tipos de Menú" + "\n1. Vegetariano " + "\n2. No vegetariano " + "\n3. Comida rápida  ");
        System.out.println("\nIngrese el número correspondiente a el tipo de menú que desea :  ");
        tipoComida = teclado.nextInt();
        //Comida vegetariana.
        if (tipoComida == 1)
        {
            //Mostrar el menú. 
            System.out.print("Menú vegetariano ");
            System.out.print("\n1. Sopas de vegetales      = $10,000  ");
            System.out.print("\n2. Ensaladas               = $25,000 ");
            System.out.print("\n3. Jugos                   = $5,000 ");
            System.out.print("\nIngrese el número correspondiente a el plato que desea :  ");
            tipoPlato = teclado.nextInt();
            //Datos menú.
            double sopa = 10000, ensalada = 25000, jugo = 5000;
            //Calcular datos de salida. 
            if (tipoPlato == 1)
            {
                System.out.print("\nEl platillo seleccionado fue Sopa de vegetales. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = sopa * cant;
            }
            else if (tipoPlato == 2)
            {
                System.out.print("\nEl platillo seleccionado fue Ensalada. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = ensalada * cant;
            }
            else if (tipoPlato == 3)
            {
                System.out.print("\nEl platillo seleccionado fue Jugo. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = jugo * cant;
            }
            iva = precio + (precio * 0.19);
            descuento = iva * 0.20;
            total = iva - descuento;
            //Mostrar datos de salida. 
            System.out.print("\nPrecio de la comida:   $ " + (int)precio);
            System.out.print("\nPrecio + IVA(19%):     $" + (int)iva);
            System.out.print("\nDescuento (20%):       $" + (int)descuento);
            System.out.print("\nTOTAL:                 $" + (int)total);
        }
        //Comida no vegetariana.
        if (tipoComida == 2)
        {
            //Mostrar el menú. 
            System.out.print("Menú no vegetariano ");
            System.out.print("\n1. Bandeja de carne        = $30,000  ");
            System.out.print("\n2. Bandeja de pollo        = $28,000 ");
            System.out.print("\nIngrese el número correspondiente a el plato que desea :  ");
            tipoPlato = teclado.nextInt();
            //Datos menú.
            double bandejaC = 30000, bandejaP = 28000;
            //Calcular datos de salida. 
            if (tipoPlato == 1)
            {
                System.out.print("\nEl platillo seleccionado fue Bandeja de carne. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = bandejaC * cant;
            }
            else if (tipoPlato == 2)
            {
                System.out.print("\nEl platillo seleccionado fue Bandeja de pollo. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = bandejaP * cant;
            }
            iva = precio + (precio * 0.19);
            descuento = iva * 0.10;
            total = iva - descuento;
            //Mostrar datos de salida. 
            System.out.print("\nPrecio de la comida:   $ " + (int)precio);
            System.out.print("\nPrecio + IVA(19%):     $" + (int)iva);
            System.out.print("\nDescuento (10%):       $" + (int)descuento);
            System.out.print("\nTOTAL:                 $" + (int)total);
        }
        //Comida rapida.
        if (tipoComida == 3)
        {
            //Mostrar el menú. 
            System.out.print("Menú comida rápida ");
            System.out.print("\n1. Perro caliente          = $5,000");
            System.out.print("\n2. Hamburguesa             = $7,000 ");
            System.out.print("\nIngrese el número correspondiente a el plato que desea :  ");
            tipoPlato = teclado.nextInt();
            //Datos menú.
            double perro = 5000, hambur = 7000;
            //Calcular datos de salida. 
            if (tipoPlato == 1)
            {
                System.out.print("\nEl platillo seleccionado fue Perro caliente. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = perro * cant;
            }
            else if (tipoPlato == 2)
            {
                System.out.print("\nEl platillo seleccionado fue Hamburguesa. ");
                System.out.print("\n¿Cuántas unidades desea?  : ");
                cant = teclado.nextInt();
                precio = hambur * cant;
            }
            iva = precio + (precio * 0.19);
            descuento = iva * 0.10;
            total = iva - descuento;
            //Mostrar datos de salida. 
            System.out.print("\nPrecio de la comida:   $ " + (int)precio);
            System.out.print("\nPrecio + IVA(19%):     $" + (int)iva);
            System.out.print("\nDescuento (10%):       $" + (int)descuento);
            System.out.print("\nTOTAL:                 $" + (int)total);
        }
    }
}
