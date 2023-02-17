package com.herencia;

public class SmartDevice {
 public String modelo;
 public  int capacidad;


 //constructor
 public SmartDevice(){

 }
 public SmartDevice(String modelo,int capacidad){
     this.capacidad=capacidad;
     this.modelo=modelo;
 }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}


