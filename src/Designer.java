public class Designer extends Employee {


    private String designProgram;

    //constructors
    public Designer() {

    }

    public Designer(String name, String designProgram, int experience) {
        super.name = name;
        this.designProgram = designProgram;
        super.experience = experience;
    }

    public Designer(String name, String position, int age, int experience, int salary, String designProgram) {
        super(name, position, age, experience, salary);
        this.designProgram = designProgram;
    }

    public void getFullTextInfo() {
        super.getTextInfo();
        System.out.println("Работает в программе : " + designProgram + "\n");
    }

    //getters
    public String getDesignProgram() {
        return designProgram;
    }

    //setters
    public void setDesignProgram(String designProgram) {
        this.designProgram = designProgram;
    }
}