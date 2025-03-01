package Machine_Learning_Models_Linear_Models;
public class Linear_Regression {
    public static void main(String[] args) {
        double x[] = {1,2,3,4,5};
        double y[] = {2,4,5,4,5};
        double theta0 = 0,theta1=0;
        double learning_rates = 0.01;
        double mse = 0;
        int m = x.length;
        
        for (int i=0; i<250; i++){
            double sumerrortheta0 = 0;
            double sumerrortheta1 = 0;
            for (int j=0; j<m; j++){
                double y_pred = theta0 + theta1 * x[j];
                double error = y_pred - y[j];
                sumerrortheta0 += error;
                sumerrortheta1 += (error * x[j]);
                mse += Math.pow(y_pred-y[j], 2);
            }
            mse /= m;
            theta0 -=  (learning_rates *(sumerrortheta0/m));
            theta1 -= (learning_rates * (sumerrortheta1/m));
            System.out.printf("Mean Sequare Error  : %.2f \n",mse);
        }
        System.out.printf("Persamaan: y = %.2fx + %.2f%n", theta1, theta0);
        
        for (double data : x){
            double predict = (theta0 + theta1) * data;
            System.out.println(predict);
        }
    }
}
