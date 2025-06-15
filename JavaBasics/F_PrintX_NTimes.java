public class F_PrintX_NTimes {
    public void printX(int X, int N) {
        if(N < 0) {
            System.out.println("Invalid");
            return;
        }
        for(int i=1; i<=N; i++) {
            System.out.print(X);
            if(i < N) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}