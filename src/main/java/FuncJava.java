import live.Animal;

public class FuncJava {

    public void createAnimal() {
        createAnimal("동물", 0);
    }

    public void createAnimal(String name, int foot) {
        Animal animal = new Animal(name, foot);
        System.out.println(animal);
    }
}
