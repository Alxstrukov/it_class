package lessons.lesson23._03_lamda_vars;

public class Main {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        OperateInt operate = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(operate.operate());
        //переменные объявленные выше метода в котором имеется лямбда видны и их можно изменить в лямбде


    }
}
