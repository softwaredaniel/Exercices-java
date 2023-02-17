package com.interfaces;



import java.util.List;

/**
 * Se declaran los metodos
 */

public interface CocheCRUD {

  void  save(CocheCRUD cocheCRUD);
  List<CocheCRUD>findAll();
 void deleted(CocheCRUD cocheCRUD);
}
