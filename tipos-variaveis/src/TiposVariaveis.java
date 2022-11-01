public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500;

       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 =  (short) numeroNormal;    

       int numero = 5;
       numero = 10;
       System.out.println(numero);

       double VALOR_DE_PI = 3.14;
       VALOR_DE_PI = 3.15;
       System.out.println(VALOR_DE_PI);

       int numero2 = 5;
       numero2 = - numero2;
       numero2 = - numero2;
       System.out.println(numero2);

       int numero3 = 5;
       System.out.println(numero3 ++);

       boolean verdadeiro = true;
       System.out.println(! verdadeiro);

       int a, b;
       a = 5;
       b = 6;
       
       String resultado = (a==b) ? "verdadeiro" : "false";
       System.out.println("O resultado é: " + resultado);

       int resultado2 = (a==b) ? 1 : 0;
       System.out.println(resultado2);

       int numero01 = 1;
       int numero02 = 2;

       boolean simNao = numero01 == numero02;
       System.out.println("Sim ou não: " + simNao);

       String nome1 = "JAVA";
       String nome2 = "JAVA";
       
       System.out.println(nome1 == nome2); //true
       String nome3 = new String("JAVA");
       
       System.out.println(nome1 == nome3); //false
       String nome4 = nome3;
       System.out.println(nome3 == nome4); //true
       
       //equals na parada
       System.out.println(nome1.equals(nome2)); //??
       System.out.println(nome2.equals(nome3)); //??
       System.out.println(nome3.equals(nome4)); //??



    }
}
