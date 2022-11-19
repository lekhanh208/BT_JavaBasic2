package JAVABASICBT2;

public class Calculator {

    public int sumInt(int a,int b){
        return a + b;
    }
    public double multiFloat(double x, double y){
        return x*y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sumInt(11,12));
        System.out.println(cal.multiFloat(11.2 ,5.3));
    }

}
