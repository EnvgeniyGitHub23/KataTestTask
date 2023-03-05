class ArabicString {

    static void calculate(String rawString) throws Exception {

        rawString = rawString.trim();
        System.out.println(   rawString.matches("^[0-9\\s+-/\\*]*$"));
       // System.out.println( rawString.matches("^[*/]*$"));
       // input.matches("^[+-0-9]+$");
        if(!rawString.matches("^[0-9\\s+-/\\*]*$")){
            throw new Exception("введены некоректные символы");
        }

        String[] splitArray = rawString.split("[+-/\\*]");
        if(splitArray.length!=2) throw new Exception("введены некоректные данные");
        int a = Integer.parseInt(splitArray[0]);
        int b = Integer.parseInt(splitArray[1]);
        System.out.println(a);
        System.out.println(b);

        //!!!!!!!!!!!!!!!! добавить проверку 0-10!!!!!!!!!!!!!!!!!!
        
        if(rawString.contains("+")){
            System.out.println(a+b);
        } else if (rawString.contains("-")) {
            System.out.println(a-b);
        } else if (rawString.contains("*")) {
            System.out.println(a*b);
        } else if (rawString.contains("/")) {
            System.out.println(a/b);
        }


    }//calculate



}//ArabicString
