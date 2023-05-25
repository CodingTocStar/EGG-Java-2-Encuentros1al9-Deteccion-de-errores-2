/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author MiriamNahuel
 */
public class JAVA2Encuentros1Al9CorreccionDeErrores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de listas y sarasa");
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);

        //agrego 5 objetos
        int num1 = 1, num2 = 3, num3 = 3, num4 = 4, num5 = 5;
        numerosA.add(num1);
        numerosA.add(num2);
        numerosA.add(num3);
        numerosA.add(num4);
        numerosA.add(num5);
        
        System.out.println("Lista A: " + numerosA);
        //-------------------------------------------------------------------------------------
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        
        //agrego 5 objetos mas
        int num6=6, num7=7, num8=8, num9=9, num10=10;
        numerosB.add(num6);
        numerosB.add(num7);
        numerosB.add(num8);
        numerosB.add(num9);
        numerosB.add(num10);
        
        System.out.println("Lista B: " + numerosB);
        
        //---------------------------------------------------------------------------------------
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 37948295;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        
        //5objetos mas
        int dni1 = 21312312, dni2=31312, dni3=31321, dni4=907809, dni5=4839;
        String nombre1="ble", nombre2="balowa", nombre3="carito", nombre4="Melucha", nombre5="El gino cosmico";
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        alumnos.put(dni4, nombre4);
        alumnos.put(dni5, nombre5);
        
        System.out.println("Alumnos: " + alumnos);
        
        //================================================
        System.out.println("");
        //CAMBIOS
        //listas
        numerosA.remove(num5); //removes el objeto metiendo la variable
        System.out.println("Lista A sin el elemento removido " + num5 + " es " + numerosA);
        numerosA.remove(0); //meter por indice
        System.out.println("Lista A sin el indice " + 0 + " es " + numerosA);
        System.out.println("");
        
        //conjuntos ------> no tienen indices, tenes que meter el objeto que queres borrar
        numerosB.remove(y);
        System.out.println("En la lista b de conjuntos borramos el elemento " + y);
        numerosB.remove(8);
        System.out.println("En la lista b borramos el numero " + 8);
        System.out.println("La lista b queda despues de borrar " + y+ " y " + 8 + " como: " + numerosB);
        System.out.println("");
        
        //mapas
        System.out.println("Removemos el dni " + dni3);
        alumnos.remove(dni3); //sacas la llave se va todo el elemento
        System.out.println("El mapa de alumnos queda: " + alumnos);
        
    }

}
