public class DataSetTester {
    public static void main(String[] args) {

        DataSet data = new DataSet();

        data.addValue(1);
        data.addValue(2);
        data.addValue(-3);
        data.addValue(4);

        int sum = data.getSum();
        double avg = data.getAverage();
        int larg = data.getLargest();
        int sml = data.getSmallest();

        System.out.println("The Sum is: " + sum);
        System.out.println("Expected: 4");

        System.out.println("The Average is: " + avg);
        System.out.println("Expected: 1");

        System.out.println("The Largest value is: " + larg);
        System.out.println("Expected: 4");

        System.out.println("The smallest value is: " + sml);
        System.out.println("Expected: -3");
    }
}