public class Employee {

    protected String name;
    protected String position;
    protected int age;
    protected int experience;
    protected int salary;
    private static int countOfEmp = 0;


    public Employee() {
        countOfEmp++;
    }

    public Employee(String name, String position, int experience) {
        this.name = name;
        this.position = position;
        this.experience = experience;
        countOfEmp++;
    }

    public Employee(String name, String position, int age, int experience, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        countOfEmp++;
    }


    public void getTextInfo() {
        System.out.println("Сотрудник компании: " + name
                + "\nВозраст: " + age
                + "\nДолжность: " + position
                + "\nСтаж в компании: " + experience
                + "\nЗарплата: " + salary);
    }

    public void getCountOfEmp() {
        System.out.println("Компания имеет " + countOfEmp + " сотрудников");
    }


    //getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}