package model;
public abstract class Document {
    //attributes
    private int [][]matrix ;
    private int year ;
    private double price ;
    private String num;
    public Document(int [][] matrix, int year, double price,String code) {
        this.setMatrix(matrix);
        this.year=year;
        this.price=price;
        setNum(code);
    }
    //methods

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int [][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int [][] matrix) {
        this.matrix = matrix;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "" ;
    }


    
}
