public class Main {
    public static void main(String[] args) {
        //Задача №1 (из видео)
        System.out.println("Задача №1");
        //int[] weight= new int[12] - пример масива
        int [] weight= {90,91,93,92,85,87,88,89,0,0,0,0};
        weight[0]=90;
        int januaryWeight=weight[0];
        System.out.println(januaryWeight);
        System.out.println(weight[0]);
        System.out.println(weight[4]);
        int january = 0;
        System.out.println(weight[january]);
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        //Задача №1.1 (масивы)
        System.out.println("Задача №1.1+Задача №2");
        int [] arr= new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        for (int i1=0; i1<arr.length;i1++) {
            System.out.print(" "+arr[i1]);}
        //Задача №1.2 (масивы)
        System.out.println("\n"+"Задача №1.2+Задача №2");
        double [] arr1= {1.57,7.654,9.986};
        for (int i2=0; i2<arr1.length;i2++) {
            System.out.print(" "+arr1[i2]);}
        System.out.println();
        //Задача №1.3 (масивы)
        System.out.println("Задача №1.3+Задача №2");
        int[] arr2= new int[5];
        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;
        for (int i3=0; i3<arr2.length;i3++) {
            System.out.print(" "+arr2[i3]);}

        System.out.println();
        //Задача №2 (масивы)
        System.out.println("Задача №2");
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
        System.out.println(arr1[0] + "," + arr1[1] + "," + arr1[2]);
        System.out.println(arr2[0]+","+arr2[1]+","+arr2[2]+","+arr2[3]+","+arr2[4]);

        System.out.println();
        //Задача №3 (масивы)
        System.out.println("Задача №3");
        System.out.println(arr[2] + "," + arr[1] + "," + arr[0]);
        System.out.println(arr1[2] + "," + arr1[1] + "," + arr1[0]);
        System.out.println(arr2[4]+","+arr2[3]+","+arr2[2]+","+arr2[1]+","+arr2[0]);

        //Задача №4 (масивы)
        System.out.println("Задача №4");
        int [] arr5={1,2,3,4,5,6,7,8,9};
        for (int g=0; g <= arr5.length;g++)
        {if (g%2==0);
            g++;
            System.out.println(arr5[g]);}}



    }