package models;

public class Student extends Person {
    double gpa;

    public Student(){
        super();
        gpa = 0;
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.0 : 0;
    }

    @Override public int compareTo(Person person){
        return Double.compare(getPaymentAmount(), person.getPaymentAmount());
    }
}