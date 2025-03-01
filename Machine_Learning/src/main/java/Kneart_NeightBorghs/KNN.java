package Kneart_NeightBorghs;

import java.util.Arrays;

public class KNN {
    public static void main(String[] args) {
        double[][] data = {
            {1, 2, 1},
            {2, 3, 1},
            {3, 3, 2},
            {5, 4, 2}
        };

        double[] newPoint = {3, 2};  // Titik baru yang ingin diprediksi
        int k = 3;  // Jumlah tetangga terdekat yang digunakan untuk prediksi

        // Hitung jarak Euclidean antara titik baru dan data
        double[] distances = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            distances[i] = euclideanDistance(newPoint, data[i]);
        }

        // Urutkan jarak dan ambil K tetangga terdekat
        int[] sortedIndices = sortIndicesByDistance(distances);

        // Prediksi kelas berdasarkan mayoritas kelas dari K tetangga terdekat
        int predictedClass = predictClass(data, sortedIndices, k);
        System.out.println("Prediksi Kelas: " + predictedClass);
    }

    // Menghitung jarak Euclidean
    public static double euclideanDistance(double[] point1, double[] point2) {
        double sum = 0;
        for (int i = 0; i < point1.length - 1; i++) {  // -1 untuk menghindari kolom kelas
            sum += Math.pow(point1[i] - point2[i], 2);
        }
        return Math.sqrt(sum);
    }

    // Mengurutkan indeks berdasarkan jarak
    public static int[] sortIndicesByDistance(double[] distances) {
        Integer[] indices = new Integer[distances.length];
        for (int i = 0; i < distances.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Double.compare(distances[a], distances[b]));
        return Arrays.stream(indices).mapToInt(Integer::intValue).toArray();
    }

    // Prediksi kelas berdasarkan mayoritas dari K tetangga terdekat
    public static int predictClass(double[][] data, int[] sortedIndices, int k) {
        int[] classCounts = new int[2];  // Asumsi hanya ada 2 kelas: 1 dan 2
        for (int i = 0; i < k; i++) {
            int classLabel = (int) data[sortedIndices[i]][2];  // Ambil kelas dari data
            classCounts[classLabel - 1]++;
        }

        return (classCounts[0] > classCounts[1]) ? 1 : 2;
    }
}