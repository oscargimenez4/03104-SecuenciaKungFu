/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {
    
    public static void main(String[] args) {
        //Constantes
        final double DINERO_INICIAL = 2;
        final double PRECIO_PELICULA = 1.3;
        final double PRECIO_PALOMITAS = 0.45;
        //Variables
        double precioPersona;
        double dineroFinal;
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
        System.out.printf(Locale.ENGLISH,"Dinero inicial .....: %.2f €%n",DINERO_INICIAL);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH,"Precio película ....: %.2f €%n", PRECIO_PELICULA);
        System.out.printf(Locale.ENGLISH,"Parte palomitas ....: %.2f €%n", PRECIO_PALOMITAS);
        System.out.println("---");
        precioPersona = PRECIO_PELICULA + PRECIO_PALOMITAS;
        System.out.printf(Locale.ENGLISH,"Gastos por persona .: %.2f €%n", precioPersona);
        System.out.println("---");
        dineroFinal = DINERO_INICIAL - precioPersona;
        System.out.printf(Locale.ENGLISH,"Dinero restante ....: %.2f €%n", dineroFinal);
    }
}
