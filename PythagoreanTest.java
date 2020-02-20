public class PythagoreanTest{
    public static void main (String[] args){
        Pythagorean result = new Pythagorean();    // Calls back on Pythogorean.java
        double output = result.calculateHypotenuse(2, 5); //Subs in for LegA and LegB
        System.out.println(output);
    }
}