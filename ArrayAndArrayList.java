public class ArrayAndArrayList {
    public static void main (String[] args){
        Print1to225();
        System.out.println("next");
        PrintOddIn225();
        System.out.println("next");
        Accumulate225();
        int[] X= {1,3,5,7,9,13};
        ViewIntArray(X);
        int[] Y ={-1,-5,-7,9,1,6,4,-8,10,20};
        int MaxY = MaxInIntArray(Y);
        System.out.println("max of Y is: " + MaxY);
        double AverageY = AverageIntArray(Y);
        System.out.println(String.format("Average of Y is: %.2f", AverageY));
        System.out.println(NumberOfGreaterIntElement(Y,5));
        ViewIntArray(Y);
        EliminateNegNum(Y);
        ViewIntArray(Y);
        SquareArray(X);
        ViewIntArray(X);
        ViewIntArray(MaxMinAverage(X));
        ShiftArray(X);
        ViewIntArray(X);
    }
    public static int[] ShiftArray(int[]a){
        for (int i=0; i<a.length-1; i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=0;
        return a;
    }
    public static int[] MaxMinAverage(int[]a){
        return new int[]{MaxInIntArray(a),MinInIntArray(a),(int)AverageIntArray(a)};
    }
    public static int[] EliminateNegNum(int[]a){
        for(int i=0; i<a.length;i++){
            if (a[i]<0){
                a[i]=0;
            }
        }
        return a;
    }

    public static int[] SquareArray(int[] x){
        for (int i = 0; i<x.length; i++){
            x[i] = x[i]*x[i];
        }
        return x;
    }
    public static int NumberOfGreaterIntElement(int[] x, int y){
        int count = 0;
        for (int num : x){
            if(num > y) {
                count++;
            }
        }
        return count;
    }
    public static double AverageIntArray(int[] a){
        int sum = 0;
        for (int i =0 ; i<a.length; i++){
            sum+= a[i];
        }
        return (double)sum/a.length;
    }
    public static void Print1to225(){
        for (int i=1; i<=255; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public static void PrintOddIn225(){
        for (int i=1; i<=255; i++){
            if (i%2!=0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
    public static void Accumulate225(){
        int sum = 0;
        for (int i=0; i<=255; i++ ){
            sum+= i;
            System.out.println(String.format("New Number: %s Sum: %s",i,sum));
        }
    }
    public static void ViewIntArray(int[] X){
        System.out.print("[");
        for (int i = 0; i < X.length-1 ; i++){
            System.out.print(X[i]+",");
        }
        System.out.println(X[X.length-1]+"]");
    }
    public static int MaxInIntArray(int[] Y){
        int MaxY = Y[0];
        for (int i=0; i<Y.length; i++){
            if( MaxY < Y[i]) {
                MaxY = Y[i];
            }
        }
        return MaxY;
    }
    public static int MinInIntArray(int[] Y){
        int MinY = Y[0];
        for (int i=0; i<Y.length; i++){
            if( MinY > Y[i]) {
                MinY = Y[i];
            }
        }
        return MinY;
    }
}
