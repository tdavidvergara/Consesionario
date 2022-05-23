package model ;
public class OwnerCard extends Document{
        

    public OwnerCard(double valueOwner, int[][] matrix, int dayOwner, int monthOwner, int yearOwner, String code) {
        super(matrix, yearOwner,valueOwner,code);
    }

}