public class estruturas02 {
    public static void main(String[] args) {
        //ordenacao crescente de vetor
        int [] a = new int[6];
        a[0] = 10;
        a[1] = 25;
        a[2] = 5;
        a[3] = 3;
        a[4] = 50;
        a[5] = 14;
        int aux =0;
        for(int i = 0; i<6;i++){
            for (int j =  i+1; j<6;j++){
                if(a[i]>a[j]){
                    aux=a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        for (int z = 0; z<6; z++){
            System.out.println(a[z]);
        }
    }

}
