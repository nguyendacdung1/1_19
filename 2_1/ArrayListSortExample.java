package Java2_01;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anh");
        names.add("Huy");
        names.add("Lien");
        names.add("Minh");
        names.add("Dung");

        System.out.println("before: "+names);
// Sắp xếp Danh sách Mảng bằng cách sử dụng phương pháp sort() của nó. Bạn phải vượt qua bộ so sánh với phương pháp ArrayList.sort().
    /*    names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });*/
      //Cuộc gọi phương pháp 'sắp xếp()' ở trên cũng có thể được viết đơn giản bằng cách sử dụng biểu thức lambda
/*
        names.sort((name1,name2) -> name1.compareTo(name2));
*/

        //1 phuong phap ngan' hon
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names: " +names);
    }
}
