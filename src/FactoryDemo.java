public class FactoryDemo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        Animal cat = AnimalFactory.getAnimal("cat");
        System.out.println("tieng keu cho: " + dog);
        System.out.println("tieng keu meo: " + cat);
    }
}
