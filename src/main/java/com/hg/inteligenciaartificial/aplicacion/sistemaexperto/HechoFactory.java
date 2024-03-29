package com.hg.inteligenciaartificial.aplicacion.sistemaexperto;

import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Clase que permite crear los hechos, independientemente de su tipo
class HechoFactory {

	private static Logger logger = LoggerFactory.getLogger(HechoFactory.class);
	
    // Crea un nuevo hecho rellenando el valor dado por el usuario
    static IHecho Hecho(IHecho f, MotorInferencias m) {
        try {
            IHecho nuevoHecho;
            Class clase = f.getClass();
            if(clase.equals(Class.forName("com.hg.inteligenciaartificial.aplicacion.sistemaexperto.HechoEntero"))) {
                nuevoHecho = CrearHechoEntero(f, m);
            } else {
                nuevoHecho = CrearHechoBooleen(f, m);
            }
            return nuevoHecho;
        } catch (ClassNotFoundException ex) {
        	logger.error("Error Hecho", ex);
            return null;
        }
    }
    
    // Crea un hecho entero
    static IHecho CrearHechoEntero(IHecho f, MotorInferencias m) {
        int valor = m.pedirValorEntero(f.getPregunta());
        return new HechoEntero(f.getNombre(), valor, null, 0);
    }

    // Crea un hecho booleano
    static IHecho CrearHechoBooleen(IHecho f, MotorInferencias m) {    
        boolean valorB = m.pedirValorBooleano(f.getPregunta());
        return new HechoBooleen(f.getNombre(), valorB, null, 0);
    }

    // Crea un nuevo hecho a partir de su cadena
    static IHecho Hecho(String hechoStr) {
        hechoStr = hechoStr.trim();
        if (hechoStr.contains("=")) {
            // Existe el símbolo "=", por lo que es un hecho entero
            hechoStr = hechoStr.replaceFirst("^" + "\\(", "");
            String[] nombreValorPregunta = hechoStr.split("[=()]");
            if (nombreValorPregunta.length >= 2) {
                // Tenemos un hecho correcto Nombre=Valor[(pregunta)]
                String pregunta = null;
                if (nombreValorPregunta.length == 3) {
                    pregunta = nombreValorPregunta[2].trim();
                }
                return new HechoEntero(nombreValorPregunta[0].trim(), Integer.parseInt(nombreValorPregunta[1].trim()), pregunta, 0);
            }
        }
        else {
            // Es un hecho booleano nombre[(pregunta)] o !nombre[(pregunta)]
            boolean valor = true;
            if (hechoStr.startsWith("!")) {
                valor = false;
                hechoStr = hechoStr.substring(1).trim();
            }
            // Split, después de aber eliminado el primer delimitador si es necesario : '('
            hechoStr = hechoStr.replaceFirst("^" + "\\(", "");
            String[] nombrePregunta = hechoStr.split("[()]");
            String pregunta = null;
            if (nombrePregunta.length == 2) {
                pregunta = nombrePregunta[1].trim();
            }
            return new HechoBooleen(nombrePregunta[0].trim(), valor, pregunta, 0);
        }
        // Si llegamos aquí, la sintaxis es incorrecta
        return null;
    }
}
