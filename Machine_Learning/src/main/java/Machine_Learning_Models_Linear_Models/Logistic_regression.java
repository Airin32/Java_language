package Machine_Learning_Models_Linear_Models;


public class Logistic_regression {
    double []weight = new double [20];
    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
    public void train(double[][]x,double[]y,double[]weight,double bias,double learning_rate,int epochs){  
        int n = x.length;
        for (int epoch =0; epoch < epochs; epoch++){
            double total_lost = 0;
            for (int i =0; i<n; i++){
                double z = bias;
                for (int j = 0; j<x[i].length; j++){
                    z += (weight[j] * x[i][j]);
                }
                double probability = sigmoid(z);
                double loss = -(y[i] * Math.log(probability) + (1-y[i]) * Math.log(1-probability));
                total_lost += loss;
                double gradient_Bias = probability - y[i];
                double[] gradient_weight = new double[weight.length];
                for (int j=0; j<x[i].length; j++){
                    gradient_weight[j] = (probability - y[i]) * x[i][j];
                }
                bias -= learning_rate * gradient_Bias;
                for (int j =0; j<x[i].length; j++){
                    weight[j] -= learning_rate * gradient_weight[j];
                }
                System.out.println("epoch : " + epoch + " " + "Loss : " + total_lost);
            }
        }
    }
}
