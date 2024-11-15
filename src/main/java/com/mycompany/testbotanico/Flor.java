package com.mycompany.testbotanico;


public class Flor extends Planta {
    private Temporada temporadaFlorecimiento;

    public Flor(String nombre, String ubicacion, String clima,Temporada temporada) {
        super(nombre, ubicacion, clima);
        this.temporadaFlorecimiento = temporada;
    }

    @Override
    public String toString() {
        return super.toString() + ", temporadaFlorecimiento=" + temporadaFlorecimiento;
    }
    
}
