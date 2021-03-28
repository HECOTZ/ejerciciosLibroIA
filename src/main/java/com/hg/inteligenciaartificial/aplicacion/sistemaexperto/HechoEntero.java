package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

// Clase para los hechos enteros (como el número de aldos)
class HechoEntero implements IHecho {

    // Nombre del hecho
    protected String nombre;    
    public String getNombre() {
        return nombre;
    }

    // Valor entero asociado
    protected int valor;
    public Object getValor() {
        return valor;
    }

    // Nivel (0 para los hechos como entrada)
    protected int nivel;
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    // Pregunta que hay que hacer al usuario si es necesario
    protected String pregunta = "";
    public String getPregunta() {
        return pregunta;
    }

    // Constructor
    public HechoEntero(String _nombre , int _valor, String _pregunta, int _nivel) {
        nombre = _nombre ;
        valor = _valor;
        nivel = _nivel;
        pregunta = _pregunta;
    }
    
    // Métodos toString (para la visualización)
    @Override
    public String toString() {
        return nombre + "=" + valor + " (" + nivel + ")";
    }
}
