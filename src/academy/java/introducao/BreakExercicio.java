package academy.java.introducao;

public class BreakExercicio {
    public static void main(String[] args) {
        float valor = 40500;
        for (int i = 1; i <= valor; i++) {
            double parcelado = valor/i;

            if(parcelado >= 1000){
                System.out.println("Parcela(s): "+i+", Valor: "+parcelado);
            } else {
                break;
            }
        }
    }
}
