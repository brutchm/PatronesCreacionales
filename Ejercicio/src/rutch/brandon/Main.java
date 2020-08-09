package rutch.brandon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);


        int e; //cantidad de estudiantes del curso

        System.out.print("Inserte la cantidad de alumnos que tiene el curso: ");
        e = entrada.nextInt();


        double notas [] = new double [e];//arreglo de notas

        double nota1; // nota primer examen
        double nota2; // nota segundo examen
        double nota3; //nota terccer examen
        int estudiante; //numero del estudiante

        System.out.println("A continuacion, insertaremos las notas de todos los estudiantes.");

        for (int i = 0; i < notas.length; i++) {



            estudiante = i + 1;

            System.out.print("Inserte la nota 1 del estudiante "+estudiante+ ": ");
            nota1 = entrada.nextDouble();
            System.out.print("Inserte la nota 2 del estudiante "+estudiante+": ");
            nota2 = entrada.nextDouble();
            System.out.print("Inserte la nota 3 del estudiante "+estudiante+": ");
            nota3 = entrada.nextDouble();

            double promedio = (nota1 * 0.40) + (nota2 * 0.35) + (nota3 * 0.25);
            notas [i] = promedio;


        }

        //Impresion de arreglo con algoritmo de burbuja


        for(int i = 0; i < notas.length - 1; i++)
        {
            for(int j = 0; j < notas.length - i -1; j++)
            {
                if (notas[j] < notas[j + 1])
                {
                    double temporal = notas[j+1];
                    notas[j+1] = notas[j];
                    notas[j] = temporal;
                }
            }
        }

        System.out.println("Notas finales/Promedios ordenadas a continuacion: De mayor a menor");
        for(int i = 0;i < notas.length; i++)
        {
            System.out.print(notas[i]+"\n");
        }

        //Busqueda binaria a continuacion

        boolean encontrado = false;//si fue encontrado el numero digitado
        double respuesta;//numero a buscar

        System.out.print("Digite el numero que quiere encontar: ");
        respuesta = entrada.nextDouble();


        int primerIndice = 0;
        int ultimoIndice = notas.length - 1;
        int mitad = (primerIndice + ultimoIndice) / 2;
        mitad = Math.round(mitad);



        int posicion = 0;//posicion del numero buscado

        while (primerIndice <= ultimoIndice) {

            if (notas[mitad] < respuesta) {
                primerIndice = mitad + 1;
            } else if (notas[mitad] == respuesta) {
                encontrado = true;
                posicion = mitad;
                break;

            } else {

                ultimoIndice = mitad - 1;
            }
            mitad = (primerIndice + ultimoIndice) / 2;
            mitad = Math.round(mitad);
        }

        if (encontrado) {

            System.out.println("El numero se encontro en la posicion "+posicion);
        }else{

            System.out.println("El numero no se encontro en el arreglo de notas");
        }






    }
}
