public class Date {
    public static void main(String[] args) {
        //chapter 2 exercise. step 2
       String day = "Monday";
       int date = 23;
       String month = "September";
       int year = 2019;

        //step 3
       System.out.println(day);
       System.out.println(date);
       System.out.println(month);
       System.out.println(year +"\n");

        // step 4
        System.out.println(day + ", " + month + " " + date + ", " + year + "\n");

        // step 5
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);


    }
}
