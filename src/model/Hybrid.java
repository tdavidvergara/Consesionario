package model;
public class Hybrid extends Car {
    private double gasolineCapacityH;
    private double gasolineConsumeH ;
    private TypeGasoline tipoGasolina ;
    private TypeCharger tipoCargador;
    private double battery;
    private double batteryConsume ;
    public Hybrid(String alreadyUsed, double basePrice, double sellPrice, String mark,  double cilinderCapacity,int kilometer, String placa, int numDoors, String polarized, int option,
     double gasolineCapacityG, double gasolineConsumeG, int optionGasoline, double gasolineCapacityH, double gasolineConsumeH, double battery, double batteryConsume, int optionCargador, int optionGasolina){
            super(alreadyUsed,  basePrice,  sellPrice,  mark,  cilinderCapacity,
            kilometer,  placa,  numDoors,  polarized ,  option);
            this.gasolineCapacityH=gasolineCapacityH;
            this.gasolineConsumeH=gasolineConsumeH;
            this.battery=battery;
            this.batteryConsume=batteryConsume;
            switch(optionCargador){
                case 1:setTipoCargador(TypeCharger.FAST);
                break;
                case 2:setTipoCargador(TypeCharger.NORMAL) ;
                break;
            }
            switch(optionGasolina){
                case 1: setTipoGasolina(TypeGasoline.EXTRA);
                break;
                case 2: setTipoGasolina(TypeGasoline.CORRIENTE);
                break;
                case 3: setTipoGasolina(TypeGasoline.DIESEL);
                break;
            }
    }
    public double getBatteryConsume() {
        return batteryConsume;
    }
    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }
    public double getBattery() {
        return battery;
    }
    public void setBattery(double battery) {
        this.battery = battery;
    }
    public TypeCharger getTipoCargador() {
        return tipoCargador;
    }
    public void setTipoCargador(TypeCharger tipoCargador) {
        this.tipoCargador = tipoCargador;
    }
    public TypeGasoline getTipoGasolina() {
        return tipoGasolina;
    }
    public void setTipoGasolina(TypeGasoline tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    public double getGasolineConsumeH() {
        return gasolineConsumeH;
    }
    public void setGasolineConsumeH(double gasolineConsumeH) {
        this.gasolineConsumeH = gasolineConsumeH;
    }
    public double getGasolineCapacityH() {
        return gasolineCapacityH;
    }
    public void setGasolineCapacityH(double gasolineCapacityH) {
        this.gasolineCapacityH = gasolineCapacityH;
    }
    public String toString (){
        String mensaje = "" ;
        mensaje = super.toString()+"\n This Electric car, has a gasoline capacity of "+gasolineCapacityH+" \n and consumes a value of "+
        gasolineConsumeH+ ", \n This hybrid car used this type of gasoline: "+tipoGasolina+" \n and uses this type of charger: "+tipoCargador+" \n uses this battery: "+battery+"\n and consumes: "+batteryConsume ;
        return mensaje ;
        
    }
    public String calculatePrice(int year, double basePrice, String alreadyUsed){
        String message = "" ;
        basePrice = basePrice * 1.15 ;
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
