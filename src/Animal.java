public abstract class Animal {
    public abstract String makeSound();

    @Override
    public String toString() {
        return this.makeSound();
    }
}
