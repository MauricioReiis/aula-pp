package org.example;

public class DetentoHomicidioPena implements Pena {

  static final String PENA = "Pena do detento de homicidio";

  @Override
  public String getPena() {
    return PENA;
  }
}
