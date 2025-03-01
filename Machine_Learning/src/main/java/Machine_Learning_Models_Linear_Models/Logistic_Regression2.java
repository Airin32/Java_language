package Machine_Learning_Models_Linear_Models;
import java.util.Arrays;
public class Logistic_Regression2{
    private double[] weight = {0.1,0.2};
    private double learning_rate,epochs;
    private double[][] Train_data;
    private double[] Target_data;
    private double bias = 0;

    public Logistic_Regression2(double[][]Train_Data,double[]Target_Data,double learning_rate,double epochs,double bias){
        this.Train_data = Train_Data;
        this.Target_data = Target_data;
        this.learning_rate = learning_rate;
        this.epochs = epochs;
        this.bias = bias;
    }
    public Logistic_Regression2(double[][]Train_Data,double[]Target_Data,double learning_rate,double bias){
        this.epochs = 200;
        this.Train_data = Train_Data;
        this.Target_data = Target_Data;
        this.learning_rate = learning_rate;
        this.bias = bias;
        
    }
    public Logistic_Regression2 (double [][] Train_Data,double[]Target_data,double bias){
        this.Train_data = Train_Data;
        this.Target_data = Target_data;
        this.epochs = 200;
        this.learning_rate = 0.01;
        this.bias = bias;
    }
    public Logistic_Regression2(double [][] Train_Data,double[]Target_data){
        this.Train_data = Train_Data;
        this.Target_data = Target_data;
        this.epochs = 200;
        this.learning_rate = 0.01;
        this.bias = 0;
    }
    private double sigmoid (double x){
        return 1 / (1 + Math.exp(-x));
    }
    
    public void train(){
        int n = this.Target_data.length;
        for (int epoch = 0; epoch < this.epochs; epoch++){
            double total_lost=0;
            for (int i =0; i<n; i++){
                double z = this.bias;
                for (int j = 0; j<this.Train_data[i].length; j++){
                    z += (this.weight[j] * this.Train_data[i][j]);
                }
                double predict = sigmoid(z);
                double loss = -(this.Target_data[i] * Math.log(predict) + (1 -  this.Target_data[i]) * Math.log(1-predict));
                total_lost += loss;
                double gradient_bias = predict - this.Target_data[i];
                double []gradient_Weight = new double [this.weight.length];
                for (int j=0; j<this.Train_data[i].length;j++){
                    gradient_Weight[j] = (predict - this.Target_data[i]) * this.Train_data[i][j];
                }
                this.bias -= this.learning_rate * gradient_bias;
                for (int j=0; j<this.Train_data[i].length; j++){
                    this.weight[j] -= this.learning_rate * gradient_Weight[j];
                }
            }
            System.out.println("epoch : " + epoch + "\nloss : " + total_lost );
        }
    }
    public String predict(double X[][]){
        double [] predicted = new double[X.length];
        int i =0;
        for (double[] target : X){
            double z = this.bias;
            for (int j = 0; j <this.weight.length; j++){
                z+= (target[j] * this.weight[j]);
            }
            double prediction = sigmoid(z);
            predicted[i] = prediction;
            i+=1;
        }
            return Arrays.toString(predicted);
 
    }
}