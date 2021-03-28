package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona la base de reglas
class BaseDeReglas {
    // Lista de las reglas
    protected List<Regla> reglas;
    public List<Regla> getReglas() {
       return reglas;
    }
    public void setReglas(List<Regla> reglas) {
        // Se copia las reglas y se añaden
        for (Regla regla : reglas) {
            Regla copia = new Regla(regla.nombre, regla.premisas, regla.conclusion);
            this.reglas.add(copia);
        }
    }
   
    // Constructor
    public BaseDeReglas() { 
        reglas = new ArrayList<>(); 
    } 

    // Eliminar las reglas
    public void clearBase() { 
        reglas.clear(); 
    } 
  
    // Agregar una regla a la base
    public void agregarRegla(Regla r) { 
        reglas.add(r); 
    } 
  
    // Eliminar una regla
    public void eliminar(Regla r) { 
        reglas.remove(r); 
    }
}
