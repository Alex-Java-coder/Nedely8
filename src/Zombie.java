public class Zombie extends Monster {

    /*
    //для задания 6.4.5.
    public static String scream = "Raaaauuughhhh";

    //это было в задании

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
//    мешает заданию 6.4.5.
//    @Override
//    public void growl() {
//        System.out.print("Raaaauuughhhh");
//        super.growl();
//    }

    @Override
    public void attack() {
        super.attack();
        //убрано мешает заданию 6.4.5.
        //growl();
    }

    //ниже для задания 6.4.5.
    @Override
    public void growl(){
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud){
        if (!loud) {
            growl();
        }
        else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }
    */

    //задание 6.4.7.


    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }


}