import java.util.Random;

/**
 * 
 * Permutate numbers between 0 and n
 * 
 * @author <J. Han>
 * 
 * @date <4/20/2005>
 * 
 */

public class PermutationGenerator {

    /**
     * 
     * Field
     * 
     */

    private int permut[];

    /**
     * 
     * Constructor
     * 
     * @param int the number of numbers in the permutations
     * 
     */

    public PermutationGenerator(int n) {

        permut = new int[n];

    }

    /**
     * 
     * Generate a permutation
     * 
     * @return int[] the permutation of numbers 1 to n
     * 
     */

    public int[] nextPermutation() {

        // Create a random generator

        Random generator = new Random();

        int n = permut.length;

        for (int i = 0; i < n; i++) {

            while (true) {

                // Generate a random number between 1 and n

                int nextRandomNumber =

                        generator.nextInt(n) + 1;

                boolean next = true;

                for (int j = 0; j < i; j++)

                    if (permut[j] == nextRandomNumber) {

                        next = false;

                        break;

                    }

                if (next) {

                    permut[i] = nextRandomNumber;

                    break;

                }

            }

        }

        return permut;

    }

}
