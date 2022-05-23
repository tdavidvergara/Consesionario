package model ;
public class Motorcycle extends Vehicle {
    //Atributos
    private TypeMoto tipoMoto ;
    private double gasolineCapacity ;
    private double gasolineConsume ;
    public Motorcycle(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
            int kilometer, String placa, double gasolineCapacity, double gasolineConsume, int optionMoto) {
        super(alreadyUsed, basePrice, sellPrice, mark, cilinderCapacity, kilometer, placa);
        this.gasolineCapacity=gasolineCapacity;
        this.gasolineConsume=gasolineConsume;
        switch(optionMoto){
            case 1:setTipoMoto(TypeMoto.STANDAR);
            break; 
            case 2:setTipoMoto(TypeMoto.SPORT);
            break;
            case 3:setTipoMoto(TypeMoto.SCOOTER);
            break ;
            case 4:setTipoMoto(TypeMoto.CROSS);
            break;
        }
    }
    public double getGasolineConsume() {
        return gasolineConsume;
    }
    public void setGasolineConsume(double gasolineConsume) {
        this.gasolineConsume = gasolineConsume;
    }
    public double getGasolineCapacity() {
        return gasolineCapacity;
    }
    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }
    public TypeMoto getTipoMoto() {
        return tipoMoto;
    }
    public void setTipoMoto(TypeMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    public String toString (){
        String mensaje = "" ; 
        mensaje = super.toString()+ "\n This moto has a gasoline capacity of: "+gasolineCapacity+" \n and consumes: "+gasolineConsume+ "\n This moto is a: "+tipoMoto ;
        return mensaje ;
    }
    public String calculatePrice(int year, double basePrice, String alreadyUsed){
        String message = "" ;
        basePrice = basePrice * 1.04 ;
        if ( super.dateDocument(0)> year){
            basePrice = basePrice + 500000 ;
        }
        if(super.dateDocument(1)> year){
            basePrice = basePrice +500000 ;
        }
        if ( alreadyUsed.equalsIgnoreCase("yes")){
            basePrice = basePrice *0.02 ;
        }
        message = "The total price of the vehice is: "+basePrice+" Pesos"  ;
        
        
        return message  ;
    }
 
    

    
}
