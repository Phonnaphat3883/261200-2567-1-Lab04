public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        HealthRecord pt1 = new HealthRecord(174, 65,18);
        HealthRecord pt2 = new HealthRecord(180, 95,20);
        HealthRecord pt3 = new HealthRecord(154, 50,19);
        HealthRecord pt4 = new HealthRecord(300, 500,200);
        HealthRecord pt5 = new HealthRecord(0, 0,0);



        System.out.println(HealthRecord.currentMaxHeight);
        System.out.println(HealthRecord.currentMinHeight);
        System.out.println(HealthRecord.currentMaxWeight);
        System.out.println(HealthRecord.currentMinWeight);
        System.out.println(HealthRecord.currentMaxAge);
        System.out.println(HealthRecord.currentMinAge);


    }
}
