package Naloge3;

public class Nal13 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Dobili smo:");
        System.out.println(sum(tab,0));
    }

    public static int sum(int[] tab, int i) {
        if(i == tab.length)
            return 0;
        return tab[i]+sum(tab,i+1);
    }
}
