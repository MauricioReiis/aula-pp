package org.example;

public class DetentoFurtoPena implements Pena {

  static final String PENA = "Pena do detento de furto";

  @Override
  public String getPena() {
    return PENA;
  }
}
