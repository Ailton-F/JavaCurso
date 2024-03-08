package academy.java.introducao;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        int idade = 18;
        if(idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        } else if (idade >= 18){
            System.out.println("Categoria adulto");
        }
    }
}
