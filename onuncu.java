

public class onuncu {
    public onuncu() {
    }

    public static void main(String[] args) {
        System.out.println("Alarm Sistemi");
        boolean kapi1 = false;
        boolean kapi2 = false;
        boolean pencere1 = false;
        boolean pencere2 = false;
        boolean alarmTetiklendi = false;
        pencere1 = true;
        alarmTetiklendi = kapi1 || kapi2 || pencere1 || pencere2;
        System.out.println("Alarm tetiklendi mi?" + alarmTetiklendi);
    }
}
