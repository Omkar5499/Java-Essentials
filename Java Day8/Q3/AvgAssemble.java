package Day8.Q3;

public class AvgAssemble {
    public static void main(String[] args) {

        Avengers[] avgs = new Avengers[3];

        System.out.println("Initiative:");
        for (int i=0;i< avgs.length;i++){
            avgs[i] = new Avengers();
            avgs[i].getDetails();
            System.out.println();
        }
        System.out.println("Assemble...");
        for (int i=0;i< avgs.length;i++){
            System.out.println();
            avgs[i].displayDetails();
            System.out.println();
        }

    }
}
