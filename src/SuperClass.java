public class SuperClass {
    int num = 88;

    // Метод display() суперкласса
    public void display() {
        System.out.println("Это метод display(2) суперкласса");
    }

    //новое задание 6.4.1.
    public int a;
    public int b;

    SuperClass(int a) {
        this.a = 15;
        this.b = 33;
    }

    public int add(int v) {
        this.a += v;
        return a;
    }
}