public class Scanner {
    public static void main(String[] args){

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the width of rectangle : ");
        width = scanner.nextDouble();

        System.out.print("Enter the height of rectangle : ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("Area of rectangle : " + area + "cm^2");

       //practice
//        System.out.print("Enter your age: ");
//        //input buffer \n int or double
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your favorite color");
//        String color = scanner.nextLine();
//
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like the color" + color);

//        System.out.print("Enter your name : ");
//
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age : ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("What is your gpa : ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false) :");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name  );
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your gpa is : " + gpa);
//        if(isStudent){
//            System.out.println("You are enrolled as a student");
//        }
//        else{
//            System.out.println("You are NOT enrolled");
//        }



        //good practice to close scanner
        //it leads to unexpected action
        scanner.close();
    }
}
