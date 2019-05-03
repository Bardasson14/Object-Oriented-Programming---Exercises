package ex03;


public class Ex03 {

    public static double c2f(double c){
        double f = (double)((9*c + 160)/5);
        return f;
    }
    
    public static double f2c(double f){
        double c = (f-32)*5/9;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(c2f(28) + " F");
        System.out.println(f2c(86) + " C");
    }
    
}
