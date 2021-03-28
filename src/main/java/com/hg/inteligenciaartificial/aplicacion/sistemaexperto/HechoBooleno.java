package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

// Clase para los hechos booleanos (comme el hecho de être o no un triangulo)
class HechoBooleen implements IHecho {

    // Nombre del hecho
    protected String nombre;
    public String getNombre() {
        return nombre;
    }

    // Valor booleano del hecho
    protected boolean valor;
    public Object getValor() {
        return valor;
    }

    // Nivel (0 para los hechos como entrada)
    protected int nivel;
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int n) {
        nivel = n;
    }
    
    // Pregunta que se debe hacer al usuario si es necesario
    protected String pregunta;
    public String getPregunta() {
        return pregunta;
    }

    // Constructor
    public HechoBooleen(String _nombre , boolean _valor, String _pregunta, int _nivel) {
        nombre = _nombre ;
        valor = _valor;
        pregunta = _pregunta;
        nivel = _nivel;
    }

    // Métodos toString (para la visualización)
    // de la forma Hecho(nivel) o !Hecho(nivel)
    @Override
    public String toString() { 
        String res = ""; 
        if (!valor) { 
            res += "!"; 
        } 
        res += nombre + " (" + nivel + ")"; 
        return res; 
    } 
}
