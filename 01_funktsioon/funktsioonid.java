public class funktsioonid {
    public static void main(String[] args) {
        //sout -- genereerin
        System.out.println(taksoSõit(tund: 3.5));

        double sõiduMaksumus = taksoSõit(double tund: 0.5);
        System.out.println(sõiduMaksumus);

        prindiForTsükkel(5);

        System.out.println(temperatuuriHinnang(-2));
        String hinnang = temperatuuriHinnang(-2)
        System.out.println(hinnang);
    }
    // funkstioon on selleks et midagi saada
    public static double taksoSõit(double tund) {
        return 3+0.8*tund; //alustustariif + tundide arv
    }
    // void on funktsioon selleks et midagi teha
    public static void prindiForTsükkel(int kordadearv) {

        for (int i = 0; i < kordadearv; i++) {
            System.out.println(i*10);

        }

    }

    public static String temperatuuriHinnang(float temperatuur) {
        if (temperatuur < 0) {
            return "On jääs";
        } else {
            return "Ei ole jääs";
        }
    }
}
