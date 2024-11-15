package com.mycompany.testbotanico;


public class Arbusto extends Planta implements Podable{
    private int densidadFollaje;
    private final static int MIN_FOLLAJE = 1;
    private final static int MAX_FOLLAJE = 10;

    public Arbusto(String nombre, String ubicacion, String clima,int densidadFollaje) {
        super(nombre, ubicacion, clima);
        validarFollaje(densidadFollaje);
        this.densidadFollaje = densidadFollaje;
    }
    
    @Override
    public void podar() {
        System.out.println("El arbusto " + getNombre() + " esta siendo podado");
    }

    @Override
    public String toString() {
        return super.toString() + ", densidadFollaje=" + densidadFollaje;
    }
    
    private void validarFollaje(int densidadFollaje){
        if(densidadFollaje < MIN_FOLLAJE || densidadFollaje > MAX_FOLLAJE){
            throw new IllegalArgumentException("Follaje invalido de " + getNombre());
        }
    }
}
