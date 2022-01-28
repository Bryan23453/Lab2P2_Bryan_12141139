/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_bryan_12141139;

/**
 *
 * @author bryan
 */
public class animal {
    private String nom_cien;
    private String nom_com;
    private String habitat;
    private String alimentacion;
    private String rasgos;
    private String dis_geo;
    private int edad;

    public animal() {
    }

    public animal(String nom_cien, String nom_com, String habitat, String alimentacion, String rasgos, String dis_geo, int edad) {
        this.nom_cien = nom_cien;
        this.nom_com = nom_com;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.rasgos = rasgos;
        this.dis_geo = dis_geo;
        this.edad = edad;
    }
    
    

    public String getNom_cien() {
        return nom_cien;
    }

    public String getNom_com() {
        return nom_com;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getRasgos() {
        return rasgos;
    }

    public String getDis_geo() {
        return dis_geo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNom_cien(String nom_cien) {
        this.nom_cien = nom_cien;
    }

    public void setNom_com(String nom_com) {
        this.nom_com = nom_com;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public void setDis_geo(String dis_geo) {
        this.dis_geo = dis_geo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "animal{" + "nombre_cientifico=" + nom_cien + ", nom_com=" + nom_com + ", habitat=" + habitat + ", alimentacion=" + alimentacion + ", rasgos=" + rasgos + ", dis_geo=" + dis_geo + ", edad=" + edad + '}';
    }
    
}
