import java.util.Scanner;

class assignment31_fdz{
    public static void secconvert(int time){
        int hours = time / 3600;int ntime = time % 3600;
        int minutes = ntime / 60;
        int seconds = ntime % 60;
        System.out.println(time + " seconds is equivalent to " + hours +" hours, "+minutes+" minutes, and "+seconds+" seconds.");
    }
    public static void main(String[] args) {
        Scanner timeobj = new Scanner(System.in);
        System.out.print("Enter time (in seconds): ");
        int timein = timeobj.nextInt();
        secconvert(timein);
    }
}

