import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<Integer,String> num ;
        num = num1 -> {
            if (num1 == 0){
                return "Ноль";
            } else if (num1>0) {
                return "Положительное число";
            } else {
                return "Отрицательное число";
            }
        };
        String str = num.apply(-78);
        System.out.println(str);


    }
}
