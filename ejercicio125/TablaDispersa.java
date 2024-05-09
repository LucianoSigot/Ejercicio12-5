/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio125;

import ejercicio125.CasaRural;

public class TablaDispersa {
    private int Elementos;
    private double FactorCarga;
    private CasaRural[] Tabla;
    static final int TAMANIO = 101;

    
    public TablaDispersa() {
        this.Elementos = Elementos;
        this.FactorCarga = FactorCarga;
        this.Tabla = Tabla;
    }
    
    
    public int direccion(String id){
        int posicion,i=0;
        long d= transformarcadena(id);
        posicion=(int)(d % TAMANIO);
        while(Tabla[posicion]!=null &&!Tabla[posicion].getId().equals(id)){
        i++;
        posicion=posicion+i*i;
        posicion=posicion%TAMANIO;
        }
        return posicion;
    }
    
    public long transformarcadena(String c){
        long d;
        d=0;
        int i=0;
        for(i=0;i<Math.min(10,c.length());i++){
            d=d*27+(int)c.charAt(i);
        }
        if(d<0) d= -d;
        return d;
        }
    public void insertar(CasaRural Casa1){
        int posicion;
        posicion=direccion(Casa1.getid());
        Tabla[posicion]=Casa1;
        Elementos++;
        FactorCarga=(double)(Elementos)/TAMANIO;
        if(FactorCarga>0.5)
            System.out.println("El Factor de carga supera el 50%");
    }

    public void iniciar() {
       int i=0;
        this.Elementos=0;
        this.FactorCarga=0.0;
        Tabla =new CasaRural[TAMANIO];
        for(i=0;i<TAMANIO;i++){
            Tabla[i]=null;
        }
    }
    public void buscar(String clave){
        int posicion;
        posicion=direccion(clave);
        if(Tabla[posicion]!=null&&Tabla[posicion].isEsAlta()!=false){
        System.out.println("Codigo:"+Tabla[posicion].getId());
        System.out.println("Direccion:"+Tabla[posicion].getDireccion());
        System.out.println("Poblacion:"+Tabla[posicion].getPoblacion());
        System.out.println("Precio:"+Tabla[posicion].getPrecio());
        System.out.println("NumHabitacion:"+Tabla[posicion].getNumHabitacion());    
        }
        else 
            System.out.println("No se encontro la casa");
        
           }
   
        
    
    public void eliminar(String clave){
        int posicion;
        posicion=direccion(clave);
        if(Tabla[posicion]!=null){
            Tabla[posicion].setEsAlta(false);
            System.out.println("La casa se borro");
        }
    }
    }

    
    
    
 

