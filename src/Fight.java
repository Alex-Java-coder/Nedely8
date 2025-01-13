//P.S. Дополнительно можно переопределить в наследниках метод «атака»
// с добавлением описания (например, с какой силой удар и каким оружием).

public class Fight {

    public static void main(String[] args) {

        Ork ork = new Ork("Groot", 200, 17);
        Elf elf = new Elf("Elage", 150, 20);

        fight(ork, elf);

    }

    private static void fight(Creature firstFighter, Creature secondFighter) {


        while (secondFighter.isAlive() && firstFighter.isAlive()) {

            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }

        if (firstFighter.isAlive()) {

            System.out.printf("%s с именем %s мертв\n", secondFighter.getClass().getSimpleName(), secondFighter.getName());
            System.out.printf("%s с именем %s победил", firstFighter.getClass().getSimpleName(), firstFighter.getName());

        } else if (secondFighter.isAlive()) {

            System.out.printf("%s с именем %s мертв\n", firstFighter.getClass().getSimpleName(), firstFighter.getName());
            System.out.printf("%s с именем %s победил", secondFighter.getClass().getSimpleName(), secondFighter.getName());
        } else {

            System.out.println("Все мертвы...");
        }
    }
}