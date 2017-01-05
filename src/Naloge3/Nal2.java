package Naloge3;

public class Nal2 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            System.out.print(rek1(i)+",");
        }
        System.out.println();
        for(int i=1;i<=8;i++) {
            System.out.print(rek2(i)+",");
        }
        System.out.println();
        for(int i=1;i<=6;i++) {
            System.out.print(rek3(i)+",");
        }
        System.out.println();
        for(int i=1;i<=13;i++) {
            System.out.print(rek4(i)+",");
        }
        System.out.println();
        for(int i=1;i<=8;i++) {
            System.out.print(rek5(i)+",");
        }
        System.out.println();
        for(int i=1;i<=5;i++) {
            System.out.print(rek6(i)+",");
        }
        System.out.println();
        for(int i=1;i<=6;i++) {
            System.out.print(rek7(i)+",");
        }
        System.out.println();
        for(int i=1;i<=9;i++) {
            System.out.print(rek8(i)+",");
        }
        System.out.println();

    }

    // 1,2,3,4,5,6,7,8,9,...
    public static int rek1(int n) {
        if(n == 1)
            return 1;
        return rek1(n-1)+1;
    }

    // 1,4,6,8,10,12,14,16,...
    public static int rek2(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 4;
        return rek2(n-1)+2;
    }

    // 1,3,8,18,38,78,...
    public static int rek3(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 3;
        return rek3(n-1)*2+2;
    }

    // 1,1,1,2,2,3,4,5,7,9,12,16,21,...
    public static int rek4(int n) {
        if(n <= 3)
            return 1;
        return rek4(n-2)+rek4(n-3);
    }

    // 1,-1,1,-1,1,-1,1,-1,...
    public static int rek5(int n) {
        if(n == 1)
            return 1;
        return rek5(n-1)*(-1);
    }

    // 2,8,26,80,242,...
    public static int rek6(int n) {
        if(n == 1)
            return 2;
        return rek6(n-1)*3+2;
    }

    // 1,4,8,12,16,20,...
    public static int rek7(int n) {
        if(n == 1)
            return 1;
        else if(n == 2)
            return 4;
        return rek7(n-1)+4;
    }

    //1,1,1,3,5,9,17,31,57,...
    public static int rek8(int n) {
        if(n <= 3)
            return 1;
        return rek8(n-3)+rek8(n-2)+rek8(n-1);
    }
}
