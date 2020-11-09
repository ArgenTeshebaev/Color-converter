package sample;

import java.util.ArrayList;

public class ConverterClass {

    ArrayList<Integer> arr = new ArrayList();
    ArrayList hexArr = new ArrayList();
    private String hexCode = "#";
    private double r;
    private double g;
    private double b;

    public void setR(double r) {
        this.r = r;
    }

    public void setG(double g) {
        this.g = g;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void adder(double value){
        double d = value/16;
        int intPart = (int) d;
        arr.add(intPart);
        double doublePart = d - intPart;
        int next = (int) (doublePart * 16);
        arr.add(next);
    }

    public ArrayList calculation(){
        adder(r);
        adder(g);
        adder(b);
        return arr;
    }

    public void toHex(){
        for(int num : arr){
            switch (num){
                case 0:
                    hexArr.add("0");
                    break;
                case 1:
                    hexArr.add("1");
                    break;
                case 2:
                    hexArr.add("2");
                    break;
                case 3:
                    hexArr.add("3");
                    break;
                case 4:
                    hexArr.add("4");
                    break;
                case 5:
                    hexArr.add("5");
                    break;
                case 6:
                    hexArr.add("6");
                    break;
                case 7:
                    hexArr.add("7");
                    break;
                case 8:
                    hexArr.add("8");
                    break;
                case 9:
                    hexArr.add("9");
                    break;
                case 10:
                    hexArr.add("A");
                    break;
                case 11:
                    hexArr.add("B");
                    break;
                case 12:
                    hexArr.add("C");
                    break;
                case 13:
                    hexArr.add("D");
                    break;
                case 14:
                    hexArr.add("E");
                    break;
                default: hexArr.add("F");
            }
        }
    }

    public String getHexCode(){
        calculation();
        toHex();
        for(Object o : hexArr){
            hexCode = hexCode + o;
        }
        System.out.println(hexCode);
        return hexCode;
    }
}