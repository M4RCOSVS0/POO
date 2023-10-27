package entietis;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double Media(){
        return (n1+n2+n3);
    }
    public void Situation(){
        System.out.println("FINAL GRADE = "+ Media());
        if (Media() > 60) {
            System.out.println("PASS");
        }else{
            System.out.println("FAILED\nMISSING " +(60-Media())+ " POINTS");
        }
    }
}
