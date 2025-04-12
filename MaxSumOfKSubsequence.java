public class MaxSumOfKSubsequence {
    public static int calculateMaxIncasari(int[] incasari, int nrzileConsecutive) {
        if(incasari.length < nrzileConsecutive) {
            System.out.println("Input prea mic.");
            return -1;
        }

        int sumCurent = 0;
        for(int i = 0; i < nrzileConsecutive; i++) {
            sumCurent += incasari[i];
        }

        int sumMaxim = sumCurent;
        for(int i = nrzileConsecutive; i < incasari.length; i++) {
            sumCurent += incasari[i] - incasari[i - nrzileConsecutive];
            if(sumCurent > sumMaxim) {
                sumMaxim = sumCurent;
            }
        }

        return sumMaxim;
    }

    public static void main(String[] args) {
        int[] incasari = {100, 200, 300, 500, 200, 10, 1000, 200, 5};

        System.out.println(calculateMaxIncasari(incasari, 3));
    }
}
