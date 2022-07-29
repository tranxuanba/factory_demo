public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) return new Dog();
        else if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}
