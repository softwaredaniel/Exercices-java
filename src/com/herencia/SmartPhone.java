package com.herencia;

public class SmartPhone extends SmartDevice {

    public String camara;
    public SmartPhone(){

    }
    public SmartPhone(String camara,String modelo,int capacidad){
        this.camara=camara;
        this.capacidad=capacidad;
        this.modelo=modelo;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }
}
