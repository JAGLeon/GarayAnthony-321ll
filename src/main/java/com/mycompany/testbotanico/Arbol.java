package com.mycompany.testbotanico;


public class Arbol extends Planta implements Podable{
    private int alturaMaxima;
    private final static int MIN_ALTURA = 0;
    public Arbol(String nombre, String ubicacion, String clima,int alturaMaxima) {
        super(nombre, ubicacion, clima);
        validarAltura(alturaMaxima);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void podar() {
        System.out.println("El arbol " + getNombre() + " esta siendo podado");
    }

    @Override
    public String toString() {
        return super.toString() + ", alturaMaxima=" + alturaMaxima;
    }

    private void validarAltura(int alturaMaxima){
        if(alturaMaxima > MIN_ALTURA){
            throw new IllegalArgumentException("Altura invalida " + getNombre());
        }
    }
}
