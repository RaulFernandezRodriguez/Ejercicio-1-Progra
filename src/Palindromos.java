import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.StringUtils;

public class Palindromos {
    public static void main(String[] args){
        Scanner stdinput = new Scanner(System.in);
        String frase = stdinput.nextLine();
        assert frase.length() > 0;
        frase = frase.replaceAll(" +","").toLowerCase();
        StringBuilder fraseInv = new StringBuilder();
        char[] registro = fraseInv.append(frase).reverse().toString().toCharArray();
        boolean palindromo = true;
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
