import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader{
    public static void main(String[] args){
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        int sumSalary = 0;

        for (int i = 1; matcher.find(); i++){
            System.out.printf("Зарплата " + i + ": %s\n", matcher.group());
            int salary = Integer.parseInt(matcher.group());
            sumSalary = sumSalary + salary;
        }
        System.out.println("Сумма зарплат: " + sumSalary);
    }
}