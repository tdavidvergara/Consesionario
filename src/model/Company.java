package model;
import java.util.ArrayList ;

public class Company {
    //relacion
    private String name ;
    private ArrayList<Vehicle> vehiculos ;
    public Company(String name) {
        vehiculos= new ArrayList<Vehicle>() ;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String registerSoat(double valueSoat, int [][]matrix, double  damageSoat,int  daySoat, int monthSoat, int yearSoat, String placa ){
            String message="";
            boolean flag = true ;
            for (int i=0;i<matrix.length;i++){
                message+=matrix[i][0];
            }
            for (int j=1;j<matrix.length;j++){
                message+=matrix[matrix.length-1][j];
            }
            for (int index = 0; index < vehiculos.size() && flag !=false ; index++){
                if(vehiculos.get(index).getPlaca().equals(placa)){
                    message = vehiculos.get(index).addSoat(valueSoat, matrix,  damageSoat,  daySoat, monthSoat,  yearSoat,message) ;
                    

                }
            }
            return message ;
            

    }
    public String registerTec( int [][] matrix,double valueTec, double gasesTec, int dayTec, int monthTec, int yearTec, String placa) {
        String message = "" ;
        boolean flag = true ;
        for (int i=0;i<matrix.length;i++){
            message+=matrix[0][i];
        }
        
        for (int x=1;x<matrix.length;x++){
            for(int y=0;y<matrix.length;y++){
                if(y+x==matrix.length-1){
                 message+=matrix[x][y];
                }
                
            }
        }
        for (int a=1;a<matrix.length;a++){
            message+=matrix[matrix.length-1][a];
        }
        for (int index = 0; index < vehiculos.size() && flag !=false ; index++){
            if(vehiculos.get(index).getPlaca().equals(placa)){
                message = vehiculos.get(index).addTec( matrix, valueTec,  gasesTec,  dayTec,  monthTec,  yearTec,  message) ; 

            }
        }
        
        return message;
    }
    public String registerCard(double valueOwner,int [][] matrix ,int dayOwner,int monthOwner,int yearOwner, String  placa) {
        boolean flag = true  ;
            String message="";
            for (int i=matrix.length-1;i>=0;i--){
                for (int j=matrix.length-1;j>=0;j--){
                    if((i+j)%2==0){
                        message+=matrix[i][j];
                    }
                }
            }
            for (int index = 0; index < vehiculos.size() && flag !=false ; index++){
                if(vehiculos.get(index).getPlaca().equals(placa)){
                    message = vehiculos.get(index).addCard( valueOwner, matrix,  dayOwner, monthOwner, yearOwner, message) ; 
    
                }
            }
    
            return message;
        
        
    }


    public boolean existeVehicle(String placa){
        boolean flag = true ;
        for (int index = 0; index < vehiculos.size() && flag !=false ; index++) {
            if(vehiculos.get(index).equals(placa)){
                flag = false ;
            }
        }
        return flag ;
    }
    public String addVehicleG(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
    int kilometer, String placa, int numDoors, String polarized, int option, double gasolineCapacityG,
    double gasolineConsumeG, int optionGasoline, int[][] matrix, double valueSoat, double damageSoat, int daySoat, int monthSoat, int yearSoat, double valueTec, double gasesTec,int dayTec,int monthTec,int yearTec,double valueOwner, int  dayOwner, int monthOwner,int yearOwner){
        boolean flag = existeVehicle(placa) ;
        String message = "Couldn't add a Vehicle";
        if(flag == true){
            vehiculos.add(new Gasoline( alreadyUsed,  basePrice,  sellPrice,  mark,   cilinderCapacity, kilometer,  placa,  numDoors,  polarized,  option,  gasolineCapacityG,
             gasolineConsumeG)) ;
            message = "A car that implements gasoline was added." ;
            message += registerSoat(valueSoat,matrix,  damageSoat,  daySoat, monthSoat,  yearSoat, placa) ;
            message += registerTec(matrix, valueTec, gasesTec, dayTec, monthTec, yearTec,placa)  ;
            message += registerCard(valueOwner, matrix, dayOwner, monthOwner, yearOwner, placa) ;

        }else{
            message = "Couldn't add a Vehicle... This vehicle already exists" ;
        }         
        return message ;
    }
    public String addVehicleM(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
    int kilometer, String placa, double gasolineCapacity, double gasolineConsume, int optionMoto,int [][] matrix, double valueSoat, double damageSoat, int daySoat, int monthSoat,int yearSoat, double valueTec, double gasesTec, int dayTec,int monthTec, int yearTec, double valueOwner, int dayOwner, int monthOwner,int yearOwner){
        String message = "Couldn't add a Vehicle";
        Boolean respuesta = existeVehicle(placa) ;
        if (respuesta == true){
            vehiculos.add(new Motorcycle( alreadyUsed,  basePrice,  sellPrice,  mark,  cilinderCapacity,
             kilometer,  placa,  gasolineCapacity,  gasolineConsume,  optionMoto)) ;
            message = "A motorbike was added" ; 
            message += registerSoat(valueSoat,matrix,  damageSoat,  daySoat, monthSoat,  yearSoat, placa) ;
            message += registerTec(matrix, valueTec, gasesTec, dayTec, monthTec, yearTec,placa)  ;
            message += registerCard(valueOwner, matrix, dayOwner, monthOwner, yearOwner, placa) ;
        }else{
            message = "Couldn't add a Vehicle... This vehicle already exists";
        }
        return message ;
    }
    public String addVehicleH(String alreadyUsed, double basePrice, double sellPrice, String mark,double  cilinderCapacity, int kilometer, String placa, int numDoors,String polarized, int option,
    double gasolineCapacityG, double gasolineConsumeG, int optionGasoline,  double gasolineCapacityH, double gasolineConsumeH, double battery,  double batteryConsume, int optionCargador, int optionGasolina, int [][]matrix, double valueSoat,  
    double damageSoat, int daySoat, int monthSoat, int yearSoat,double valueTec, double gasesTec,int dayTec,int monthTec,int yearTec,double valueOwner,int dayOwner, int  monthOwner, int yearOwner){
        boolean flag = existeVehicle(placa) ;
        String message = "Couldn't add a Vehicle";
            if(flag == true) {
                vehiculos.add(new Hybrid( alreadyUsed,  basePrice,  sellPrice,  mark,   cilinderCapacity, kilometer,  placa,  numDoors,  polarized,  option,
      gasolineCapacityG,  gasolineConsumeG,  optionGasoline,  gasolineCapacityH,  gasolineConsumeH,  battery,  batteryConsume,  optionCargador,  optionGasolina)) ;
                 message = "A Hybrid car was added" ; 
                 message += registerSoat(valueSoat,matrix,  damageSoat,  daySoat, monthSoat,  yearSoat, placa) ;
                 message += registerTec(matrix, valueTec, gasesTec, dayTec, monthTec, yearTec,placa)  ;
                 message += registerCard(valueOwner, matrix, dayOwner, monthOwner, yearOwner, placa) ;
            }else{
                message = "Couldn't add a Vehicle... This vehicle already exists" ;
            }
        return message ;
    }
    public String addVeicleE(String alreadyUsed, double basePrice, double sellPrice, String mark, double cilinderCapacity,
    int kilometer, String placa, int numDoors, String polarized , int option,  double batteryConsume, double batteryDuration, int optionCargador,int [][] matrix, double valueSoat, double damageSoat, int daySoat,int  monthSoat, int yearSoat, 
    double valueTec,double  gasesTec, int dayTec, int monthTec, int yearTec,double valueOwner,int dayOwner,int monthOwner, int yearOwner){
        boolean flag = existeVehicle(placa) ;
        String message = "Couldn't add a Vehicle";
            if(flag == true ){
                vehiculos.add(new Electric(alreadyUsed,  basePrice,  sellPrice,  mark,  cilinderCapacity,
                 kilometer,  placa, numDoors,  polarized ,  option,   batteryConsume,  batteryDuration,  optionCargador)) ;
                 message = "A Electric car was added"  ;
                 message += registerSoat(valueSoat,matrix,  damageSoat,  daySoat, monthSoat,  yearSoat, placa) ;
                 message += registerTec(matrix, valueTec, gasesTec, dayTec, monthTec, yearTec,placa)  ;
                 message += registerCard(valueOwner, matrix, dayOwner, monthOwner, yearOwner, placa) ;
            
        }else {
            message = "Couldn't add a Vehicle... This vehicle already exists" ;

        }
        

        return message ;
    }
    public String showInfo(int option, int option2){
        String message = "There is not a vehicle with those features" ;
        switch (option){
            case 1:
            switch(option2){
                case 1:
                for(int i=0 ; i<vehiculos.size();  i ++){
                    if(vehiculos.get(i) instanceof Gasoline){
                        Gasoline obj =(Gasoline)vehiculos.get(i) ;
                        if(obj.getTipocarro()== TypeCar.SEDAN){
                            message +=obj.toString();
                        }
                    } else if(vehiculos.get(i) instanceof Hybrid){
                        Hybrid obj =(Hybrid)vehiculos.get(i) ;
                        if(obj.getTipocarro()==TypeCar.SEDAN){
                            message += obj.toString()   ; 
                        }

                    }else if(vehiculos.get(i) instanceof Electric){
                        Electric obj =(Electric)vehiculos.get(i) ;
                        if(obj.getTipocarro()==TypeCar.SEDAN){
                            message += obj.toString() ;
                        }
                    }
                }
                break;
                case 2:
                for(int i=0 ; i<vehiculos.size();  i ++){
                    if(vehiculos.get(i) instanceof Gasoline){
                        Gasoline obj =(Gasoline)vehiculos.get(i) ;
                        if(obj.getTipocarro()== TypeCar.PICKUPTRUCK){
                            message +=obj.toString();
                        }
                    } else if(vehiculos.get(i) instanceof Hybrid){
                        Hybrid obj =(Hybrid)vehiculos.get(i) ;
                        if(obj.getTipocarro()==TypeCar.PICKUPTRUCK){
                            message += obj.toString()   ; 
                        }
    
                    }else if(vehiculos.get(i) instanceof Electric){
                        Electric obj =(Electric)vehiculos.get(i) ;
                        if(obj.getTipocarro()==TypeCar.PICKUPTRUCK){
                            message += obj.toString()   ;
                    
                }
                break ;
            }
        }
            break ;
    }
        
        
        case 2:
        switch(option2){
            case 1: 
            for(int i=0 ; i<vehiculos.size();  i ++){

                if (vehiculos.get(i) instanceof Electric){
                Electric obj = (Electric)vehiculos.get(i) ;
                if(obj.getAlreadyUsed().equalsIgnoreCase("SI")){
                    message += obj.toString()   ;
                }
                }else if (vehiculos.get(i) instanceof Hybrid){
                    Hybrid obj = (Hybrid)vehiculos.get(i) ;
                    if(obj.getAlreadyUsed().equalsIgnoreCase("SI")){
                        message += obj.toString()   ;
                }
            }else if (vehiculos.get(i) instanceof Gasoline){
            Gasoline obj = (Gasoline)vehiculos.get(i) ;
            if(obj.getAlreadyUsed().equalsIgnoreCase("SI")){
                message += obj.toString()   ;
            }
            }
              }
            break ; 
            case 2:  // if the option is no
            for(int i=0 ; i<vehiculos.size();  i ++){

                if (vehiculos.get(i) instanceof Electric){
                Electric obj = (Electric)vehiculos.get(i) ;
                if(obj.getAlreadyUsed().equalsIgnoreCase("no")){
                    message += obj.toString()   ;
                }
                }else if (vehiculos.get(i) instanceof Hybrid){
                    Hybrid obj = (Hybrid)vehiculos.get(i) ;
                    if(obj.getAlreadyUsed().equalsIgnoreCase("no")){
                        message += obj.toString()   ;
                }
                }else if (vehiculos.get(i) instanceof Gasoline){
                    Gasoline obj = (Gasoline)vehiculos.get(i) ;
                if(obj.getAlreadyUsed().equalsIgnoreCase("no")){
                message += obj.toString()   ;
            }
                    }
                }
                        break ;
            }
        
         }
        return message;
    }

    public String infoDocument (String placa, int todayYear){
        String mensaje  = ""  ;
        for (int index = 0; index < vehiculos.size() ; index++) {
            if(vehiculos.get(index).getPlaca().equals(placa)){
                mensaje = vehiculos.get(index).confirmationDoc(todayYear) ;
                

            }else{
                mensaje = "The plate doesn´t match, try again" ;
            }
            
        }

        return mensaje ;

    }
    public String calculatePrice(int year, String plate){
        String message = "" ;
        for (int index = 0; index < vehiculos.size() ; index++) {
            if(vehiculos.get(index).getPlaca().equals(plate)){
                if(vehiculos.get(index) instanceof Gasoline){
                    Gasoline obj=(Gasoline)vehiculos.get(index);
                    message = obj.calculatePrice(year, obj.getBasePrice(), obj.getAlreadyUsed())  ;
                    }else if(vehiculos.get(index) instanceof Hybrid){
                        Hybrid obj =(Hybrid)vehiculos.get(index)   ;
                        message =  obj.calculatePrice(year, obj.getBasePrice() , obj.getAlreadyUsed()) ;
                    }else if(vehiculos.get(index) instanceof Electric){
                        Electric obj =(Electric)vehiculos.get(index)   ;
                        message = obj.calculatePrice(year, obj.getBasePrice() , obj.getAlreadyUsed()) ;
                   }else if(vehiculos.get(index) instanceof Motorcycle){
                    Motorcycle obj =(Motorcycle)vehiculos.get(index)   ;
                    message = obj.calculatePrice(year, obj.getBasePrice() , obj.getAlreadyUsed()) ;
                     }
                                  

            }else{
                message = "The plate doesn´t match, try again" ;
            }


        
    }
    return message  ;
 }
}
 
