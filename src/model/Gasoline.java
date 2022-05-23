package model  ;
public class Gasoline extends Car {
    //Atributos
    private double gasolineCapacityG ;
    private double gasolineConsumeG ;
    private TypeGasoline tipoGasolina ;
    //constructor

    public Gasoline(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
            int kilometer, String placa, int numDoors, String polarized, int option, double gasolineCapacityG,
            double gasolineConsumeG) {
        super(alreadyUsed, basePrice, sellPrice, mark, cilinderCapacity, kilometer, placa, numDoors, polarized, option);
        this.gasolineCapacityG = gasolineCapacityG;
        this.gasolineConsumeG = gasolineConsumeG;
        this.tipoGasolina = tipoGasolina;
        switch(option){
            case 1:setTipoGasolina(TypeGasoline.CORRIENTE) ;
            break;
            case 2:setTipoGasolina(TypeGasoline.EXTRA) ;
            break;
            case 3:setTipoGasolina(TypeGasoline.DIESEL) ;
            break; 

        }
    }
    //getter and setter
    public double getGasolineCapacityG() {
        return gasolineCapacityG;
    }
    public void setGasolineCapacityG(double gasolineCapacityG) {
        this.gasolineCapacityG = gasolineCapacityG;
    }
    public double getGasolineConsumeG() {
        return gasolineConsumeG;
    }
    public void setGasolineConsumeG(double gasolineConsumeG) {
        this.gasolineConsumeG = gasolineConsumeG;
    }
    public TypeGasoline getTipoGasolina() {
        return tipoGasolina;
    }
    public void setTipoGasolina(TypeGasoline tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    public String toString() {
        String mensaje = ""; 
        mensaje =super.toString()+ "\n The car has :"+gasolineCapacityG+"\n gasoline Capacity, and consumes"+gasolineConsumeG+"\n implements this type of gasoline "+tipoGasolina;
        return mensaje ;

    }
    public String calculatePrice(int year, double basePrice, String alreadyUsed){
        String message = "" ;
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
