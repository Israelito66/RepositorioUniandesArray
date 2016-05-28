/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.salguero.arrayanimales;
import java.util.ArrayList;
import ec.edu.uniandes.salguero.arrayanimales.clsarrayanimales;
/**
 *
 * @author Usuario
 */
public class EcEduUniandesSalgueroArrayanimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        ArrayList<clsarrayanimales> animales = new ArrayList<clsarrayanimales>();
    
              clsarrayanimales es1 = new clsarrayanimales(0, "Perro", 27/05/2016, 15, clsarrayanimales.especie.mamiferos);
              clsarrayanimales es2 = new clsarrayanimales(1, "Ballena", 02/05/2016, 25, clsarrayanimales.especie.mamiferos);
              clsarrayanimales es3 = new clsarrayanimales(2, "Sapo", 05/05/2016, 8, clsarrayanimales.especie.oviparos);
              clsarrayanimales es4 = new clsarrayanimales(3, "Leon", 04/052016, 18, clsarrayanimales.especie.mamiferos);
              clsarrayanimales es5 = new clsarrayanimales(4, "Gallina", 20/05/2010, 19, clsarrayanimales.especie.vertebrados);
              clsarrayanimales es6 = new clsarrayanimales(5, "Peces", 09/05/2011, 35, clsarrayanimales.especie.oviparos);
              clsarrayanimales es7 = new clsarrayanimales(6, "Lagartija", 16/04/2013, 15, clsarrayanimales.especie.vertebrados);
              clsarrayanimales es8 = new clsarrayanimales(7, "Gatos", 22/03/2016, 13, clsarrayanimales.especie.mamiferos);
              clsarrayanimales es9 = new clsarrayanimales(8, "Arañas", 17/01/2014, 12, clsarrayanimales.especie.invertebrados);
              clsarrayanimales es10 = new clsarrayanimales(9, "Loros", 19/02/2015, 10, clsarrayanimales.especie.oviparos);
    
              animales.add(es1);
              animales.add(es2);
              animales.add(es3);
              animales.add(es4);
              animales.add(es5);
              animales.add(es6);
              animales.add(es7);
              animales.add(es8);
              animales.add(es9);
              animales.add(es10);
             
    
              
    }           
    private static void imprimir(ArrayList<clsarrayanimales> prod) {
            
            for (clsarrayanimales animales : prod) {
                
                System.out.print("***************");
                System.out.print("Id:"+ animales.Id());
                System.out.print("Nombre: "+ animales.Nombre());
                System.out.print("Valor: "+ animales.Fechapereamiento());
                System.out.print("Peso  "+ animales.Peso());
                System.out.println("Especie "+animales.Especie());
    
    
        }
       }
  }