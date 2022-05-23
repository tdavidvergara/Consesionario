package model ;
public class Tecnomechanic extends Document{
    private double gasesTec ;
    public Tecnomechanic(int [][]  matrix, double valueTec, double gasesTec2, int year, double price,int yearTec, String code){
        super(matrix, year, price,code)  ;
        this.gasesTec = gasesTec ;

    }
    public double getGasesTec() {
        return gasesTec;
    }
    public void setGasesTec(double gasesTec) {
        this.gasesTec = gasesTec;
    }


    
}