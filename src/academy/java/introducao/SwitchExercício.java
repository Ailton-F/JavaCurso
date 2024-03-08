package academy.java.introducao;

public class SwitchExercício {
    public static void main(String[] args) {
        int dia = 7;
        char isFds = dia > 1 && dia < 7 ? 'N':'S';

        switch(isFds){
            default:
                System.out.println("???????");
                break;
            case 'S':
                System.out.println("Final de semanaaa!!!");
                break;
            case 'N':
                System.out.println("Aff, dia útil.");
                break;
        }
    }
}
