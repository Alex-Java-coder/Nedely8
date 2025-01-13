import anotherfirm.*;

public class Main {
    public static void main(String[] args) {

        //временно отключено по заданию 6.4.1.
        //SubClass obj = new SubClass();
        //obj.myMethod();

        System.out.println(" ");

        // Пример использования String (неизменяемый)
        String str = "Hello1";
        str += " World1"; // Создается новый объект
        System.out.println("String: " + str);

        // Пример использования StringBuffer (изменяемый и потокобезопасный)
        StringBuffer stringBuffer = new StringBuffer("Hello2");
        stringBuffer.append(" World2"); // Изменяется существующий объект
        System.out.println("StringBuffer: " + stringBuffer);

        // Пример использования StringBuilder (изменяемый и не потокобезопасный)
        StringBuilder stringBuilder = new StringBuilder("Hello3");
        stringBuilder.append(" World3"); // Изменяется существующий объект
        System.out.println("StringBuilder: " + stringBuilder);

        System.out.println(" ");

        //Задание 6.2.4.
        // мешает заданию 6.4.5.
        /*
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();*/

        System.out.println(" ");

        //Задание 6.3.1.

        Alphabet alphabet = new Alphabet();
        alphabet.setW(5);
        System.out.println(alphabet.getSum());
        alphabet.setA(5);
        alphabet.setS(7);
        alphabet.setD(7);
        System.out.println(alphabet.getSum());

        System.out.println(" ");

        //Задание 6.3.3.
        Secret secret = new Secret();
        System.out.println(secret.getSecret());

        //У меня работает, но решение такое
        /*
        import anotherfirm.*;

        public class HackIt {

            public static void main(String[] args) {
                (new Hack()).hack();
            }
        }

        class Hack extends Secret {
            public void hack() {
                getSecret();
            }
        }
        */

        System.out.println(" ");

        //задание 6.4.1.
        SubClass s = new SubClass(10, 12);
        System.out.println(s.a);
        //задание 6.4.2.
        System.out.println(s.add(10));

        System.out.println(" ");

        //Задание 6.4.5.
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);

        System.out.println(" ");

        //задание 6.4.7.
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();

        System.out.println(" ");

        //дополнительное задание
        Rifleman rifleman = new Rifleman("Пехотинец");
        rifleman.attack();
        rifleman.move();
        rifleman.sound();

        Knight knight = new Knight("Рыцарь");
        knight.feed();
        knight.attack();
        knight.move();
        knight.sound();

        Soldier soldier = new Soldier("Мушкетер");
        soldier.move();
        soldier.attack();
        soldier.sound();

        Barracks barracks = new Barracks();
        barracks.add(new Soldier("Пехотинец"));
        barracks.add(new Knight("Рыцарь"));
        barracks.add(new Rifleman("Мушкетер"));
        barracks.add(new Rifleman("Мушкетер2"));
        barracks.visit();

        System.out.println(" ");

        //вот это битва
        Fight fight = new Fight();
        fight.main(args);

        System.out.println("\n");

        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Designer designer = new Designer();
        Employee empProg = new Programmer("Meow Moore", "Программист", 30, 5,
                100_000, "Java");
        Employee empDes = new Designer("Super Mors", "Дизайнер", 25, 3,
                70_000, "Adobe Illustrator");
        empProg.getTextInfo();
        System.out.println();
        empDes.getTextInfo();
        employee.getCountOfEmp();

    }
}