public class Main {
    public static void main(String[] args) {
        //Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("первый боксёр " + boxer1);
        System.out.println("Boxer 2: " + boxer2);

        var wholeWeight = boxer1 + boxer2;
        System.out.println("Общий вес: "+ wholeWeight);

        var boxerDifference = boxer2 % boxer1;
        System.out.println("Weight difference: " + boxerDifference);

        var totalWorkHour = 640;
        var oneEmployeeWorkHours = 8;
        var totalWorkers = totalWorkHour / oneEmployeeWorkHours;
        System.out.println(totalWorkers);

        var totalHoursForMoreWorkers = (totalWorkers + 94) * oneEmployeeWorkHours;
        System.out.println("Столько часов нужно поделить между сотрудниками " + totalHoursForMoreWorkers);
    }
}