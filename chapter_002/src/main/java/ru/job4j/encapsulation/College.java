package ru.job4j.encapsulation;

public class College {
  public static void main(String[] args) {
    Student student = new Student();
    student.setName("Иван");
    student.setSurname("Петров");
    student.setPatronymic("Иванович");
    student.setGroup(512);
    student.setEntryDate(1578480257);

    System.out.println("ФИО : " + student.getSurname() + " " + student.getName() + " " +
            student.getPatronymic() + " " + "\n" + "группа : " + student.getGroup());
  }
}