package rutch.brandon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        int opcion=-1;
        do {
            menu();
            opcion = Integer.parseInt(in.readLine());
            ejecutarOpcion(opcion);
        }while (opcion!=0);
    }

    private static void ejecutarOpcion(int opcion) {
        FabricaHamburgusa fabrica = new FabricaHamburgusa();
        Hamburguesa tmpHamburguesa;

        switch (opcion){
            case 1:
                tmpHamburguesa=fabrica.crearHamburguesa("Torta", "Queso", "Tocino");
                imprimir(tmpHamburguesa.obtenerInforamcion());
                break;
            case 2:
                tmpHamburguesa=fabrica.crearHamburguesa("Torta", "Queso", null);
                imprimir(tmpHamburguesa.obtenerInforamcion());
                break;
            case 3:
                tmpHamburguesa=fabrica.crearHamburguesa("Torta", null, null);
                imprimir(tmpHamburguesa.obtenerInforamcion());
                break;
            case 0:
                imprimir("Gracias por usar el programa");
                break;
            default:imprimir("Digite una opcion valdia");

        }
    }

    private static void imprimir(String info) {
        out.println(info);
    }

    private static void menu() {
        out.println("Ingredientes");
        out.println("1________________ Torta, Queso, Tocino");
        out.println("2________________ Torta, Queso");
        out.println("3________________ Torta");
        out.println("0________________ Salir");
        out.println("Digite una opcion");
    }
}
