package model  ;
public class Soat extends Document{
    private double damageSoat ; 
    public Soat(double price, int[][] matrix, double damageSoat, int daySoat, double monthSoat, double yearSoat,int year,String code){
        super(matrix,year,price,code) ;
        this.damageSoat = damageSoat ;
    }
  
    public double getDamageSoat() {
        return damageSoat;
    }
    public void setDamageSoat(double damageSoat) {
        this.damageSoat = damageSoat;
    }

    
}