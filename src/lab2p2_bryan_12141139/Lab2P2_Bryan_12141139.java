/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_bryan_12141139;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Lab2P2_Bryan_12141139 {
     public static Scanner n = new Scanner(System.in);
    public static ArrayList<animal> lista = new ArrayList();
    public static animal lista_anima = new animal();
    public static void main(String[] args) {
        System.out.println("1- registrar animales");
        System.out.println("2- imprimir datos");
        System.out.println("3- eliminar animales");
        System.out.println("4- alimentar animales");
        System.out.println("5- salir");
        int op=n.nextInt();
        if (op==1) {
            System.out.println("ingrese nombre científico");
            String nomcien=n.nextLine();
            nomcien=n.nextLine();
            System.out.println("ingrese nombre común");
            String nomcom=n.nextLine();
            System.out.println("ingrese hábitat");
            String hab=n.nextLine();
            System.out.println("ingrese alimentación");
            String alime=n.nextLine();
            System.out.println("ingrese descripción de rasgos");
            String ras=n.nextLine();
            System.out.println("ingrese distribución geográfica");
            String distr=n.nextLine();
            int vida=0;
            while (vida<1) {
                System.out.println("ingrese vida");
                vida=n.nextInt();
                if (vida<1) {
                    System.out.println("Ingrese un valor mayor a 0");
                }
            }
            lista.add(new animal(nomcien,nomcom,hab,alime,ras,distr,vida));
            
        }else{
            if (op==2){
                System.out.println("1-Imprimir por posición de la lista");
                System.out.println("2-Imprimir lista completa");
                System.out.println("3-Imprimir por nombre científico");
                int ope=n.nextInt();
                switch (ope){
                    case 1:{
                        for (animal Animal : lista) {
                            System.out.println(Animal.toString());
                        }
                    }
                    break;
                    case 2:{
                        for (String arg : args) {
                            
                        }
                    }
                    break;
                    case 3:{
                        
                    }
                    break;
                
                }
            }else{
                if (op==3){
                    
                }else{
                    if (op==4){
                
                    }
                }
                
            }
        }
        
    }
    
}
