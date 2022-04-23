package Java2_01;
import java.util.ArrayList;
import java.util.List;
public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        //Kiểm tra xem ArrayList có chứa một phần tử đã cho hay không
        System.out.println("does names array contain 'Bob'?: "+names.contains("Bob"));

        // tim' lan' xuat' hien. dau' tien cua? phan' tu?
        System.out.println("indexOf 'Steve': " + names.indexOf("Steve"));
        System.out.println("indexOf 'Mark': " + names.indexOf("Mark"));

        //tim' lan' cuoi' xuat' hien. cua? phan' tu?
        System.out.println("lastIndexOf John : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf Bill : " + names.lastIndexOf("Bill"));
    }
}
