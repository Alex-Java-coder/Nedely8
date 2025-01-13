public abstract class Monster {

    //создаем с нуля класс Monster

    String name;
    int damage;

    //конструктор создаём, чтобы вводимые name и damage были доступны
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void growl() {
        System.out.println(" " + name + " growled");
    }

    public void attack() {
        System.out.println("Monster " + name + " was created");
        System.out.println("Monster " + name + " attacked with damage " + damage);
    }
}
