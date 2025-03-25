import java.util.Scanner;
class BMI{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the weight of the person: ");
        double weight=inp.nextDouble();
        System.out.print("Enter the height of the person: ");
        double height=inp.nextDouble();
        double con_height=height/100;
        double bmi=weight/(con_height*con_height);
        if (bmi<=18.4){
            System.out.println("Underweight");
        }else if(bmi<18.5 && bmi<24.9){
            System.out.println("Normal");
        }else if (bmi<25.0 && bmi>39.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
