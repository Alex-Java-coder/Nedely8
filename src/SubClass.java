public class SubClass extends SuperClass {
    int num = 77;

    // Метод display() подкласса
    public void display() {
        System.out.println("Это метод display(1) подкласса");
    }

    public void myMethod() {
        // Вызываем метод display() подкласса
        this.display();

        // Вызываем метод display() суперкласса
        super.display();

        // Выводим значение переменной num подкласса
        System.out.println("Значение переменной num в подклассе: " + this.num);

        // Выводим значение переменной num суперкласса
        System.out.println("Значение переменной num в суперклассе: " + super.num);
    }

    /*
    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.myMethod();
    }
    */

    //новое задание 6.4.1.
    SubClass(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int add(int v) {
        return super.add(v) + a;
    }

//отключено и перенесено в Main
//    public static void main(String args[]) {
//        SubClass s = new SubClass(10, 12);
//        System.out.println(s.a);
//    }
}