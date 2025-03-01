package project;

public class Logistic_linear{
    private double X [][];
    private double [] Y ;
    private double [] weight; 
    private double bias,learning_rate;
    private int epochs;
    private double [] means,std;
    
    public Logistic_linear(double[][] X, double[] Y, double bias, double learning_rate, int epochs) {
        this.X = X;
        this.Y = Y;
        this.bias = bias;
        this.learning_rate = learning_rate;
        this.epochs = epochs;
        this.weight = new double [this.X[0].length];
        for (int i=0; i<this.X[0].length; i++){
            this.weight[i] = Math.random();
        }
    }
    public Logistic_linear (double [][]X,double [] Y,double bias,double learning_rate){
        this.X = X;
        this.Y = Y;
        this.bias = bias;
        this.learning_rate = learning_rate;
        this.epochs = 200;
        this.weight = new double [this.X[0].length];
        for (int i=0; i<this.X[0].length; i++){
            this.weight[i] = Math.random();
        }
    }
    public Logistic_linear(double [][] X,double []Y,double learning_rate){
        this.X = X;
        this.Y= Y;
        this.bias = 0;
        this.learning_rate = learning_rate;
        this.epochs = 200;
        this.weight = new double [this.X[0].length];
        for (int i=0; i<this.X[0].length; i++){
            this.weight[i] = Math.random();
        }
    }
    public Logistic_linear (double[][]X,double[]Y){
        this.X = X;
        this.Y= Y;
        this.bias = 0;
        this.learning_rate = 0.01;
        this.epochs = 200;
        this.weight = new double [this.X[0].length];
        for (int i=0; i<this.X[0].length; i++){
            this.weight[i] = Math.random();
        }
    }
    private double sigmoid (double X){
        return 1 / (1 + Math.exp(-X));
    }
    private void Standar_Scaller_fit (){
        int n_features = this.X[0].length;
        this.means = new double [n_features];
        this.std = new double [n_features];
        for (int j =0; j< n_features; j++){
            double sum = 0;
            for (int i = 0; i< this.X.length; i++){
                sum += this.X[i][j];
            }
            this.means [j] = sum / this.X.length;
            
            double sumSquarediff = 0;
            for (int i=0; i<this.X.length; i++){
                sumSquarediff += Math.pow(this.X[i][j]-this.means[j],2);
            }
            this.std[j] = Math.sqrt(sumSquarediff / X.length);
        }
    }
    private double [][] Scallers_transform (double X[][]){
        Standar_Scaller_fit();
        double [][] scallers_data = new double [X.length][X[0].length];
        for (int i =0; i< X.length; i++){
            for (int j=0; j<X[0].length; j++){
                scallers_data[i][j] =(this.std[j] !=0) ? (X[i][j] - this.means[j]) / this.std[j] : 0;
            }
        }
        return scallers_data;
    }
    public void fit() {
        int n = Y.length;
        this.X = Scallers_transform(X);
        for (int epoch = 0; epoch < this.epochs; epoch++) {
            double total_loss = 0;
            for (int i = 0; i < n; i++) {
                double z = this.bias;
                for (int j = 0; j < this.X[i].length; j++) {
                    z += (this.weight[j] * this.X[i][j]);
                }
                double predicted = sigmoid(z);
                double loss = -((this.Y[i] * Math.log(predicted)) + (1 - this.Y[i]) * (Math.log(1 - predicted)));
                total_loss += loss;

                double gradient_bias = predicted - this.Y[i];
                double[] gradient_weight = new double[this.weight.length];
                for (int j = 0; j < this.weight.length; j++) {
                    gradient_weight[j] = (predicted - this.Y[i]) * this.X[i][j];
                }

                this.bias -= this.learning_rate * gradient_bias;
                for (int j = 0; j < this.weight.length; j++) {
                    this.weight[j] -= this.learning_rate * gradient_weight[j];
                }
            }
            System.out.println("Epoch: " + epoch + ", Loss: " + total_loss);
        }
    }
    public double [] predict(double X[][]){
        X = Scallers_transform(X);
        double [] predicted = new double [X.length];
        double predicts;
        for (int i = 0; i<predicted.length; i++){
            double z = this.bias;
            predicts = 0;
            for (int j = 0; j<X[i].length; j++){
                z += (this.weight[j] * this.X[i][j]);   
            }
            predicts = sigmoid(z);
            predicted[i] = predicts;
        }
        return  predicted;
    }
}