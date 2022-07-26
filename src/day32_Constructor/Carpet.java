package day32_Constructor;

public class Carpet {
    public double wight;
    public double length;
    public double unitPrice;
    public boolean isPersian;


    public Carpet(double weight, double length, double unitPrice, boolean isPersian){
        this.wight = weight;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){
        double totalPrice = (wight*length) *unitPrice;
        if (isPersian){
            totalPrice += 200 ; }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "wight=" + wight +
                ", length=" + length +
                ", unitPrice=$" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price=$" + calcCost() +
                '}';

    }
}
