/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa1;

/**
 *
 * @author Lacerda
 */
public class Formata {
    
    public String FormataRomano(int valor){
        String valorFormatado = "";
        String v = Integer.toString(valor);
        if(valor < 4000 && valor > 0){
            System.out.println("v.length "+v.length());
            int x = 0;
            for (int i = v.length()-1; i > -1; i--) {
                System.out.println("v[i]: "+v.toCharArray()[x]+", i: "+i);
                valorFormatado = valorFormatado + FormataRomano2(v.toCharArray()[x],i);
                x++;
            }
        }else{
            valorFormatado = "VALOR MAIOR QUE 3999";
        }
        return valorFormatado;
    }
    
    public String FormataRomano2(char z, int x){
        String valorFormatado = "";
        String i = "" + z;
        if(x == 0){
            valorFormatado = FormataRomanoUnidade(i);
        }else if(x == 1){
            valorFormatado = FormataRomanoDezena(i);
        }else if(x == 2){
            valorFormatado = FormataRomanoCentena(i);
        }else if(x == 3){
            valorFormatado = FormataRomanoMilhar(i);
        }
        return valorFormatado;
    }

    public String FormataRomanoMilhar(String valor){
        System.out.println("ENTROU NO METODO FORMATAROMANOMILHAR");
        String valorFormatado ="";
        System.out.println("FORMATAROMANOMILHAR valor: "+valor);
        
        if(valor.equals("1")){
            valorFormatado = "M";
        }else if(valor.equals("2")){
            valorFormatado = "MM";
        }else if(valor.equals("3")){
            valorFormatado = "MMM";
        }
        System.out.println("valorFormatado: "+valorFormatado);
        
        return valorFormatado;        
    }    
    
    public String FormataRomanoCentena(String valor){
        System.out.println("ENTROU NO METODO FORMATAROMANOCENTENA");
        String valorFormatado ="";
        System.out.println("FORMATAROMANOCENTENA valor: "+valor);
        if(valor.equals("1")){
            valorFormatado = "C";
        }else if(valor.equals("2")){
            valorFormatado = "CC";
        }else if(valor.equals("3")){
            valorFormatado = "CCC";
        }else if(valor.equals("4")){
            valorFormatado = "CD";
        }else if(valor.equals("5")){
            valorFormatado = "D";
        }else if(valor.equals("6")){
            valorFormatado = "DC";
        }else if(valor.equals("7")){
            valorFormatado = "DCC";
        }else if(valor.equals("8")){
            valorFormatado = "DCCC";
        }else if(valor.equals("9")){
            valorFormatado = "CM";
        }else if(valor.equals("0")){
            valorFormatado = "";
        }
        System.out.println("valorFormatado: "+valorFormatado);
        return valorFormatado;        
    }
    
    public String FormataRomanoDezena(String valor){
        System.out.println("ENTROU NO METODO FORMATAROMANODEZENA");
        String valorFormatado ="";
        System.out.println("FORMATAROMANODEZENA valor: "+valor);
        
        if(valor.equals("1")){
            valorFormatado = "X";
        }else if(valor.equals("2")){
            valorFormatado = "XX";
        }else if(valor.equals("3")){
            valorFormatado = "XXX";
        }else if(valor.equals("4")){
            valorFormatado = "XL";
        }else if(valor.equals("5")){
            valorFormatado = "L";
        }else if(valor.equals("6")){
            valorFormatado = "LX";
        }else if(valor.equals("7")){
            valorFormatado = "LXX";
        }else if(valor.equals("8")){
            valorFormatado = "LXXX";
        }else if(valor.equals("9")){
            valorFormatado = "XC";
        }else if(valor.equals("0")){
            valorFormatado = "";
        }
        System.out.println("valorFormatado: "+valorFormatado);
        
        return valorFormatado;        
    }    
    public String FormataRomanoUnidade(String valor){
        System.out.println("ENTROU NO METODO FORMATAROMANOUNIDADE");
        String valorFormatado ="";
        System.out.println("FORMATAROMANOUNIDADE valor: "+valor);
        
        if(valor.equals("1")){
            valorFormatado = "I";
        }else if(valor.equals("2")){
            valorFormatado = "II";
        }else if(valor.equals("3")){
            valorFormatado = "III";
        }else if(valor.equals("4")){
            valorFormatado = "IV";
        }else if(valor.equals("5")){
            valorFormatado = "V";
        }else if(valor.equals("6")){
            valorFormatado = "VI";
        }else if(valor.equals("7")){
            valorFormatado = "VII";
        }else if(valor.equals("8")){
            valorFormatado = "VIII";
        }else if(valor.equals("9")){
            valorFormatado = "IX";
        }else if(valor.equals("0")){
            valorFormatado = "";
        }
        System.out.println("valorFormatado: "+valorFormatado);
        
        return valorFormatado;        
    }
}
