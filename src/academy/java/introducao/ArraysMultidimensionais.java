package academy.java.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4 meses
        // 31,28,31,30 dias

        int[][] mesesDias = {{31,28},{31,30}};

        for(int[] arr: mesesDias){
            for(int dia: arr){
                System.out.println(dia);
            }
            System.out.println("-----\n");
        }

        String[] users = new String[3];
    }
}
