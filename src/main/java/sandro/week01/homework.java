package sandro.week01;

public class homework {
    public static void main(String args[]) {
        //    calculatePi(2000000);
        calculatePi2(2000000);
    }

    private static void calculatePi(int accuracy) {
        double pi = 0.0;
        boolean addValues = true;

        for (int i = 0; i <= accuracy; i++) {

            double iterationValue = 4.0 / (i * 2 + 1);


            if (addValues) {
                // schöner geht auch: pi += iterationValue;
                pi = pi + iterationValue;
            } else {
                // schöner geht auch: pi -= iterationValue;
                pi = pi - iterationValue;
            }

            addValues = !addValues;
        }
        System.out.println(pi);
    }

    private static void calculatePi2(int accuracy) {
        double pi = 0.0;
        boolean addValues = true;
        int b = 1;
        for (int i = 0; i <= accuracy; i++) {
            double iterationValue = 4.0 / b;
            if (addValues) {
                pi = pi + iterationValue;
            } else {
                pi = pi - iterationValue;
            }
            addValues = !addValues;
            if (i == 0) {
                b = 3;
            } else {
                b = b + 2;
            }
        }
        System.out.println(pi);
    }

}

