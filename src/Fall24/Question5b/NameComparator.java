package Fall24.Question5b;


import java.util.Comparator;
class NameComparator implements Comparator<Cow> {
    @Override
    public int compare(Cow c1, Cow c2) {
        return c1.name.compareTo(c2.name);
    }
}
