package academy.java.introducao;

public class EstruturasCondicionaisExercício {
    public static void main(String[] args) {
        double salario = 9000;
        String tax;
        if(salario <= 34712){
            tax = "Tax: 9.72%";
        } else if (salario >= 34713 && salario <= 68507){
            tax = "Tax: 37.35%";
        } else {
            tax = "Tax: 49.50%";
        }

        System.out.println(tax);
    }
}
