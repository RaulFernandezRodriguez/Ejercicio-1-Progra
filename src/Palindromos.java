import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args){
        Scanner stdinput = new Scanner(System.in);
        String frase = stdinput.nextLine();
        frase = frase.replaceAll(" +","");
        frase.toLowerCase();
        char[] registro = new char[frase.length()];
        boolean palindromo = true;
        for(int i = 0, j = frase.length() -1; i < registro.length; i++, j--){
            registro[i] = frase.charAt(j);
        }
        for(int x = 0; x < registro.length; x++){
            if(registro[x] != frase.charAt(x)){
                palindromo = false;
            }
        }
        if(palindromo == true){
            System.out.println("La frase es palindroma");
        }else {
            System.out.println("La frase NO es palindroma");
        }
    }
}
