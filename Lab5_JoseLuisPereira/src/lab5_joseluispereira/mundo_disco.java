/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_joseluispereira;

import java.util.ArrayList;

/**
 *nombre de la tortuga que lleva el mundo en su espalda  y una lista de las Criaturas. 
 */
public class mundo_disco {
    private String nom_tortuga;
    private ArrayList<Criaturas> criaturs;
    private int peso_tortu;

    public mundo_disco() {
    }

    public mundo_disco(String nom_tortuga, int peso_tortu) {
        this.nom_tortuga = nom_tortuga;
        this.criaturs = criaturs;
        this.peso_tortu = peso_tortu;
    }

    public String getNom_tortuga() {
        return nom_tortuga;
    }

    public void setNom_tortuga(String nom_tortuga) {
        this.nom_tortuga = nom_tortuga;
    }

    public ArrayList<Criaturas> getCriaturs() {
        return criaturs;
    }

    public void setCriaturs(ArrayList<Criaturas> criaturs) {
        this.criaturs = criaturs;
    }

    public int getPeso_tortu() {
        return peso_tortu;
    }

    public void setPeso_tortu(int peso_tortu) {
        this.peso_tortu = peso_tortu;
    }

    @Override
    public String toString() {
        return "Mundo Disco{" + nom_tortuga +  '}';
    }

        
    
    
      
}
