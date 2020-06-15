public class Zad2 {
    public static void main(String[] args) {
        int massiv[] = {10,4,1,4,-10,-50,32,21};
        vsp VSP = new vsp();
        int result = VSP.differenceMaxMin(massiv);
        System.out.println(result);


    }
}
class vsp{
    int max = -99999999;
    int min =  99999999;
    public int differenceMaxMin( int massiv[]) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > max) {
                max = massiv[i];
            }
            else if (massiv[i] < min) {
                min = massiv[i];
            }
        }

        return max-min;
    }
}
