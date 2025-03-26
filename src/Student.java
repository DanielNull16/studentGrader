public class Student extends Person {
    private double[] grades;

    public Student(String name, int age, String address, double[] grades) {
        super(name, age, address);
        this.grades = grades;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return (grades.length > 0) ? sum / grades.length : 0;
    }

    public String assignLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        if (avg >= 80) return "B";
        if (avg >= 70) return "C";
        if (avg >= 60) return "D";
        return "F";
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nAverage Grade: " + calculateAverage() +
                "\nLetter Grade: " + assignLetterGrade();
    }
}
