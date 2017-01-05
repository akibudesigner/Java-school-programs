package Naloge3;

public class Nal3 {
    public static void main(String[] args) {
        izpis(3,5);
        System.out.println();
        izpisObrat(6);
    }

    public static void izpis(int Od_, int Do_) {
        for(int i=Od_;i<=Do_;i++)
            System.out.print(zap(i)+",");
    }

    public static void izpisObrat(int Do_) {
        for(int i=Do_;i>=1;i--)
            System.out.print(zap(i)+",");
    }

    public static int zap(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 4;
        return zap(n-1)+4;
    }
}
