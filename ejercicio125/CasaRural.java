/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio125;

/**
 *
 * @author Usuario
 */
public class CasaRural {
    private String id;
    private String poblacion;
    private int numHabitacion;
    private double precio;
    private boolean EsAlta;
    private String direccion;

    public CasaRural(String id, String poblacion, int numHabitacion, double precio, boolean EsAlta, String direccion) {
        this.id = id;
        this.poblacion = poblacion;
        this.numHabitacion = numHabitacion;
        this.precio = precio;
        this.EsAlta = EsAlta;
        this.direccion = direccion;
    }

    public void setEsAlta(boolean EsAlta) {
        this.EsAlta = EsAlta;
    }

    

    public CasaRural() {
       
    }

    public String getId() {
        return id;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEsAlta() {
        return EsAlta;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getid() {
       return id;
    }

    
    
    
    
}
