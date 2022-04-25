package StudentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList;
    private static Scanner in = new Scanner(System.in);

    public StudentManager(){
        this.studentList=new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addStudent(){
        String rollNo;
        String fullName;
        String address;
        String email;
        String DOB;
        int status;

        System.out.println("Add student: ");
        System.out.println("Nhap rollNO");
        rollNo = in.next();

        for (Student student: studentList){
            if (student.getRollNo().equals(rollNo)){
                System.out.println("Sinh viên đã tồn tại.");
            }
            else {
                System.out.println("Nhập tên sv");
                fullName = in.next();
                System.out.println("Nhập địa chỉ sv");
                address = in.next();
                System.out.println("Nhập email");
                email = in.next();
                System.out.println("Nhập ngày sinh");
                DOB = in.next();
                System.out.println("Nhập trạng thái");
                status = in.nextInt();
                addStudent(new Student(rollNo,fullName,address,email,DOB,status));
                System.out.println("Thêm thành công.");
            }
        }
    }

    public void setStudent(){
        System.out.println("Nhập ID cần sửa: ");
        String ID = in.next();
        boolean check=false;
        Student stu = null;

        for (Student student:studentList){
            if (student.getRollNo().equals(ID)){
                check=true;
                stu=student;
                break;
            }
        }

        if (check){
            System.out.println("Tùy chọn: ");
            System.out.println("1. Đổi email.");
            System.out.println("2. Đổi address.");
            System.out.println("3. Đổi status.");
            int selection = in.nextInt();
            switch (selection){
                case 1 :
                    System.out.println("Mời bạn thay đổi");
                    String email = in.next();
                    for (Student student:studentList){
                        if (student.equals(stu)){
                            student.setEmail(email);
                        }
                    }
                    break;
                case 2 :
                    System.out.println("Mời bạn nhập thay đổi");
                    int st = in.nextInt();
                    for (Student student :studentList) {
                        if(student.equals(stu)){
                            student.setStatus(st);
                        }

                    }
                    break;
                case 3 :
                    System.out.println("Mời bạn nhập thay đổi");
                    String address = in.next();
                    for (Student student :studentList) {
                        if(student.equals(stu)){
                            student.setAddress(address);
                        }

                    }
                    break;
                default:
                    System.out.println("Bạn đã chọn sai");
            }
        }else {
            System.out.println("ID không tồn tại");
        }
    }
}
