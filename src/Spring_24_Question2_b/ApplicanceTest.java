package Spring_24_Question2_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ApplicanceTest {
    public static void main(String[] args) {
        ArrayList <Appliance> applianceArrayList = new ArrayList<>();
        applianceArrayList.add(new Appliance("Television","Entertainment",150));
        applianceArrayList.add(new Appliance("Washing machine","Laundry",2000));
        applianceArrayList.add(new Appliance("Refrigerator","Kitchen",100));
        for(int i=0;i<applianceArrayList.size();i++)
        {
            if(applianceArrayList.get(i).category.equals("Kitchen"))
            {
                System.out.println(applianceArrayList.get(i));
            }

        }

        Collections.sort(applianceArrayList, new Comparator<Appliance>() {
            @Override
            public int compare(Appliance o1, Appliance o2) {
                if (o1.powerConsumption < o2.powerConsumption) {
                    return 1;
                } else if (o1.powerConsumption > o1.powerConsumption) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Higher power Consumtion"+applianceArrayList.get(0));
        System.out.println("Lowest power Consumtion"+applianceArrayList.get(applianceArrayList.size()-1));

    }
}
