package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

import java.util.List;

public interface IHM {
    int pedirValorEntero(String pregunta); 
    boolean pedirValorBooleano(String pregunta); 
    void mostrarHechos(List<IHecho> hechos); 
    void mostrarReglas(List<Regla> reglas); 
}
