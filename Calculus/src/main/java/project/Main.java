package project;

import javax.crypto.AEADBadTagException;

public class Main {
    public static void main(String[] args) {
        double [][] train_data = {{60.6,50.6},{30.3,20.2},{70.7,60.2},{10.1,20.3},{70.5,50.5}};
        Normal_Distributed normal_distributed = new Normal_Distributed(train_data);
        normal_distributed.show_data();
    }
}
