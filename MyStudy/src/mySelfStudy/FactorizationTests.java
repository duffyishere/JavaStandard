package mySelfStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorizationTests {

    public static boolean isFactorization(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0)
                return false;
        }
        return true;
    }

    public List Factorization(int number){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int j=0; j<100; j++){
            for(int i=2; i<=number; i++){
                if(isFactorization(i)){
                    if(number%i == 0){
                        arrayList.add(i);
                        number = number/i;
                    }
                }
            }
        }

        return arrayList;
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number :");

        return sc.nextInt();
    }

    public static void main(String[] args) {
        FactorizationTests factorizationTests = new FactorizationTests();
        int number = input();

        System.out.println(factorizationTests.Factorization(number));
    }
}
