/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_joseluispereira;

import java.util.ArrayList;

/**
•	Nombre de la raza.
•	Numero de energía.
•	Número máximo de años.
•	Nombre de la región.
•	Cantidad vivas de esa especie.
•	Lista de nombres de objetos mágicos propios de esas criaturas(puede estar vacía).
•	Peso criaturas

 */
public class Criaturas {
    private String raza;
    private int energia;
    private int max_anos;
    private String region;
    private int c_vivas;
    private ArrayList<String>objetos;
    private int peso_criaturas;

    public Criaturas() {
    }

    public Criaturas(String raza, int energia, int max_anos, String region, int c_vivas, ArrayList<String> objetos, int peso_criaturas) {
        this.raza = raza;
        this.energia = energia;
        this.max_anos = max_anos;
        this.region = region;
        this.c_vivas = c_vivas;
        this.objetos = objetos;
        this.peso_criaturas = peso_criaturas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getMax_anos() {
        return max_anos;
    }

    public void setMax_anos(int max_anos) {
        this.max_anos = max_anos;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getC_vivas() {
        return c_vivas;
    }

    public void setC_vivas(int c_vivas) {
        this.c_vivas = c_vivas;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    public int getPeso_criaturas() {
        return peso_criaturas;
    }

    public void setPeso_criaturas(int peso_criaturas) {
        this.peso_criaturas = peso_criaturas;
    }

    @Override
    public String toString() {
        return "Criaturas{" + "Nombre=" + raza + '}';
    }

    
    
    
    
}
