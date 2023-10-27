package entietis;

public class rectangule {
    public double width;
    public double heigth;

    public double Area(){
        return width * heigth;
    }

    public double Perimeter(){
        return 2*(width+heigth);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(heigth, 2) + Math.pow(width, 2));
    }
    

}
