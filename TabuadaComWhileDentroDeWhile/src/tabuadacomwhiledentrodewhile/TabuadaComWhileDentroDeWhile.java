package tabuadacomwhiledentrodewhile;
public class TabuadaComWhileDentroDeWhile {
    public static void main(String[] args) {
        int i = 1;	
        int j;
        
        while(i <= 10) {
            j = 1;
            while(j <= 10) {
                System.out.print(i + " x " + j + " = " + (i*j) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}