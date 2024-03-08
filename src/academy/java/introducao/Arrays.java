package academy.java.introducao;

public class Arrays {
    public static void main(String[] args) {
        // pt 1
        int[] idades = new int[3];
        idades[0] = 23;
        idades[1] = 14;
        idades[2] = 16;

        //pt 2
        // valores padrão
        // byte, double, float, short, long, int  = 0
        // char = '\u0000'
        // Boolean
        // String (references. ou seja referências a uma classe) = null

        //pt 3
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        //pt 4
        String[] nomes = {"Ailton", "Karol"};

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
