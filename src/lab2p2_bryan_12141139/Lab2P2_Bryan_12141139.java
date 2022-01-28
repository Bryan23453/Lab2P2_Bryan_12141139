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
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            if (op==1) {
                boolean A=false;
                String nomcien=n.nextLine();
                while (A==false){
                    A=true;
                    System.out.println("ingrese nombre científico");
                    nomcien=n.nextLine();
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (animal Animal : anima) {
                        if (nomcien.equals(Animal.getNom_cien())) {
                            A=false;
                            break;
                        }
                    }
                    if (A==false) {
                        System.out.println("no puede haber 2 perros con el mismo nombre cientifico ingrese otro nombre");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                }
                System.out.println("ingrese nombre común");
                String nomcom=n.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("ingrese hábitat");
                String hab=n.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("ingrese alimentación");
                String alime=n.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("ingrese descripción de rasgos");
                String ras=n.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("ingrese distribución geográfica");
                String distr=n.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                int vida=0;
                while (vida<1) {
                    System.out.println("ingrese edad");
                    vida=n.nextInt();
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (vida<1) {
                        System.out.println("Ingrese un valor mayor a 0");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                }
                anima.add(new animal(nomcien,nomcom,hab,alime,ras,distr,vida));

            }else{
                if (op==2){
                    System.out.println("1-Imprimir por posición de la lista");
                    System.out.println("2-Imprimir lista completa");
                    System.out.println("3-Imprimir por nombre científico");
                    int ope=n.nextInt();
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    switch (ope){
                        case 1:{
                            System.out.println("ingrese pocicion a imprimir");
                            int o=n.nextInt();
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        break;

                    }
                }else{
                    if (op==3){
                        System.out.println("ingrese pocicion a Eliminar");
                        int eli=n.nextInt();
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("1- editar 1 solo atributo");
                            System.out.println("2- editar todos los atributos");
                            int pos=n.nextInt();
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            if (pos==1) {
                                System.out.println("1- editar nombre científico");
                                System.out.println("2- editar nombre común");
                                System.out.println("3- editar hábitat");
                                System.out.println("4- editar alimentación");
                                System.out.println("5- editar descripción de rasgos");
                                System.out.println("6- editar distribución geográfica");
                                System.out.println("7- editar edad");
                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                int cam=n.nextInt();
                                switch (cam){
                                    case 1:{
                                        boolean A=false;
                                        String nomcien=n.nextLine();
                                        while (A==false){
                                            A=true;
                                            System.out.println("ingrese nombre científico");
                                            nomcien=n.nextLine();
                                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            for (animal Animal : anima) {
                                                if (nomcien.equals(Animal.getNom_cien())) {
                                                    A=false;
                                                    break;
                                                }
                                            }
                                            if (A==false) {
                                                System.out.println("no puede haber 2 perros con el mismo nombre cientifico ingrese otro nombre");
                                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            }
                                        }
                                        anima.get(poss).setNom_cien(nomcien);
                                    }
                                    break;
                                    case 2:{
                                        System.out.println("ingrese nombre común");
                                        String nomcom=n.nextLine();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        anima.get(poss).setNom_com(nomcom);
                                    }
                                    break;
                                    case 3:{
                                        System.out.println("ingrese hábitat");
                                        String hab=n.nextLine();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        anima.get(poss).setHabitat(hab);
                                    }
                                    break;
                                    case 4:{
                                        System.out.println("ingrese alimentación");
                                        String alime=n.nextLine();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        anima.get(poss).setAlimentacion(alime);
                                    }
                                    break;
                                    case 5:{
                                        System.out.println("ingrese descripción de rasgos");
                                        String ras=n.nextLine();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        anima.get(poss).setRasgos(ras);
                                    }
                                    break;
                                    case 6:{
                                        System.out.println("ingrese distribución geográfica");
                                        String distr=n.nextLine();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        anima.get(poss).setDis_geo(distr);
                                    }
                                    break;
                                    case 7:{
                                        int vida=0;
                                        while (vida<1) {
                                            System.out.println("ingrese edad");
                                            vida=n.nextInt();
                                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            if (vida<1) {
                                                System.out.println("Ingrese un valor mayor a 0");
                                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            }
                                        }
                                        anima.get(poss).setEdad(vida);
                                    }
                                    break;
                                }
                            }else{
                                if (pos==2) {
                                    String nomcien=n.nextLine();
                                    boolean A=false;
                                    while (A==false){
                                        A=true;
                                        System.out.println("ingrese nombre científico");
                                        nomcien=n.nextLine();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        for (animal Animal : anima) {
                                            if (nomcien.equals(Animal.getNom_cien())) {
                                                A=false;
                                                break;
                                            }
                                        }
                                        if (A==false) {
                                            System.out.println("no puede haber 2 perros con el mismo nombre cientifico ingrese otro nombre");
                                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        }
                                    }
                                    System.out.println("ingrese nombre común");
                                    String nomcom=n.nextLine();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("ingrese hábitat");
                                    String hab=n.nextLine();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("ingrese alimentación");
                                    String alime=n.nextLine();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("ingrese descripción de rasgos");
                                    String ras=n.nextLine();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("ingrese distribución geográfica");
                                    String distr=n.nextLine();
                                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    int vida=0;
                                    while (vida<1) {
                                        System.out.println("ingrese edad");
                                        vida=n.nextInt();
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        if (vida<1) {
                                            System.out.println("Ingrese un valor mayor a 0");
                                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
                        }else{
                            if (op==5) {
                                System.out.println("ingrese pocision del perro aliemtado");
                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                int poss=n.nextInt();
                                System.out.println("ingrese pocision del perro que sera comido");
                                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                int poss2=n.nextInt();
                                anima.get(poss).setEdad(anima.get(poss).getEdad()+anima.get(poss2).getEdad());
                                anima.remove(poss2);
                            }
                        }
                    }

                }
            }
        }
        
    }
    
}
