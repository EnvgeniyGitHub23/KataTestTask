import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Start>
        System.out.println("Введите строку:");
        String rawString;
        while (!(rawString = scanner.nextLine()).equals("!")) {
            // rawString = scanner.nextLine();
            //System.out.println(checkIsArabic(rawString));
           // System.out.println(checkIsRome(rawString));


        boolean isArabic = checkIsArabic(rawString);
        boolean isRome = checkIsRome(rawString);

        //если строка не содержит чисел и римских символов ИЛИ содержит числа и римские символы, то ОШИБКА
        if ((isRome && isArabic) || ((!isRome && !isArabic))) {
            throw new Exception("пустая строка или содержит арабские и римские цифры одновременно");
        } else if (isArabic) {  //иначе вызываем соответсвующий метод
            //arabic
            ArabicString.calculate(rawString);
        } else {
            //rome
        }


    }//while









    }//main


    //проверка на наличие арабских цифр
    private static boolean checkIsArabic(String str){
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if((c >= '0')&&(c <= '9')) return true;
        }
        return false;
    }//checkIsArabic

    //проверка на наличие арабских цифр
    private static boolean checkIsRome(String str){
        return str.matches(".*[XVI].*");
    }//checkIsRome


}