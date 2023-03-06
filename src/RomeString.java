import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RomeString extends ParentClass {

    static void calculate(String rawString) throws Exception {

        //проверяем что в строке есть только разрешенные символы
        if (!rawString.matches("^[XVI\\s+-/\\*]*$")) {
            throw new Exception("введены некоректные символы");
        }

        //разбиваем на числа по делителям: +-*/
        String[] splitArray = rawString.split("[+-/\\*]");

        //если получили больше или меньше 2х чисел то ошибка ("формат математической операции не удовлетворяет заданию - два операнда и один оператор")
        if(splitArray.length!=2) throw new Exception("введены некоректные данные");

        //убираем проберы
        splitArray[0] = splitArray[0].trim();
        splitArray[1] = splitArray[1].trim();

        //Преобразуем строки в цифры  в диапазоне 1-10
        int a=0;
        int b=0;
        List<String> romeDigitsInputList = new ArrayList<>();
        Collections.addAll(romeDigitsInputList,"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

        for(int i =1; i<=10; i++){
            if ((splitArray[0]).equals(romeDigitsInputList.get(i))) a=i;
            if ((splitArray[1]).equals(romeDigitsInputList.get(i))) b=i;
        }

        //Проверяем что получилось число от 1 до 10 (a и b проинициализировались не нулями)
        if(a==0 || b==0){
            throw new Exception("число(а) не входят в диапазон \'1-10\'");
        }

        //вызываем метод родительского класса для определения типа операции и получения результата
        int result = getMathResult(rawString, a, b);

        //проверяем что ответ >=1
        if(result<1){
            throw new Exception("результат меньше 1 (I)");
        }

        //переводим результат в римские цифры
        String[] leters = new String[] {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] digits = new int[]       {100,  90,   50,  40,  10,   9,    5,   4,    1  };

        StringBuilder sb = new StringBuilder();
        int index = 0;

        while(index < leters.length)
        {
            while(result >= digits[index])
            {
                int count  = result / digits[index];
                result = result % digits[index];

                for(int i=0; i<count; i++){  //повторяем сивол требуемое кол-во раз
                    sb.append(leters[index]);
                }//for
            }//while
            index++;
        }//while

        //выводим результат в консоль
        System.out.println(sb);

    }//calculate
}










