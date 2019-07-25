package coding.challenge;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(num1<10 || num1>1000 ||num2<10 || num2>1000||num3<10 || num3>1000){
            return false;
        }
        int lastdigitofNum1 = num1%10;
        int lastdigitofNum2 = num2%10;
        int lastdigitofNum3 = num3%10;

        if((lastdigitofNum1==lastdigitofNum2)||(lastdigitofNum1 == lastdigitofNum3)||(lastdigitofNum2==lastdigitofNum3)){
            return true;
        }
        return false;
    }
}
