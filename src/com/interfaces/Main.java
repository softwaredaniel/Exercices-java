package com.interfaces;

public class Main {

   static CocheCRUD cocheCRUD;
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCRUD.findAll();
        cocheCRUD.save(new CocheCRUDImpl());
    }
}
