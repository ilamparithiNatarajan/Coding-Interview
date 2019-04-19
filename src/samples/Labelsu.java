package samples;

public class Labelsu {
    public static void main(String[] args) {
        ilam:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (j == 1) continue ilam;
                System.out.println("came here");
            }
        }
    }

}
