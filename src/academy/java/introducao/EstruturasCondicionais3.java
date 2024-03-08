package academy.java.introducao;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 10000;
        String mensagemDoar = "Eu vou doar 500 mangos";
        String mensagemNaoDoar = "Não vou daoar NADA";
        String resultado = salario > 500 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
