

public class Main {

    public static void main(String[] args) {
        Prime prime = new Prime();
        int [] array =  prime.primeNumber(20000);
        int num = array.length%5;
        for(int i=0;i<array.length-num;i=i+5) {
            for(int t=0;t<5;t++) {
                System.out.print(array[t+i]+" ");
            }
            System.out.println();
        }
        for(int t=0;t<num;t++) {
            System.out.println(array[array.length-num+t]);
        }

    }
}
