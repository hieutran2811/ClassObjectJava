import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.solveEquation();
    }
    double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2)-(4* this.a* this.c);
    }
    public double getRoot1(){
        return (-this.b+Math.sqrt(Math.pow(this.b,2)-(4 * this.a * this.c)))/2/this.a;
    }
    public double getRoot2(){
        return (-this.b-Math.sqrt(Math.pow(this.b,2)-(4 * this.a * this.c)))/2/this.a;
    }
    public void solveEquation(){
        double delta= this.getDiscriminant();
        double x1 = this.getRoot1();
        double x2 = this.getRoot2();
        if (delta<0){
            System.out.println("the equation has no solution");
        }else{
            if (delta==0){

                System.out.println("The equation has a double solution x =  " + x1);
            }else {
                System.out.println("The equation has two solutions x1 = "+x1+" and x2 = "+x2);
            }
        }
    }

}
