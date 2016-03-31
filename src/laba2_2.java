
public class laba2_2 {
    public static void main(String[] args) {
        short a[][] = {{1, 2},
                {3, 4}};
        short b[][] = {{1, 2},
                {3, 4}};
        short c[][] = new short[2][2];
        for (short i = 0; i < c.length; i++){
            for (short j = 0; j < c[i].length; j++) {
                c[i][j] = (short) (a[i][j] + b[i][j]);

                System.out.print(c[i][j] + (j == 2 - 1 ? "\n" : "\t"));
            }
        }
        for (short i = 0; i < c.length; i++) {
            short sum = 0;
            for (short j = 0; j < c[i].length; j++) {
                sum += c[i][j];
            }
            System.out.print("average for row: [" + i + "] = " + sum/c[i].length+"\n");
        }
    }
    }

