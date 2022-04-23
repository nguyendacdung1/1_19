package Java2_01;

import java.util.ArrayList;
import java.util.List;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //Tạo Danh sách Mảng từ bộ sưu tập khác
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(13);
        firstFivePrimeNumbers.add(17);
        firstFivePrimeNumbers.add(19);
        firstFivePrimeNumbers.add(23);
        firstFivePrimeNumbers.add(29);

        //Thêm toàn bộ bộ sưu tập vào Danh sách Mảng

        firstTenPrimeNumbers.addAll(firstFivePrimeNumbers);

        System.out.println(firstFivePrimeNumbers);
    }
}
