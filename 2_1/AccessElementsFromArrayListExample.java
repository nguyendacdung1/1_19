package Java2_01;
import java.util.ArrayList;
import java.util.List;
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        //Kiểm tra xem Danh sách Mảng có trống không
        System.out.println("Is the topCompanies list empty? :" +topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebooh");

        // Kiem tra size danh sach

        System.out.println("Here are the top " +topCompanies.size() +" companies in the world");
        System.out.println(topCompanies);

        //Truy xuất phần tử tại một chỉ mục nhất định
        String betCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() -1); //tu duoi' len

        System.out.println("Best: " +betCompany);
        System.out.println("Second: " +secondBestCompany);
        System.out.println("Last: " +lastCompany);
        System.out.println("List truoc thay doi: "+topCompanies);
        //Thay doi danh sach
        topCompanies.set(4,"Tiktok");
        System.out.println("List thay doi: " +topCompanies);
        //Xoa'
        topCompanies.remove(4);
        System.out.println("After remove(4): "+topCompanies);
        topCompanies.remove("Amazon");
        System.out.println("After remove(Amazon): "+topCompanies);
        List<String> maytinh = new ArrayList<>();
        maytinh.add("Google");
        maytinh.add("Microsoft");

        topCompanies.removeAll(maytinh);
        System.out.println("After removeAll: "+topCompanies);

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebooh");
        System.out.println(topCompanies);
        //xoa' nhung danh sach' co chu cai dau la "A"
        topCompanies.removeIf(n -> (n.charAt(0)=='A'));
        System.out.println("After remove all element that start with 'A': "+topCompanies);
        //xoa' all
        topCompanies.clear();
        System.out.println("After clear(): " +topCompanies);


    }
}
