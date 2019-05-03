package ex01;

public class Ex01 {
    
    public static int checkVogal(String s){
        int v = 0;
        String sCopy = s.toLowerCase();
        for (int i=0;i<sCopy.length();i++){
            if (sCopy.charAt(i)=='a'||sCopy.charAt(i)=='e'||sCopy.charAt(i)=='i'||sCopy.charAt(i)=='o'||sCopy.charAt(i)=='u'){
                v++;
            }
        }
        return v;
    }
    
    public static int digitos(String s){
        if (s.equals("")) return 0;
        return (Integer.toString(s.trim().length())).length();
    }
    
    public static boolean checkPalindromo(String s){
        for (int i=0; i<=(s.trim().length()/2);i++){
            if ((s.charAt(i))!=((s.charAt(s.length()-i-1))))
                return false;
        }
        return true;
    }
    
    public static void stringInfo(String s){
        System.out.println("Comprimento da string: " + s.length());
        System.out.println(s.toUpperCase());
        System.out.println("Número de vogais: " + checkVogal(s));
        if (s.substring(0, 2).toUpperCase() == "UNI") System.out.println("Começa com UNI");
        else System.out.println("Não começa com UNI");
        if (((s.substring(s.length()-2, s.length())).toUpperCase())=="RIO") System.out.println("Termina com RIO");
        else System.out.println("Não termina com RIO");
        System.out.println(digitos(s));
        System.out.println("É palíndormo? " + checkPalindromo(s));
        
        
    }
    
    public static void main(String[] args) {
        stringInfo("uva");
        
    }
    
}
