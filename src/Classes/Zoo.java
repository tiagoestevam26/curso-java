package Classes;

public class Zoo {

    public static void addAnimals( ){
        Animal animal1 = new Animal("Marcos", "elephant", 14);
        Animal animal2 = new Animal("John", "dog", 9);
        Animal animal3 = new Animal("Luiza", "tiger", 33);
        animal1.speak();
        animal2.speak();
        animal3.speak();
    }

    public static void main(String[] args) {
        addAnimals();
    }
}
