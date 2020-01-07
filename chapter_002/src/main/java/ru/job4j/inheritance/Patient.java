package ru.job4j.inheritance;

public class Patient {
  private String name;
  private String surname;
  private boolean isHealthy;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public boolean getIsHealthy() {
    return isHealthy;
  }

  public void setIsHealthy(boolean healthy) {
    isHealthy = healthy;
  }
}
