package main;

public class Program {
    public static void main(String[] args) {
        int szamok[] = new int[10];
        for(int i = 0; i < szamok.length; i++) {
            szamok[i] = (int)(Math.random() * 20) + 1;
        }
        
        kiir("Az eredeti tömb", szamok);
        
        int[] rendezett = shellRendezes(szamok, szamok.length);
        
        kiir("A rendezett tömb", rendezett);
    }
    
    public static void kiir(String szoveg, int[] szamok) {
        System.out.println(szoveg);
        for(int i = 0; i < szamok.length; i++) {
            System.out.printf("%d ", szamok[i]);
        }
        
        System.out.println("");
    }
    
    public static int[] shellRendezes(int[] szamok, int n) {
        int[] tomb = szamok;

        int interval = n / 2;
            System.out.println(interval);
        while(interval > 0) {
            for(int i = interval; i < n; i++) {
                int atmeneti = tomb[i];
                int j = i;
                while(j >= interval && tomb[j - interval] > atmeneti) {
                    tomb[j] = tomb[j - interval];
                    j = j - interval;
                }
                tomb[j] = atmeneti;
            }
            interval /= 2;
        }
        
        int[] rendezett = tomb;
        return rendezett;
    }
}
