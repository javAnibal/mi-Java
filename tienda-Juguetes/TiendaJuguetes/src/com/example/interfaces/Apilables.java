package com.example.interfaces;

import com.example.models.Juguete;
import com.example.utils.JuguetesException;

public interface Apilables {
    boolean apilar(Juguete otroJuguete) throws JuguetesException;
}
