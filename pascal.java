public class pascal{
static void printUseBinomialExpansion(int n) {
    for (int line = 1; line <= n; line++) {
        for (int j = 0; j <= n - line; j++) {
            System.out.print(" ");
        }

        int k = 1;
        for (int i = 1; i <= line; i++) {
            System.out.print(k + " ");
            k = k * (line - i) / i;//Importatnt to learn
        }

        System.out.println();
    }
}
public static void main(String[] args){
 printUseBinomialExpansion(6);
}
}