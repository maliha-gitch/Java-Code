package Interface;

public class Bird extends Animal implements Flyable,Floatable{

    Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public void canFLoat() {
        System.out.println("Bird can float in the air");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly in the"+Bird.media);
    }

    @Override
    public boolean needFuel() {
        return false;
    }
}
