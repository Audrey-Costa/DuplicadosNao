import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Quantos elementos tem o seu primeiro array?");
        int array1Length = reader.nextInt();

        String[] array1 = new String[array1Length];

        for (int i = 0; i < array1Length; i++){
            array1[i] = reader.next();
        }

        System.out.print("Quantos elementos tem o seu segundo array?");
        int array2Length = reader.nextInt();

        String[] array2 = new String[array2Length];

        for (int i = 0; i < array2Length; i++){
            array2[i] = reader.next();
        }

        System.out.println("Elementos repetidos:");
        for (int i = 0; i < array1Length; i++){
            for(int j = 0; j < array2Length; j++){
                if (Objects.equals(array1[i], array2[j])){
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
    }
}
