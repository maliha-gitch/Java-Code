package Summer_23.five_a;

public class Main {
    public void speak(Animal target)
    {
        if(target instanceof Baby){
            System.out.println("WAHHHH");
        }
        else if(target instanceof Cat){
            System.out.println("Meow");
        }
        else {
            System.out.println("GIRRR");
        }
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.speak(new Baby());
        main.speak(new Cat());
        main.speak(new Animal() {});
    }
}
