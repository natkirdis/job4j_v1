package ru.job4j.inheritance;

public class Doctor extends Profession {
  public Diagnose diagnose(Patient patient) {
    patient.setIsHealthy(false);
    Diagnose disease = new Diagnose("name");
    return disease;
  }

  public void heal(Patient patient) {
  }

  public void prepareInstruments() {
  }
}
