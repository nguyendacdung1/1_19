package Java2_01;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Dung",19));
        people.add(new Person("Anh",29));
        people.add(new Person("Ha",18));
        people.add(new Person("Minh",30));
        people.add(new Person("Thi",41));

        System.out.println("People: "+people);
// cach' 1
        people.sort((person1, person2) ->{
            return person1.getAge() - person2.getAge();
        });
//cach' 2
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Danh sach xep theo do tuoi: "+people);
// xep theo ten
        Collections.sort(people,Comparator.comparing(Person::getName));
        System.out.println("danh sach xep theo ten: "+people);
    }
}
