public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle.
        // calculate the value of c given legA and legB
        double temp = legA*legA + legB*legB;
        return Math.sqrt(temp);
    }
}
