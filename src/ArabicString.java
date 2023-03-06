class ArabicString extends ParentClass{

    static void calculate(String rawString) throws Exception {

        //если в строке есть не цифры и не +-*/ то ошибка
        if(!rawString.matches("^[0-9\\s+-/\\*]*$")){
            throw new Exception("введены некоректные символы");
        }

        //разбиваем на числа по делителям: +-*/
        String[] splitArray = rawString.split("[+-/\\*]");

        //если получили больше или меньше 2х чисел то ошибка ("формат математической операции не удовлетворяет заданию - два операнда и один оператор")
        if(splitArray.length!=2) throw new Exception("введены некоректные данные");

        //убираем проберы и преобразоввываем в числа
        int a = Integer.parseInt((splitArray[0]).trim());
        int b = Integer.parseInt((splitArray[1]).trim());

        //проверяем что это числа из диапазона 1-10
        if (a<1||a>10||b<1||b>10){
            throw new Exception("число(а) не входят в диапазон \'1-10\'");
        }

        //вызываем метод родительского класса для определения типа операции и получения результата
        int result = getMathResult(rawString, a, b);

        //выводим результат в консоль
        System.out.println(result);


    }//calculate
}//ArabicString
