import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class CoppyArrayTest2 {
    public static void main(String[] args) {
        double rand = Math.random();


            int[] tab1 = new int[10];

            for (int i = 0; i < tab1.length; i++) {

                tab1[i] = (int) (i * rand);

            }
            int[] tab2 = new int[10];

            System.arraycopy(tab1, 0, tab2, 0, 10);
                System.out.println(Arrays.toString(tab1));
                System.out.println(Arrays.toString(tab2));
            }
        }




