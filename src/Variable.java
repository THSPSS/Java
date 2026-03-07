public class Variable {
    //primitive(stack) Vs Reference(heap)
    // double
    //char
    //Reference : string , array , object
    // 1.declaration : data type and name of variable
    // 2.assignment : such as set age to 20
    public static void main(){
        int year = 2026;
        int quantity = 1;
        int age = 30;

        double price = 19999.99;
        double temperature = -12.5;
        double width = 20.2;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        //camelCase
        //using internally with program
        boolean isStudent = true;
        boolean forSale  = false;
        boolean isOnline = true;

        String name = "seon yeong";
        String food = "pizza";
        String email = "fordummy123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " +name);
        System.out.println("You are" + age + " years old");
        System.out.println("Your grade is : " + grade );
        System.out.println("Your favorite food is : " + food);
        System.out.println("Your email is " + email);

        System.out.println("Your choice is a " + color + " " + year + " " + car );
        System.out.println("The price is : " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }else{
            System.out.println("There is no a " + car + " for sale");
        }

        System.out.println("The year is " + year);
        System.out.println('$'+price);//$19.0
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student!");
        }else{
            System.out.println("You are not a student!");
        }

        //homework post 5 variable
        String myLordAndSavior = "Jesus Christ";
        int yearOfBornAgain = 2025;
        double purity = 100;
        char standOn = 'G';
        boolean isJesusChristAlive = true;
    }

}
