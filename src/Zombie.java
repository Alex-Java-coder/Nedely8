public class Zombie extends Monster {

    //это было в задании

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }
}