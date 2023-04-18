package main;

public class RendezesTeszt {
    public static void main(String[] args) {
        int[] tomb = {1, 3, 2, 69, 14, 7, 7, 8, 5};
        
        new RendezesTeszt().RendezettTombTeszt(tomb);
    }
    
    public void RendezettTombTeszt(int[] tomb) {
        int[] rendezettE = Program.shellRendezes(tomb, tomb.length);
        
        int hibas = 0;
        for (int i = 1; i < rendezettE.length; i++) {
            if(!(rendezettE[i] >= rendezettE[i - 1])) hibas++;
        }
        
        int kapott = hibas;
        int vart = 0;
        assert kapott == vart : "Nem jó a rendezés!";
    }
}
