public class Elf extends Creature {

    public Elf() {
    }

    public Elf(int health, int damage) {
        super(health, damage);
    }

    public Elf(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void battleCry() {
        System.out.print("Кияяя!!!! ");
    }

    @Override
    public void attack(Creature creature) {
        super.attack(creature);
        System.out.printf("%s %s атака мечом %s %s с уроном %d\n",
                this.getClass().getSimpleName(), this.getName(), creature.getClass().getSimpleName(), creature.getName(), this.getDamage());

    }
}