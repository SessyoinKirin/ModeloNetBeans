package rot_13;

import java.util.*;
        
public class ROT_13 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto = "", cara = "abcdefghijklmnopqrstuvwxyz", coroa = "nopqrstuvwxyzabcdefghijklm", saida = "";
        boolean encontrou = false;
        System.out.print("Digite a senha que deseja criptografiar: ");
        texto = ler.nextLine();
        
        for(int i = 0; i<texto.length(); i++){
            encontrou = false;
            for(int j = 0; !encontrou && j<cara.length(); j++){
                if(texto.charAt(i) == cara.charAt(j)){
                    encontrou = true;
                    saida += coroa.charAt(j);
                }
            }
            if(!encontrou){
                saida += texto.charAt(i);
            }
        }
        System.out.println("Saida:"+saida);
    }
}
