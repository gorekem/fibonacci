


class Main {
    public static void main(String[] args) {

        int sayi1, sayi2;
        sayi1=1;
        sayi2=1;
        System.out.print(sayi1+" "+sayi2+" ");
        for (int i=1; i<=10; i++)
        {
            sayi1+=sayi2;
            System.out.print(sayi1+" ");
            sayi2+=sayi1;
            System.out.print(sayi2+" ");
        }
    }
}