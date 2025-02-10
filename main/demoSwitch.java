package main;

public class demoSwitch {
	public static void main(String[]arg){
	String day= "sunday";
    String result = "";
   result= switch(day){
        case "monday" : yield  "6am";
        case "tuesday": yield "7am";
        case "wednesday":yield "8am";
        default : yield "5am";
    };
   System.out.println(result);
   
	}
}
