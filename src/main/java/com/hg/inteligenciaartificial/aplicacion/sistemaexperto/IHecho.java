package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

// Interface para todos los hechos que se debe implementar
public interface IHecho {
    String getNombre();
    Object getValor();
    int getNivel();
    String getPregunta();
    
    void setNivel(int nivel); // Permite modificar el nivel de un hecho
}
