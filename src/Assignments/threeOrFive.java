package Assignments;

public class threeOrFive {

    public static void main(String[] args) {


        System.out.println(threeOrFive(3));  //true
        System.out.println(threeOrFive(10)); //true
        System.out.println(threeOrFive(8));  //false
        System.out.println(threeOrFive(18)); //true
        System.out.println(threeOrFive(101));//false

    }




    public static boolean threeOrFive(int n){
        //Implementation here


        if(n % 3 == 0 || n % 5 == 0){

            return true;

        }else{

            return false;


        }

    }
}











