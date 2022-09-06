public class palindromo {
    public static void main(String[] args) {
        String cadena = "";
        boolean isPalindromo = true;
        for(int i=0;i<cadena.length()/2;i++){
            if(cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)){
                isPalindromo = false;
                break;
            }
        }
        if(isPalindromo){
            System.out.println("La palabra es palindromo");
        }else{
            System.out.println("La palabra no es palindromo");
        }
    }
}