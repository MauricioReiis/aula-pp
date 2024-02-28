package org.example;

public class App implements Runnable {

    private final Cadeia cadeia = new Cadeia();

    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        System.out.println("Detento preso por furto");
        criarCadeia(Cadeia.FactoryMaker.DetentoType.FURTO);
        System.out.println(cadeia.getBloco().getBloco());
        System.out.println(cadeia.getPena().getPena());

        System.out.println("Detento preso por homicidio");
        criarCadeia(Cadeia.FactoryMaker.DetentoType.HOMICIDIO);
        System.out.println(cadeia.getBloco().getBloco());
        System.out.println(cadeia.getPena().getPena());
    }

    public void criarCadeia(final Cadeia.FactoryMaker.DetentoType detentoType) {
        final CadeiaFactory kingdomFactory = Cadeia.FactoryMaker.makeFactory(detentoType);
        cadeia.setBloco(kingdomFactory.emitirBloco());
        cadeia.setPena(kingdomFactory.emitirPena());
    }
}