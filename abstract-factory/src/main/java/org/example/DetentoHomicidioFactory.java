package org.example;

public class DetentoHomicidioFactory implements CadeiaFactory {

  @Override
  public Bloco emitirBloco() {
    return new DetentoHomicidioBloco();
  }

  @Override
  public Pena emitirPena() {
    return new DetentoHomicidioPena();
  }
}
