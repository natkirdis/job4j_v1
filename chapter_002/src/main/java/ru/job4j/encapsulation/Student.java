package ru.job4j.encapsulation;

public class Student {
  private String surname;
  private String name;
  private String patronymic;
  private int group;
  private long entryDate;

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public long getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(long entryDate) {
    this.entryDate = entryDate;
  }
}
