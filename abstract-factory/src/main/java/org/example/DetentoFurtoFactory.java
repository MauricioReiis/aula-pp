package org.example;

public class DetentoFurtoFactory implements CadeiaFactory {

  @Override
  public Bloco emitirBloco() {
    return new DetentoFurtoBloco();
  }

  @Override
  public Pena emitirPena() {
    return new DetentoFurtoPena();
  }

}
