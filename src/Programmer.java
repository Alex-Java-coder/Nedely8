public class Programmer extends Employee {


    private String language;

    //constructors
    public Programmer() {

    }

    public Programmer(String name, String language, int experience) {
        super.name = name;
        this.language = language;
        super.experience = experience;
    }

    public Programmer(String name, String position, int age, int experience, int salary, String language) {
        super(name, position, age, experience, salary);
        this.language = language;
    }

    @Override
    public void getTextInfo() {
        super.getTextInfo();
        System.out.println("Язык программирования : " + language + "\n");
    }

    //getters
    public String getLanguage() {
        return language;
    }

    //setters
    public void setLanguage(String language) {
        this.language = language;
    }
}