package ui;
import java.time.YearMonth;
import java.util.Scanner;
import java.util.Random ;
import model.*;


public class MainCine {
    public static Scanner lector=new Scanner(System.in);
    public static Company company = new Company("yanacona") ;
    public static void main(String[] args) {
        boolean flag = false ;
        //this is the menu
        while(!flag){
            System.out.println("/// THIS IS THE MAIN MENU OF THE COMPANY ///") ;
            System.out.println("[1]Register a vehicle");
            System.out.println("[2]Calculate the total price of a vehicle");
            System.out.println("[3]Generate docuements with the information of the vechicles");
            System.out.println("[4]Documents ");
            System.out.println("[5]Exit ") ;
            int respuesta= lector.nextInt() ;
            lector.nextLine();
            switch(respuesta){
                case 1:addVehicle() ;
                break ;
                case 2:calculatePrice() ;
                break; 
                case 3: deployInfo() ;
                break ;
                case 4:infoDocument(); 
                break;
                case 5:flag = true ;
                System.out.println("Thanks for using the app") ;//this is the end of the app
                break ;

            }

        }
    }
    //this methods allows to register vehicles
    public static void addVehicle(){
        int[][] matrix=new int[4][4];
        Random rand=new Random();
        int maxNumber=99;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=rand.nextInt(maxNumber);
            }
        }
        System.out.println("Enter the value of the SOAT");
        double valueSoat = lector.nextDouble() ;
        lector.nextLine() ;
        System.out.println("Enter the damage coverage");
        double damageSoat = lector.nextDouble() ;
        lector.nextLine() ;
        System.out.println("Enter of the day of expiration");
        int daySoat = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter of the month of expiration");
        int monthSoat = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter of the year of expiration");
        int yearSoat = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter the value of the technomecanic");
        double valueTec = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter the gases that the vehicle expulsed");
        double gasesTec = lector.nextInt() ;
        System.out.println("Enter of the day of expiration");
        int dayTec = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter of the month of expiration");
        int monthTec = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter of the year of expiration");
        int yearTec= lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter the value of the owner card") ;
        double valueOwner = lector.nextDouble() ;
        lector.nextDouble() ;
        System.out.println("Enter the day of expiration of the owner card");
        int dayOwner = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter the month of expiration of the owner card");
        int monthOwner = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("Enter the year of expiration of the owner card");
        int yearOwner = lector.nextInt() ;
        lector.nextLine() ;       
        System.out.println("The vehicle is arleady used: [Yes], [No] ");
        String alreadyUsed = lector.nextLine() ;
        System.out.println("Enter the price of the vehicle: ");
        double basePrice =lector.nextDouble() ;
        lector.nextLine() ;
        System.out.println("Enter the sell Price of the vehicle: ");
        double sellPrice = lector.nextDouble() ;
        lector.nextLine() ;
        System.out.println("Enter the mark of the vehicle: ") ;
        String mark=lector.nextLine() ;
        System.out.println("Enter the cilinder capacity of the vehicle: ");
        double cilinderCapacity = lector.nextDouble();
        System.out.println("Enter the mileage(kilometer) of the vehicle: ");
        int kilometer = lector.nextInt();
        lector.nextLine() ;
        System.out.println("Enter the vehicle license plate");
        String placa = lector.nextLine() ; 
        System.out.println("Enter the type of vehicle you have: [1]Car, [2]Motorcycle") ;
        int decision = lector.nextInt() ;
        switch(decision){
            case 1:
                System.out.println("Enter the numer of doors that the car has: ") ;
                int numDoors= lector.nextInt() ;
                System.out.println("Enter [Yes]/[No] if the car's windows are polarized") ;
                String polarized = lector.nextLine()  ;
                System.out.println("Enter the type of the car you got: [1],Sedan [2]pikcupTruck") ;
                int option=lector.nextInt() ;
                System.out.println("Enter a number if it represents the function of the car: [1], Use Gasoline [2],Is Hybrid, [3]is Electric") ;
                int answerTypeCar= lector.nextInt() ;
                switch(answerTypeCar) {
                    case 1:
                    System.out.println("Enter the gasoline capacity of the car: ") ;
                    double capacityGasoline = lector.nextDouble()  ;
                    double consumeGasoline = capacityGasoline*(cilinderCapacity/150) ;
                    System.out.println("Enter the type of gasoline that your car implements: ") ;
                    int optionGasoline = lector.nextInt()  ; 

                        System.out.println(company.addVehicleG(alreadyUsed,basePrice, sellPrice,  mark,  cilinderCapacity,
                        kilometer,  placa,  numDoors,  polarized, option, capacityGasoline, consumeGasoline, optionGasoline, matrix,  valueSoat,  damageSoat,  daySoat,  monthSoat, yearSoat, valueTec, gasesTec, dayTec, monthTec, yearTec,valueOwner, dayOwner, monthOwner, yearOwner));

                    break ;
                    case 2:
                    System.out.println("Enter the gasoline capacity of the car");
                    double gasolineCapacityH = lector.nextDouble() ; 
                    double gasolineConsumeH = gasolineCapacityH*(cilinderCapacity/180) ;
                    System.out.println("Enter the duration of the battery");
                    double battery = lector.nextDouble() ;
                    System.out.println("Enter the type of charger this car uses[1]Fast, [2]Normal ") ;
                    int optionCargador = lector.nextInt(); 
                    System.out.println("Enter the type of gasoline this car implements") ;
                    int optionGasolina = lector.nextInt(); 
                    double batteryConsume =0.0 ;
                    if(optionCargador == 1){
                        batteryConsume = (battery)*(cilinderCapacity/100) ;

                    }else{
                        batteryConsume = (battery+7)*(cilinderCapacity/200) ;

                    }
                        System.out.println(company.addVehicleH(  alreadyUsed,  basePrice,  sellPrice,  mark,   cilinderCapacity, kilometer,  placa,  numDoors, polarized,  option,
                        gasolineCapacityH,  gasolineConsumeH,  optionGasolina,  gasolineCapacityH,  gasolineConsumeH,  battery,  batteryConsume,  optionCargador,  optionGasolina, matrix,  valueSoat,  damageSoat,  daySoat,  monthSoat, yearSoat, valueTec, gasesTec, dayTec, monthTec, yearTec,valueOwner, dayOwner, monthOwner, yearOwner));

                    
                     //An hybrid car was added
                    break; 
                    case 3:
                    Double batteryConsumeE = 0.0  ;
                    System.out.println("Enter the battery duration");
                    Double batteryDuration = lector.nextDouble() ; 
                    System.out.println("Enter the type of the charger: [1],Fast [2]Normal");
                    int optionCargador2 = lector.nextInt() ;
                    if (optionCargador2 ==1){
                        batteryConsumeE =(batteryDuration+13) *(cilinderCapacity/100) ;
                    } else {
                        batteryConsumeE =(batteryDuration+18) *(cilinderCapacity/100) ;
                    }
                        System.out.println(company.addVeicleE(  alreadyUsed,  basePrice,  sellPrice,  mark,  cilinderCapacity,
                     kilometer,  placa,  numDoors,  polarized ,  option,   batteryConsumeE,  batteryDuration,  optionCargador2, matrix,  valueSoat,  damageSoat,  daySoat,  monthSoat, yearSoat, valueTec, gasesTec, dayTec, monthTec, yearTec,valueOwner, dayOwner, monthOwner, yearOwner));


                        //A electric car was added

                    break ;
                }
                break ;
            case 2:
                System.out.println("Enter the gasoline capacity of the motorbike: ") ;
                double gasolineCapacity =lector.nextInt() ;
                lector.nextLine() ;
                double gasolineConsume = gasolineCapacity*(cilinderCapacity/75) ;
                System.out.println("Enter the type of the motorcycle: [1],Standar [2],Sport [3],Scooter [4]Cross");
                int optionMoto = lector.nextInt()  ;
                System.out.println(company.addVehicleM(alreadyUsed,  basePrice,  sellPrice,  mark,  cilinderCapacity,
                kilometer,  placa,  gasolineCapacity,  gasolineConsume, optionMoto,matrix,  valueSoat,  damageSoat,  daySoat,  monthSoat, yearSoat, valueTec, gasesTec, dayTec, monthTec, yearTec,valueOwner, dayOwner, monthOwner, yearOwner ));


                 // a motorbike was added
                break;
        }
    }
        //this method dispay the whole information
            public static void deployInfo(){
            System.out.println("How'd you like to generate the information: [1]type vehicle [2]new or used, [3]type gasoline");
            int option = lector.nextInt()  ;
            lector.nextLine();
            int optionCar = 0 ;
            switch(option){
                case 1:
                    System.out.println("Enter the type of the car you got: [1],Sedan [2]pikcupTruck");
                    optionCar = lector.nextInt()  ;
                    lector.nextLine();
                    switch(optionCar){ 
                        case 1: 
                        System.out.println(company.showInfo( option,optionCar)) ;
                        break ;
                        case 2:
                        System.out.println(company.showInfo(option, optionCar)) ;
                        break ;
                    }
                    break ;
                case 2:
                    System.out.println("Enter [1]yes, [2]no if the car is already used");
                    optionCar = lector.nextInt() ;
                    lector.nextLine() ;
                    switch(optionCar){
                        case 1 :
                        System.out.println(company.showInfo(option, optionCar)) ;
                        break ;
                        case 2: 
                        System.out.println(company.showInfo(option, optionCar))  ;
                        break ;
                    }
                    break ;
                }
            }
            public static void infoDocument() {
                System.out.println("Enter the plate of the vehicle")  ;
                String plate = lector.nextLine() ;
                System.out.println("Enter todays year") ;
                int todayYear = lector.nextInt(); 
                lector.nextInt() ;
                System.out.println(company.infoDocument(plate, todayYear)) ;

            }
            public static void calculatePrice(){
                System.out.println("Enter the current year") ;
                int year = lector.nextInt()  ;
                lector.nextLine() ;
                System.out.println("Enter the plate of the vehicle")  ;
                String plate = lector.nextLine() ;
                System.out.println(company.calculatePrice( year,  plate));
            }
            public void theParking(int model ,String lisencePlate){
                boolean flag = true;
                int lastVehicle = vehiculos.size()-1;
                if(model==2014){
                    for (int i = 0; i < parking[0].length&&flag != false; i++) {
                        if(parking[i][0]==null){
                            parking[i][0]=vehicles.get(lastVehicle);
                            flag = false;
                        }
                    }
                }else if(model==2013){
                    for (int i = 0; i < parking[0].length&&flag != false; i++) {
                        if(parking[i][1]==null){
                            parking[i][1]=vehicles.get(lastVehicle);
                            flag = false;
                        }
                    }
        
                }else if(model==2012){
                    for (int i = 0; i < parking[0].length&&flag != false; i++) {
                        if(parking[i][2]==null){
                            parking[i][2]=vehicles.get(lastVehicle);
                            flag = false;
                        }
                    }
        
                }else if(model==2011){
                    for (int i = 0; i < parking[0].length&&flag != false; i++) {
                        if(parking[i][3]==null){
                            parking[i][3]=vehicles.get(lastVehicle);
                            flag = false;
                        }
                    }
                }else if(model<2011){
                    for (int i = 0; i < parking[0].length&&flag != false; i++) {
                        if(parking[i][4]==null){
                            parking[i][4]=vehicles.get(lastVehicle);
                            flag = false;
                        }
                    }
                }
            }
        
 
}
