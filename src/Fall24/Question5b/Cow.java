package Fall24.Question5b;

import org.jetbrains.annotations.NotNull;

public class Cow implements Comparable<Cow>{
    String name;
    int price;
    public Cow(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Cow other) {
        if(this.price > other.price)
            return 1;
        else if(this.price < other.price)
            return -1;
        else
            return 0;
    }

    public String toString() {
        return name + " costs " + price + " taka.";
    }
}
