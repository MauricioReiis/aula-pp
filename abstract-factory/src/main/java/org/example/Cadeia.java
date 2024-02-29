package org.example;

public class Cadeia {

  private Bloco bloco;
  private Pena pena;

  public void setPena(Pena pena) {
    this.pena = pena;
  }

  public Pena getPena(){
    return this.pena;
  }

  public void setBloco(Bloco bloco) {
    this.bloco = bloco;
  }

  public Bloco getBloco() {
    return this.bloco;
  }

  public static class FactoryMaker {

    public enum DetentoType {
      FURTO, HOMICIDIO
    }
    public static CadeiaFactory makeFactory(DetentoType type) {
      return switch (type) {
        case FURTO -> new DetentoFurtoFactory();
        case HOMICIDIO -> new DetentoHomicidioFactory();
      };
    }
  }
}
