package org.example;

public class Main {
    public static void main(String[] args) {
        DetentoBuilder detentoBuilder = new DetentoBuilder();
        Detento detento = detentoBuilder
                .setBloco("1")
                .setCrime("Furto")
                .setPena("2 anos")
                .build();

        System.out.println("Bloco: "+detento.getBloco()+", Crime: "+ detento.getCrime()+", Pena: "+ detento.getPena());
    }

}