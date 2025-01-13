public class Ork extends Creature{

    public Ork() {
    }

    public Ork(int health, int damage) {
        super(health, damage);
    }

    public Ork(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void battleCry() {
        System.out.print("Booom!!!! ");
    }

    @Override
    public void attack(Creature creature) {
        super.attack(creature);
        System.out.printf("%s %s атака дубинкой %s %s с уроном %d\n",
                this.getClass().getSimpleName(), this.getName(), creature.getClass().getSimpleName(), creature.getName(), this.getDamage());

    }
}