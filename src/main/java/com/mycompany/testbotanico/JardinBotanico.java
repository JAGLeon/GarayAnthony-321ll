package com.mycompany.testbotanico;

import java.util.ArrayList;
import java.util.List;


public class JardinBotanico {
    private List<Planta> plantas = new ArrayList<>();
    
    public void agregarPlanta(Planta planta){
        if(planta == null){
            throw new NullPointerException("No se pudo agregar la planta");
        }
        
        for (Planta p : plantas) {
            if (p.equals(planta)) { 
                throw new PlantaDuplicadaException("Ya existe una planta con el mismo nombre y ubicacion");
            }
        }
        plantas.add(planta);
    }
    
    public void mostrarPlantas(){
        if(plantas.isEmpty()){
            System.out.println("No hay plantas");
        } else {
            for (Planta p : plantas) {
                System.out.println(p);
            }
        }
    }
    
    public void podarPlantas(){
        for (Planta planta : plantas) {
            if (planta instanceof Podable) {
                ((Podable) planta).podar();
            } else {
                System.out.println("No es necesario podar la flor");
                
            }
        }
    }
}
