package Classes;

public class Animal {

    String name, species;
    int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void speak() {
        System.out.println("My name is "+ name +", I'm a "+ species+", and I'm "+age+" years old.");
    }


}
