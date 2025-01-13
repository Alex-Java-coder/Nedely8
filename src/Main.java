public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.myMethod();

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
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();

        System.out.println(" ");
    }
}