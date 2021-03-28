package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

// Clase para los hechos booleanos (comme el hecho de être o no un triangulo)
class HechoBooleen implements IHecho {

    // Nombre del hecho
    protected String nombre;
    // Valor booleano del hecho
    protected boolean valor;
    // Nivel (0 para los hechos como entrada)
    protected int nivel;
    // Pregunta que se debe hacer al usuario si es necesario
    protected String pregunta;

    // Constructor
    public HechoBooleen(String nombre , boolean valor, String pregunta, int nivel) {
        this.nombre = nombre ;
        this.valor = valor;
        this.pregunta = pregunta;
        this.nivel = nivel;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Object getValor() {
        return valor;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int n) {
        nivel = n;
    }
    
    public String getPregunta() {
        return pregunta;
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
