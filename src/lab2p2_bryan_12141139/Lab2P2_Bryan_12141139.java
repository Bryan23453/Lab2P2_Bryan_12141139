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
        lista.add(new animal("obnicus","paco","selva","carnivoro","robusto","lugar libre",2 ));
        lista.add(new animal("caninus","juan","ciudad","carnivoro","pelo corto","lugar contaminado",5 ));
        lista.add(new animal("cardius","max","hogar","carnivoro","pelo liso","lugar comodo",7 ));
        int op=0;
        while (op!=5){
            System.out.println("1- registrar animales");
            System.out.println("2- imprimir datos");
            System.out.println("3- eliminar animales");
            System.out.println("4- alimentar animales");
            System.out.println("5- salir");
             op=n.nextInt();
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
                            System.out.println("ingrese pocicion a imprimir");
                            int o=n.nextInt();
                            System.out.println(lista.get(o).toString());
                        }
                        break;
                        case 2:{   
                            for (animal Animal : lista) {
                                System.out.println(Animal.toString());
                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            }   
                        }
                        break;
                        case 3:{
                            System.out.println("Ingrese nombre cientifico ");
                            String nom=n.nextLine();
                            nom=n.nextLine();
                            boolean rep=true;
                            int e=0,E=0,o=0;
                            for (animal Animal : lista) {
                                 if (! nom.equals(Animal.getNom_cien())) {
                                    e++;
                                }else{
                                 o=e;
                                }
                                 E++;
                            }
                            if (e==E) {
                                rep=false;
                            }
                            if (rep==true) {
                                System.out.println(lista.get(o).toString());
                            }else{
                                System.out.println("no se encontro el nombre cientifico ");
                            }
                        }
                        break;

                    }
                }else{
                    if (op==3){
                        System.out.println("ingrese pocicion a Eliminar");
                        int eli=n.nextInt();
                        lista.remove(eli);
                    }else{
                        if (op==4){

                        }
                    }

                }
            }
        }
        
    }
    
}
