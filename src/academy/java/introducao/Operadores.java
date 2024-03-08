package academy.java.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2 + numero1);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDez = 10 != 20;
        System.out.println(isDez);

        // && || !
        boolean verdadeiro = false;
        String name = !verdadeiro ? "1":"2";

        System.out.println(name);

        // = += -= *= /= %= ++ --
        int numero = 2;
        numero *= numero;
        int contador = 0;

        System.out.println(numero);
        System.out.println(contador++);
        System.out.println(++contador);
    }
}
