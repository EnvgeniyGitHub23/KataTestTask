import java.util.Scanner;

public class Main {
     static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Start>
        //System.out.println("Введите строку:");
        String rawString = scanner.nextLine();

        boolean isArabic = checkIsArabic(rawString);
        boolean isRome = checkIsRome(rawString);

        //если строка не содержит арабских  и римских  ИЛИ содержит арабские и римские символы, то ОШИБКА
        if ((!isRome && !isArabic) || ((isRome && isArabic))) {
            throw new Exception("пустая строка или содержит арабские и римские цифры одновременно");

            //иначе вызываем соответсвующий метод
        } else if (isArabic) {
            ArabicString.calculate(rawString);
        } else {
            RomeString.calculate(rawString);
        }
    }//main


    //метод проверяет на наличие арабских цифр
    private static boolean checkIsArabic(String str){
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if((c >= '0')&&(c <= '9')) return true;
        }
        return false;
    }

    //метод проверяет  на наличие римских цифр
    private static boolean checkIsRome(String str){
        return str.matches(".*[XVI].*");
    }//checkIsRome


}//MainClass