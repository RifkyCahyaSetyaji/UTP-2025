
import java.util.Scanner;

public class UTP_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x[] = new int[c];
        int y[] = new int[c];
        char z[] = new char[c];
        int X = -1;
        int Y = -1;

        for (int i = 0; i < c; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.next().charAt(0);
        }
        if (a <= 0 || b <= 0) {
            System.out.println("Input tidak sesuai");
            return;
        }
        char kolom[][] = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                kolom[i][j] = '.';
            }
        }
        for (int i = 0; i < c; i++) {
            kolom[x[i]][y[i]] = z[i];
            if (z[i] == 'K') {
                X = x[i];
                Y = y[i];
            }
        }
        if (X != -1 && Y != -1) {
            for (int i = X - 1; i >= 0; i--) {
                if (kolom[i][Y] == '.') {
                    kolom[i][Y] = '*';
                } else {
                    break;
                }
            }
            for (int i = X + 1; i < a; i++) {
                if (kolom[i][Y] == '.') {
                    kolom[i][Y] = '*';
                } else {
                    break;
                }
            }
            for (int i = Y - 1; i >= 0; i--) {
                if (kolom[X][i] == '.') {
                    kolom[X][i] = '*';
                } else {
                    break;
                }
            }
            for (int i = Y + 1; i < b; i++) {
                if (kolom[X][i] == '.') {
                    kolom[X][i] = '*';
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(kolom[i][j] + " ");
            }
            System.out.println();
        }
    }
}
