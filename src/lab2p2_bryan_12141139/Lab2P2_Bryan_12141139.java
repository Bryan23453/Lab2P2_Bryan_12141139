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
    public static ArrayList<animal> anima = new ArrayList();
    public static animal lista_anima = new animal();
    public static void main(String[] args) {
        anima.add(new animal("obnicus","paco","selva","carnivoro","robusto","lugar libre",2 ));
        anima.add(new animal("caninus","juan","ciudad","carnivoro","pelo corto","lugar contaminado",5 ));
        anima.add(new animal("cardius","max","hogar","carnivoro","pelo liso","lugar comodo",7 ));
        int op=0;
        while (op!=6){
            System.out.println("1- registrar animales");
            System.out.println("2- imprimir datos");
            System.out.println("3- eliminar animales");
            System.out.println("4- modificar datos");
            System.out.println("5- alimentar animales");
            System.out.println("6- salir");
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
                    System.out.println("ingrese edad");
                    vida=n.nextInt();
                    if (vida<1) {
                        System.out.println("Ingrese un valor mayor a 0");
                    }
                }
                anima.add(new animal(nomcien,nomcom,hab,alime,ras,distr,vida));

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
                            System.out.println(anima.get(o).toString());
                        }
                        break;
                        case 2:{   
                            for (animal Animal : anima) {
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
                            for (animal Animal : anima) {
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
                                System.out.println(anima.get(o).toString());
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
                        anima.remove(eli);
                        /*java.lang.IndexOutOfBoundsException
                        try{
                            System.out.println("No existe esa pocion");
                        }
                        catch(Exception e) {
                            System.out.println("No existe esa pocion");
                        }*/
                        
                    }else{
                        if (op==4){
                            System.out.println("ingrese pocision");
                            int poss=n.nextInt();
                            System.out.println("1- editar 1 solo atributo");
                            System.out.println("2- editar todos los atributos");
                            int pos=n.nextInt();
                            if (pos==1) {
                                System.out.println("1- editar nombre científico");
                                System.out.println("2- editar nombre común");
                                System.out.println("3- editar hábitat");
                                System.out.println("4- editar alimentación");
                                System.out.println("5- editar descripción de rasgos");
                                System.out.println("6- editar distribución geográfica");
                                System.out.println("7- editar edad");
                                
                            }else{
                                if (pos==2) {
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
                                        System.out.println("ingrese edad");
                                        vida=n.nextInt();
                                        if (vida<1) {
                                            System.out.println("Ingrese un valor mayor a 0");
                                        }
                                    }
                                    anima.get(poss).setNom_cien(nomcien);
                                    anima.get(poss).setNom_com(nomcom);
                                    anima.get(poss).setHabitat(hab);
                                    anima.get(poss).setAlimentacion(alime);
                                    anima.get(poss).setRasgos(ras);
                                    anima.get(poss).setDis_geo(distr);
                                    anima.get(poss).setEdad(vida);
                                    
                                }
                            }
                        }
                    }

                }
            }
        }
        
    }
    
}
