package model;
public class Electric extends Car {
    private TypeCharger tipoCargador;
    private double batteryConsume ;
    private double batteryDuration;
    public Electric(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
    int kilometer, String placa, int numDoors, String polarized , int option,  double batteryConsume, double batteryDuration, int optionCargador ) {
        super(alreadyUsed,  basePrice,  sellPrice,  mark,  cilinderCapacity,kilometer,  placa,  numDoors,  polarized ,  option);
        
        this.batteryConsume=batteryConsume;
        this.batteryDuration=batteryDuration;
        switch (optionCargador) {
            case 1 : setTipoCargador(TypeCharger.FAST);
            break ;
            case 2 : setTipoCargador(TypeCharger.NORMAL);
            break ;

        }
    }
    public double getBatteryDuration() {
        return batteryDuration;
    }
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
    public double getBatteryConsume() {
        return batteryConsume;
    }
    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }
    public TypeCharger getTipoCargador() {
        return tipoCargador;
    }
    public void setTipoCargador(TypeCharger tipoCargador) {
        this.tipoCargador = tipoCargador;
    }
    public String toString() {
        String mensaje ="" ;
        mensaje = "\n This electric car implements a type charger of: "+tipoCargador+"\n and a battery consumes "+batteryConsume+"\n and a battery duration of: "+batteryDuration ;
        return mensaje ;
    }
    public String calculatePrice(int year, double basePrice, String alreadyUsed){
        String message = "" ;
        basePrice = basePrice *1.20 ;
        if ( super.dateDocument(0)> year){
            basePrice = basePrice + 500000 ;
        }
        if(super.dateDocument(1)> year){
            basePrice = basePrice +500000 ;
        }
        if(alreadyUsed.equalsIgnoreCase("yes")){
            basePrice = basePrice * 0.1 ;
        }
        message = "The total price of the vehice is: "+basePrice+" Pesos"  ;
        
        
        return message  ;
        
    }
   
    
}
