
/**
 * 
 * PermutationGenerator test
 * 
 */

public class PermutationGeneratorTest {

    public final static void main(String[] args) {

          int n = Integer.parseInt(args[0]);

         

          PermutationGenerator generator =

                new PermutationGenerator(n);

         

          int[] p = new int[n];



          for (int i=0; i<n; i++)

          {

                System.out.println(“The permutation “ + (i+1) +

                      “ of numbers between 1 and " + n +": ");

   

                p = generator.nextPermutation();

         

                for (int i=0; i<n; i++)

                      System.out.print(p[i] + ", ");

               

                System.out.println("");

          }

    }

}
