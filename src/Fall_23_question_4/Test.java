package Fall_23_question_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList <Address> addressArrayList= new ArrayList<>();
        addressArrayList.add(new Address("19/A","Dhanmondi","Dhaka",1209));
        addressArrayList.add(new Address("2/A","Tejgaon","Dhaka",1215));
        addressArrayList.add(new Address("65","Nirala","Khulna",9100));

        addressArrayList.add(1,new Address("214","Aamtola","Barishal",8200));
        addressArrayList.set(2,new Address("36","Ghulsan","Dhaka",1212));

        Collections.sort(addressArrayList, new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
               if(o1.zip_code>o2.zip_code)
               {
                   return 1;
               }
               else if(o1.zip_code<o2.zip_code)
               {
                   return -1;
               }
               else {
                   return 0;
               }
            }
        });
        addressArrayList.remove(2);
        for(Address s: addressArrayList)
        {
            System.out.println(s);
        }
    }
}
