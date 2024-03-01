package org.example;

public class DetentoBuilder {
    private Detento detento;

    public DetentoBuilder() {
        detento = new Detento();
    }

    public Detento build() {
        if (detento.getBloco() == "") {
            throw new IllegalArgumentException("Bloco de celas inválido");
        }
        if (detento.getCrime() == "") {
            throw new IllegalArgumentException("Crime inválido");
        }
        if (detento.getPena() == "") {
            throw new IllegalArgumentException("Pena inválida");
        }
        return detento;
    }

    public DetentoBuilder setBloco(String bloco) {
        detento.setBloco(bloco);
        return this;
    }

    public DetentoBuilder setPena(String pena) {
        detento.setPena(pena);
        return this;
    }

    public DetentoBuilder setCrime(String crime) {
        detento.setCrime(crime);
        return this;
    }
}
