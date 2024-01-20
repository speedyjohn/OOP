package models;

public class Employee extends Person{
    String position;
    double salary;

    public Employee(){
        super();
        position = "Position";
        salary = 0;
    }

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName(){
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(salary, person.getPaymentAmount());
    }
}