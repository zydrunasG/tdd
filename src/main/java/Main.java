import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int action = -1;
        Scanner keyboard = new Scanner(System.in);
        double a;
        double b;

        System.out.println("Įveskite a ir b ");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        Calculator calculator = new Calculator(a,b);
        System.out.println("Įveskite r ");
        double r = keyboard.nextDouble();
        SphereCalculate sphereCalculate = new SphereCalculate(r);
        System.out.println();
        while (action != 0)
        {

            System.out.println("\n Meniu ");
            System.out.println("1: a + b");
            System.out.println("2: a - b");
            System.out.println("3: a * b");
            System.out.println("4: a / b");
            System.out.println("5: kuris didesnis");
            System.out.println("6: Surasti plotą sferos");
            System.out.println("7: Surasti tūrį sferos");
            System.out.println("0: exit");


            action = keyboard.nextInt();

            switch (action){
                case 0:
                    action = 0;
                    break;
                case 1:
                    System.out.println(calculator.calculateSum());
                    break;
                case 2:
                    System.out.println(calculator.calculateSubtract());
                    break;
                case 3:
                    System.out.println(calculator.calculateMultiply());
                    break;
                case 4:
                    System.out.println( calculator.calculateDivision());
                    break;
                case 5:
                    System.out.println(calculator.findBiggestNumber());
                    break;
                case 6:
                    System.out.println(sphereCalculate.calculateArea());
                    break;
                case 7:
                    System.out.println(sphereCalculate.calculateVolume());
                    break;
                    default:
                        System.out.println("Tokio pasirinkimo nėra");
            }

        }
    }
}
