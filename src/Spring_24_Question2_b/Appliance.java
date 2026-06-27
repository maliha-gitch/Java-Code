package Spring_24_Question2_b;

public class Appliance {
    String name;
    String category;
    double powerConsumption;
    Appliance(String name,String category,double powerConsumption)
    {
        this.name=name;
        this.category=category;
        this.powerConsumption=powerConsumption;
    }

    @Override
    public String toString() {
        return name+" "+category+" "+powerConsumption;
    }
}
