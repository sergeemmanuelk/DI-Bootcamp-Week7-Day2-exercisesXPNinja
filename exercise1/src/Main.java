public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStdName("Kiran");
        student.setStdRollNo(4);
        student.setStdId(12345);

        System.out.println("Student's Name: " + student.getStdName());
        System.out.println("Student's Roll no.: " + student.getStdRollNo());
        System.out.println("Student's Id: " + student.getStdId());
    }
}