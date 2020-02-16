package vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oscar
 */
import controlador.funcion;
import controlador.operaciones;
import modelo.info;
import java.util.Scanner;

public class Menu {

    int grados = 0;
    int repeticiones = 0;

    public void interfaz() {
        int opc;
        operaciones fmatema = new operaciones();
        funcion ftrigo = new funcion();
        info minfo = new info();

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("----------FUNCIONES--------");
            System.out.println("1.Seno\n7.Salir");
            opc = leer.nextInt();
            int datos = 0;
            switch (opc) {
                case 1:
                    System.out.print("Ingrese las repeticiones: ");
                    repeticiones = leer.nextInt();
                    System.out.print("Ingrese los grados: ");
                    grados = leer.nextInt();
                    minfo.datos(grados, repeticiones);
                    System.out.println("El seno de " + grados + "° es de: " + ftrigo.seno(grados, repeticiones));
                    break;

            }
        } while (opc != 7);
        System.out.println("Saliendo...");
    }
}
