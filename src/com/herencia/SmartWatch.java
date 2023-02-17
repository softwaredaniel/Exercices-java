package com.herencia;

public class SmartWatch extends SmartDevice {
 public String wifi;
    public SmartWatch(){

    }
    public SmartWatch(String modelo,String wifi,int capacidad){
        this.modelo=modelo;
        this.capacidad=capacidad;
        this.wifi=wifi;
    }

    public String getWifi() {
        return wifi;
    }
}
