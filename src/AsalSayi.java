public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int sayac=0;
            for(int k=1;k<=i;k++){
                int mod=i%k;
                if(mod==0){
                    sayac++;
                }
            }
            if(sayac==2){
                System.out.print(i+" ");
            }

        }
    }
}
