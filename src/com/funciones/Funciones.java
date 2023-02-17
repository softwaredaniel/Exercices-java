package com.funciones;

public class Funciones {
    public static void main(String[] args) {
        //opcion 1:funcion sin parametros
    // menu();

        //opcion 2:funcion sin parametros y con retorno
     String menu =  getMenu();
     System.out.println(menu);

     //opcion 3:funcion con parametros y sin retorno
     saludo("Hola");
     //opcion 4:funcion con parametros y con retorno
        String nombre="Jose";
        String  apellido="Solano";
        String darSaludo=obtenerSaludo(nombre,apellido);
        System.out.println(darSaludo);
        /**
         *  Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
         */
        int iva =19;
        int precio=90000;
        int calcular=recibirPrecio(iva,precio);
        System.out.println(calcular);
    }


    /**
     * void indica que no devuelve nada
     */
   static void  menu(){
        System.out.println("Bienvenido al menu");
        System.out.println("1 modulo admin");
    }

    static   String getMenu(){
       return "Bienvenido al menu \n 1 modulo admin";
    }

    static  void saludo(String name){
       System.out.println("Buenas tardes " + name);
    }
    static  String obtenerSaludo(String nombre, String apellido){
        return "Buenas"+nombre + apellido;
    }

    static  int recibirPrecio(int iva, int precio){
       return iva+precio;
    }
}
