package ex02;

public class Ex02 {

    public static String iniciaisNome(String s){
        String iniciaisNome = "";
        iniciaisNome += s.charAt(0);
 
        for (int i=1;i<s.length()-1;i++){
            if ((s.charAt(i)==  ' ') && (s.charAt(i+1) !=  ' '))
                iniciaisNome += s.charAt(i+1);
        }
        return iniciaisNome.toUpperCase();
    }
    
    public static void main(String[] args) {
        System.out.println(iniciaisNome("carl johnson"));
        
    }
    
}
