import java.util.Scanner;
class BMI{
    public static double BMICaluclate(double height,double weight){
        double heightinm=height/100;
        return weight/(heightinm*heightinm);
    }
    public static String getBMIstatus(double bmi){
            if (bmi<=18.4){
                return "Underweight";
            }else if(bmi<24.9){
                return "Normal";
            }else if(bmi<39.9){
                return "Over weight";
            }else{
                return "Obese";
            }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double[][] bmidata=new double[10][3];
        String[] bmistatus=new String[10];
        for (int i=0;i<3;i++){
            System.out.print("Enter the weight of the person "+(i+1)+" :");
            bmidata[i][0]=input.nextDouble();
            System.out.print("Enter the height of the person "+(i+1)+" :");
            bmidata[i][1]=input.nextDouble();
            bmidata[i][2]=BMICaluclate(bmidata[i][0], bmidata[i][1]);
            bmistatus[i]=getBMIstatus(bmidata[i][2]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",(i + 1), bmidata[i][0], bmidata[i][1], bmidata[i][2], bmistatus[i]);
        }


    }
}
