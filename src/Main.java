public class Main {
    public static void main(String[] args) {
        DeathCauseStatistic test = DeathCauseStatistic.fromCsvFile("A02.1          ,5,-,-,-,-,-,-,-,-,-,-,-,-,1,2,-,1,1,-,-,-");
        System.out.println(test.getDeathCode()+" nie ma tabulacji");
    }
}