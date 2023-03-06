public abstract class ParentClass {

    //общий метод который определяет тип операции и возвращает результат
    static int getMathResult(String rawString, int a, int b){

        if(rawString.contains("+")){
            return (a+b);
        } else if (rawString.contains("-")) {
            return (a-b);
        } else if (rawString.contains("*")) {
            return (a*b);
        } else if (rawString.contains("/")) {
            return (a/b);
        }

        return 0; //можно убрать, это избыточная проверка
    }
}
