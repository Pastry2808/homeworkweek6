/*
Make your education marksheets and display in console. “BE CREATIVE”
Note: All marks from your marksheets should be store in variables and print them in
console .
 */

public class Question_18 {
    public static void main(String [] args){
        String Institute = "CodeBuster";
        String Name = "Khushbu Patel";
        int Academic_Year = 2014;
        int Roll_No = 2808;
        int English = 90;
        int Hindi = 80;
        int Java = 75;
        int Drawing = 88;
        int Maths = 82;
        int sum = English + Hindi + Java + Drawing + Maths;
        double div = sum / 5d;
        System.out.println("...............................");
        System.out.println("Institue:" + "        "+Institute);
        System.out.println("Name:" + "            "+Name);
        System.out.println("Academic_Year:" + "   "+Academic_Year);
        System.out.println("Roll_No:" + "         "+Roll_No);
        System.out.println("...............................");
        System.out.println("Subject" + "                Marks");
        System.out.println("...............................");
        System.out.println("English" + "                 "+English);
        System.out.println("Hindi" + "                   "+Hindi);
        System.out.println("Java" + "                    "+Java);
        System.out.println("Drawing" + "                 "+Drawing);
        System.out.println("Maths" + "                   "+Maths);
        System.out.println("...............................");
        System.out.println("Total" + "                   "+sum);
        System.out.println("Percentage" + "              "+div);
        System.out.println("...............................");

    }

}
