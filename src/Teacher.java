public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String address, String subject) {
        super(name, age, address);
        this.subject = subject;
    }

    public void assignGrade(Student student, double newGrade) {
        System.out.println("Grade " + newGrade + " assigned to " + student.getDetails());
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nSubject: " + subject;
    }
}
