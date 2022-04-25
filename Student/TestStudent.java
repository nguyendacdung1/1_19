package StudentManager;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("01","Dung~","HaNoi","dungndth2109007","24/03/2003",1);
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(stu1);
        System.out.println(studentManager.getStudentList());
        studentManager.setStudent();
        System.out.println(stu1);
    }
}
