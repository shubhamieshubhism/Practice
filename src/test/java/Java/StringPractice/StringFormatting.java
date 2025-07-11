package Java.StringPractice;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatting {

    public static void main(String[] args) {
        String name = "shubham";
        int age= 10;
        String city= "Wardha";
        String formattedString = String.format("My name is %s, My age is %d years old and i live in %s.",name,age,city);
        System.out.println(formattedString);
    }
}

class StringValueOF{
    public static void main(String[] args) {
        int num = 1000;
        String num1="1000";
        String str = String.valueOf(num);
        String str1= String.valueOf(num1);
        System.out.println(str1);

    }
}
class RegEXAddition{
    public static void main(String[] args) {
        String text = "java is 1237587578863586timego12Andhif44mi9";
        //String regex = "\\d{2}";//for adding single number
        String regex = "\\b\\d{1,2}\\b";
        //String regex = "\\d+"; //for adding more than single number.
        int sum=0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
            sum+=Integer.parseInt(matcher.group());
        }
        System.out.println("The sum : "+sum);
    }
}

class LookAheadNLookBehind{
    public static void main(String[] args) {
        String input = "123java";
        //String regex = "\\d+(?=\\D)"; //lookAhead
        String regex = "\\d+(!?\\d)"; //lookBehind
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

class TRYNCATCHERROR{
    public static void main(String[] args) {
        try{
            System.out.println("Try block");
            int num = 10/0;
        }catch(ArithmeticException e){

        }
        finally {
            System.out.println("Final block");

        }
    }
}
class MultipleCatchBlock{
    public static void main(String[] args) {
        try{
            int [] arr = new int[5];
            arr[6]=10 ;
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("exception : "+ e.getMessage());
        }/*catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }*/
    }
}