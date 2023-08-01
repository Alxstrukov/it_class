package lessons.lesson23._03_lamda_vars;

public class Main1 {
    public static void main(String[] args) {

        final int x = 10;
        final int y = 20;
        //локальные переменные уровня метода мы можем использовать в лямбда только если они final
        //переменная final оторая используется влябд не может быть изменена вне ее
        OperateInt operate = () -> x + y;
        System.out.println(operate.operate());

    }
}
