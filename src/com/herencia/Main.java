package com.herencia;

public class Main {

    public static void main(String[] args) {
      SmartDevice smart=new SmartDevice("iphone",128);
         System.out.println(smart.modelo);
      SmartDevice phone=new SmartPhone("50PX","Samsung",50);
         System.out.println(phone.modelo);
         SmartDevice reloj=new SmartWatch("series x","si",10);
        System.out.println(reloj.modelo);

    }
}
