class Multidimensionalarray{
    public static void main(String[] args) {
        int [][] arr3 = new int[2][3];
        arr3[0][0] = 10;
        arr3[0][1] = 20;
        arr3[0][2] = 30;
        arr3[1][0] = 40;
        arr3[1][1] = 50;
        arr3[1][2] = 60;

        for(int i =0;i<arr3.length;i++){
            for(int j = 0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}