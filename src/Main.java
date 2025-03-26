public class Main {
    public static void main(String[] args) {
        double[] studentGrades = {85, 90, 78, 92};
        Student student1 = new Student("John Doe", 16, "123 Main St", studentGrades);
        System.out.println(student1.getDetails());

        Teacher teacher1 = new Teacher("Mrs. Smith", 45, "456 Oak St", "Mathematics");
        System.out.println("\n" + teacher1.getDetails());

        teacher1.assignGrade(student1, 95);


    }
}
