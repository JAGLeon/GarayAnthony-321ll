package com.mycompany.testbotanico;


public abstract class Planta {
    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }
    
    public void mostrarPlanta(){
        System.out.println(toString());
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Planta)) {
            return false;
        }

        Planta other = (Planta) obj;

        return this.nombre.equals(other.nombre) && this.ubicacion.equals(other.ubicacion);
    }
    
}
