package lessons.lesson23._02_lambdaSyntax;

import lombok.val;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        //общая запись лямбды () ->{}
        //самая простейшая лямбда не принимает параметров () ->25;

        NoParameterInt lambda1_1 = () -> 25;
        //лямбда может содержать ноль и больше входных параметров

        OneParameterInt lambda1_2 = (String value) -> value + "!";
        TwoParametersInt lambda1_3 = (int v1, int v2) -> v1 + v2;
        VoidInt lambda1_4 = (String val) -> System.out.println(val);

        //we put brackets only when there are no parameters, or more than one
        //types are not necessary
        NoParameterInt lamda2_1 = () -> 25;
        OneParameterInt lambda2_2 = value -> value + "!";
        TwoParametersInt lambda2_3 = ( v2,  v3) -> v2 + v3;
        VoidInt lambda2_4 = val -> System.out.println(val);

        //one string or multiple strings
        NoParameterInt lambda3_1 = () -> {
            System.out.println("Some sentence");
            return 5;
        };

        int result = lambda3_1.doSmth();
        System.out.println(result);






    }
}
