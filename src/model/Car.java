package model; 
public abstract class Car extends Vehicle {
    //atributtes
    private int numDoors ;
    private String polarized ;
    private TypeCar tipocarro ;
    //constuctor
    public Car(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
    int kilometer, String placa, int numDoors, String polarized, int option) {
        super(alreadyUsed, basePrice, sellPrice, mark, cilinderCapacity, kilometer, placa);
        this.numDoors=numDoors;
        this.polarized=polarized;
        switch(option){
            case 1:setTipocarro(TypeCar.SEDAN);
            break;
            case 2:setTipocarro(TypeCar.PICKUPTRUCK);
            break ;

        }
    }



	//Getter and setter
    public TypeCar getTipocarro() {
        return tipocarro;
    }
    public void setTipocarro(TypeCar tipocarro) {
        this.tipocarro = tipocarro;
    }
    public String getPolarized() {
        return polarized;
    }
    public void setPolarized(String polarized) {
        this.polarized = polarized;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public String toString(){
        String mensaje ="" ;
        mensaje=super.toString()+ "The car has "+numDoors+" doors, the car is polarized:"+polarized+" the car is a: "+tipocarro ;
        return mensaje ;

    }
   

}
