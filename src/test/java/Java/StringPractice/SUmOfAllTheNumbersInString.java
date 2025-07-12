package Java.StringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SUmOfAllTheNumbersInString {
    public static void sumofdigits(String str) {
        int esum = 0;
        int osum = 0;
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        List<Integer> evenN= new ArrayList<>();
        List<Integer> oddN= new ArrayList<>();
        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            if (num % 2 == 0) {
                evenN.add(num);
                esum += num;
            }
            else {
                oddN.add(num);
                osum += num;
            }
            //sum+=num;
            //System.out.println("Number is - "+matcher.group());

        }
        for(int num : evenN){
            System.out.println("Even number - "+num);
        }
        for(int num : oddN){
            System.out.println("Odd number - "+num);
        }
        System.out.println("Even sum : " + esum);
        System.out.println("Odd sum : " + osum);

    }

    public static void main(String[] args) {
        String str = "12r34r23r67yu87ij90ok77hu";
        sumofdigits(str);

    }
}
