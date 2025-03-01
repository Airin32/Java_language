package Machine_Learning_Models_Linear_Models;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        double [][]X= {{1,0},{0,0},{1,1},{0,0}};
        double [] y = {1,0,1,0};
        double [] weight = {0.1,0.1};
        double learning_rate = 0.01;
        double bias =0;
        double [][] target = {{1,1}};
        Logistic_Regression2 logistic = new Logistic_Regression2(X, y);
        logistic.train();
        System.out.println(logistic.predict(target));
        System.out.print(target.length);
    }
}