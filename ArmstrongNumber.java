public class ArmstrongNumber{
    static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;
        while(num != 0){
            int remainder = num % 10;
            sum += remainder * remainder * remainder;
            num /= 10;
        }
        return temp == sum ? true : false;
    }
    public static void main(String[] args){
        int number = 153;
        if(isArmstrong(number)){
            System.out.println(number + " " + "is an Armstrong Number");
        }else{
        System.out.println(number + " " + "is not an Armstrong Number");
     }
    }
}