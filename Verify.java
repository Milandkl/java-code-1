import java.util.Scanner;
class Verify{

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER AGE");
        System.out.println( "AGE");
        String name= sc.next();
        System.out.println( "Enter your age:");
        int age= sc.nextInt();
        
            if(age>=18){
                System.out.println("you are eligible for voting:");
            }
            else{
                System.out.println("you aren't eligible for voting:");
            }
        

    }
}