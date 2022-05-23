package model;

import java.util.ArrayList;

public abstract class Vehicle{
    private String alreadyUsed ;
    private double basePrice ;
    private double sellPrice ;
    private String mark ;
    private int model ;
    private double cilinderCapacity ;
    private int kilometer ;
    private String placa ;
    private ArrayList<Document>documentos; 
    public Vehicle(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity, int kilometer, String placa, int model) {
        this.alreadyUsed=alreadyUsed;
        this.basePrice=basePrice;
        this.sellPrice=sellPrice;
        this.mark=mark;
        this.cilinderCapacity=cilinderCapacity ;
        this.kilometer=kilometer;
        this.placa=placa;
        this.model = model ;
        documentos  = new ArrayList <Document>() ;
      
    }
    //getter and setter


    public int getModel() {
        return model;
    }


    public void setModel(int model) {
        this.model = model;
    }


    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getKilometer() {
        return kilometer;
    }
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
    public double getCilinderCapacity() {
        return cilinderCapacity;
    }
    public void setCilinderCapacity(double cilinderCapacity) {
        this.cilinderCapacity = cilinderCapacity;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public double getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public String getAlreadyUsed() {
        return alreadyUsed;
    }
    public void setAlreadyUsed(String alreadyUsed) {
        this.alreadyUsed = alreadyUsed;
    }
    // this method prints the whole information
    public String toString(){
    return "This vehice is already used: "+alreadyUsed+ "\n Has this base price: "+basePrice+"\n This sell price: "+sellPrice+" \n Is this mark: "+mark+"\n Uses this sell price: "+
     "\n With the ciliinder capacity of "+cilinderCapacity+"\n Has this kilometers traveled"+kilometer+"\n USES THIS PLATE: "+placa ;
    }
    public String addSoat(double valueSoat, int [][] matrix,double damageSoat, int daySoat,int monthSoat, int  yearSoat,String code){
        String message  = "Couldn´t add the Soat"  ;
        documentos.add(new Soat( valueSoat,matrix,  damageSoat, daySoat, monthSoat, yearSoat, yearSoat,code)) ;
            message = "Soat added." ;
             return message ;



    }
    public String addTec(int [][] matrix,double valueTec, double gasesTec, int dayTec, int monthTec, int yearTec , String code){
        String message  = "Couldn´t add the Tecnomechanic"  ;
        documentos.add(new Tecnomechanic(matrix, valueTec,  gasesTec,  dayTec,  monthTec,  yearTec ,  code)) ;
            message = "Techno added." ;
             return message ;



    }
    public String addCard(double valueOwner, int [][] matrix,int dayOwner, int monthOwner, int yearOwner, String code){
        String message  = "Couldn´t add the owner card"  ;
        documentos.add(new OwnerCard(valueOwner, matrix, dayOwner,  monthOwner,  yearOwner,  code)) ;
            message = "owner card added." ;
             return message ;

    }
    public String confirmationDoc(int todayYear){
        String mensaje = "" ;

        for (int index = 0; index < documentos.size() ; index++) {
            if ( index== 0) {
                if(documentos.get(index).getYear()>todayYear){
                    mensaje += "Soat"+documentos.get(index).getNum()+" Current \n" ;


                }else{
                    mensaje += "Soat"+documentos.get(index).getNum()+" Expired \n" ;

                }
            }
            else if( index== 1){
                if((documentos.get(index).getYear()>todayYear)){
                    mensaje += "Tecno"+documentos.get(index).getNum()+" Current \n" ;

                }else{
                    mensaje += "Tecno"+documentos.get(index).getNum()+" Expired \n" ;

                }
                }
                else if (index== 2){

                if((documentos.get(index).getYear()>todayYear)){
                    mensaje += "owner card"+documentos.get(index).getNum()+" Current \n" ;

                }else{
                    mensaje += "owner card"+documentos.get(index).getNum()+" Expired \n" ;

                }
            }
  
            }
            return mensaje ;

            

            
        }
        public int dateDocument(int aux) {
            int result = 0 ;
            for (int index = 0; index < documentos.size(); index++) {
                if(index== 0){
                    result = documentos.get(index).getYear() ;
                }else if (index == 1){
                    result = documentos.get(index).getYear() ;


                }
            }
            return result ;

            

        }


    }

    



    

