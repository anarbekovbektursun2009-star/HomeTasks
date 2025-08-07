package ConstrctorLMStask;

import java.util.Arrays;

public class MyClass {
    String name;
    String surName;
    int age;
    String[] javaCours;

    public MyClass() {
        name = "Beka";
        surName = "Anarbekov";
        age = 15;
        javaCours = new String[]{"Java","..."};
    }
    public MyClass(String at, String familiya, int age, String[] javaCours) {
        this.name = at;
        this.surName = familiya;
        this.age = age;
        this.javaCours = javaCours;
            }
    public void getInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Фамилиясы: " + surName);
        System.out.println("Жашы: " + age);
        System.out.println("Сабактар: " + Arrays.toString(javaCours));
        System.out.println("------------------------");
    }

}
