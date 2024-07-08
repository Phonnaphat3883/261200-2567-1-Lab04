public class HealthRecord {
    int height;
    int weight;
    int age;
    private static final int MIN_ALLOWED_HEIGHT = 5;
    private static final int MAX_ALLOWED_HEIGHT = 300;
    private static final int MIN_ALLOWED_WEIGHT = 10;
    private static final int MAX_ALLOWED_WEIGHT = 200;
    private static final int MAX_ALLOWED_AGE = 100;
    private static final int MIN_ALLOWED_AGE = 1;

    public static int currentMinHeight = 0;
    public static int currentMaxHeight = 0;
    public static int currentMinWeight = 0;
    public static int currentMaxWeight = 0;
    public static int currentMinAge = 0;
    public static int currentMaxAge = 0;

    HealthRecord(int height, int weight, int age){
        if(height < MIN_ALLOWED_HEIGHT || height > MAX_ALLOWED_HEIGHT) {
            this.height = 150;
        } else {
            this.height = height;
            if (height > currentMaxHeight)
                currentMaxHeight = height;
            if (height < currentMinHeight)
                currentMinHeight = height;
        }

        if(weight < MIN_ALLOWED_WEIGHT || weight > MAX_ALLOWED_WEIGHT) {
            this.weight = 60;
        } else {
            this.weight = weight;
            if (weight > currentMaxWeight)
                currentMaxWeight = weight;
            if (weight < currentMinWeight)
                currentMinWeight = weight;
        }

        if(age < MIN_ALLOWED_AGE || age > MAX_ALLOWED_AGE) {
            this.age = 30;
        } else {
            this.age = age;
            if (age > currentMaxAge)
                currentMaxAge = age;
            if (age < currentMinAge)
                currentMinAge = age;
        }

    }



}
