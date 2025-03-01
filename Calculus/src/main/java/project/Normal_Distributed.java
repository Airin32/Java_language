package project;
import java.util.Arrays;
public class Normal_Distributed extends Distributed {
    private double[][] X;
    private double sigma, means;
    private double[] probability;
    private double[] continuous_proba;

    public Normal_Distributed(double[][] X) {
        this.X = X;
        this.probability = new double[this.X.length];
        this.continuous_proba = new double[this.X.length];
    }

    private void means_counter() {
        double m = 0;
        for (int i = 0; i < this.X.length; i++) {
            for (int j = 0; j < this.X[i].length; j++) {
                m += this.X[i][j];
            }
        }
        this.means = m / (this.X.length * this.X[0].length); // rata-rata elemen
    }

    private void sigma_counter() {
        means_counter();
        double dev_count = 0;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < this.X[i].length; j++) {
                dev_count += Math.pow((this.X[i][j] - this.means), 2);
            }
        }
        this.sigma = Math.sqrt(dev_count / (this.X.length * this.X[0].length));
    }

    @Override
    void sort_arr() {
        Arrays.sort(this.probability);
    }

    @Override
    double counting_probability(double x) {
        sigma_counter();
        return (1 / (Math.sqrt(2 * Math.PI) * this.sigma)) *
               Math.exp(-0.5 * Math.pow(((x - this.means) / this.sigma), 2));
    }

    private void probability_ADD() {
        for (int i = 0; i < this.probability.length; i++) {
            double temp = 0;
            for (int j = 0; j < this.X[i].length; j++) {
                temp += this.X[i][j];
            }
            this.probability[i] = temp;
        }
    }

    private void probability_Counting() {
        for (int i = 0; i < this.probability.length; i++) {
            this.continuous_proba[i] = counting_probability(this.probability[i]);
        }
    }

    public void show_data() {
        probability_ADD();
        probability_Counting();
        for (double i : this.continuous_proba) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    @Override
    double[] bad_case() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double[] general_case() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double[] best_case() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
