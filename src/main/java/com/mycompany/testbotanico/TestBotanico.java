package com.mycompany.testbotanico;


public class TestBotanico {

    public static void main(String[] args) {
        
        try {
            JardinBotanico jb = new JardinBotanico();
            jb.agregarPlanta(new Flor("Lola","Medianera","Caluroso",Temporada.PRIMAVERA));
            jb.agregarPlanta(new Arbusto("Pedro","Balcon","Frio",5));
            jb.agregarPlanta(new Arbusto("Juan","Balcon","Frio",10));
            jb.agregarPlanta(new Arbol("Hugo","Patio","Caluroso",10));
            jb.agregarPlanta(new Arbol("Fabri","Patio","Caluroso",3));
            
            jb.mostrarPlantas();
            jb.podarPlantas();
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
