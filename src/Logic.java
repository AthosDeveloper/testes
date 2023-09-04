import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import  static  java.util.Collections. sort;
import  static java.util.Collections.reverse;
public class Logic {

    private Scanner entrada;
    private List<Integer> valores;
    public  Logic(){
        entrada = new Scanner(System.in);
        valores = new ArrayList<>();
    }
DecimalFormat d = new DecimalFormat();

    public void list (){
        System.out.println("informe qual opção você escolhe");
        menu();
        var opcao = entrada.nextInt();
   switch (opcao){
       case  1:
maiorNumero();
  break;
       case 2:
  negativoOuPositivo();
  break;
       case  3:
           vogalOuNao();
  break;
       case 4:
           aprovadoOuNao();
           break;
       case  5:
           decrescente();
           break;
       case  6:
           fatorial();
           break;
       case  7:
           calculoCongustivel();
  break;
   }

}
    private  void maiorNumero(){
        System.out.println("informe a quantidade de números que você deseja inserir");
        var quantidade = entrada.nextInt();
        Integer[] numeros = new Integer[quantidade];
   for (int i = 0; i < numeros.length; i ++){
       System.out.println("informe os valores ");
       int valor = entrada.nextInt();
       valores.add(valor);
sort(valores);

   }
        System.out.println("o maior número é: " + valores.get(valores.size()  - 1));

    }
    private  void negativoOuPositivo(){
        System.out.println("informe o número");
        var valor = entrada.nextInt();
        if (valor >= 0){
            System.out.println("número positivo");
        } else {
            System.out.println("o número é negativo");
        }

    }
    private  void vogalOuNao(){
        System.out.println("informe a letra e eu direi se é vogal ou não:");
        String letra = entrada.next();
        if (eConsoante(letra)){
            System.out.println("a letra é uma consoante");
        } else {
            System.out.println("é vogal");
        }

    }
    private  boolean eConsoante(String info){
        String letra = "";
        String [] letras = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < letras.length; i ++){

            if (!letras.equals(letra)){
                return  false;
            }

        }
        return  true;
    }
    private void aprovadoOuNao(){
        System.out.println("informe a nota ");
   double nota = entrada.nextDouble();
if (nota >= 8){
    System.out.println("você foi aprovado e recebe um a");

} else if (nota >= 6 && nota < 8){
    System.out.println("está de recuperação e sua nota é b");
} else {
    System.out.println("você foi reprovado e sua nota é c");
}

    }
    private  void decrescente(){
valores.add(63);
valores.add(93);
valores.add(8333);
        reverse(valores);
        for (Integer valor: valores){
            System.out.println(valor);
        }
        }
private void fatorial(){
    System.out.println("informe o número");
    double numero = entrada.nextDouble();
    double temp = numero;
    while (numero > 1){
        temp *= (numero - 1);
        numero --;
    }
    System.out.println("o fatorial é: " + temp);
}
private  void calculoCongustivel(){
    System.out.println("informe o valor da distância total percorrida:");
    int distancia = entrada.nextInt();
    System.out.println("informe o valor do congustível consumido:");
    double volume = entrada.nextDouble();
double consumo = (double) distancia / volume;
    System.out.println("a distância percorrida é de " + distancia + "km "  + "e o volume de congustível é de " + volume + " l " + "e o consumo médio de congustível é: " + d.format(consumo) + " l");
}
private void menu(){
    System.out.println("1 ver o maior número");
    System.out.println("2, negativo ou positivo");
    System.out.println("3, vogal ou não");
    System.out.println("4, aprovado ou não ");
    System.out.println("5, decrescente ");
    System.out.println("6, fatorial");
    System.out.println("7, consumo médio de congustível");
}
}

