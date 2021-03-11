package mySelfStudy;

public class BinaryTests01 {
    public static String binary(int number){
        String binary = "";

        if(number==0) {
            {return "Do not enter '0'";}
        }
        else{
            while(number!=1){
                binary += number%2+"";
                number = number/2;
            }

            return reverseStr(binary+"1");
        }
    }

    public static String reverseStr(String s) {
        return (new StringBuffer(s)).reverse().toString();
    }

    public static void main(String[] args) {
        int number = 1011;

        System.out.printf("%d Changed -> %s",number, binary(number));
    }
}
