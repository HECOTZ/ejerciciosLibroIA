package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

import java.util.ArrayList;

public interface IHM {
    int pedirValorEntero(String pregunta); 
    boolean pedirValorBooleano(String pregunta); 
    void mostrarHechos(ArrayList<IHecho> hechos); 
    void mostrarReglas(ArrayList<Regla> reglas); 
}
