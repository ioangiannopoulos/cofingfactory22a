package gr.aueb.cf.ch4;

/**
 * Ενας μικρος βατραχος θελει να περασει ενα ποταμι.
 * Ο frog βρισκεται στη θεση X και θελει να φτασει
 * στη θεση Y (ή σε θεση > Y).Ο frog jumps a fixed distance, D.
 *
 * Βρισκει τον ελαχιστο αριθμο jumps που ο small frog πρεπει
 * να κανει ωστε να φτασει (ή να ξεπερασει) τον στοχο.
 *
 * Για παραδειγμα ,αν εχουμε:
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τοτε ο small frog θα χρειαστει 3 jumps, γιατι :
 * Starts at 10 και μετα το 1ο jump παει στη θεση 10 + 30 = 40
 * Στο 2ο jump, παει 40 + 30 = 70
 * και στο 3ο jump, παει 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Jumps: " + jumps);
    }
}
