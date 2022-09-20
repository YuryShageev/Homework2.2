public class Main {
    public static void main(String[] args) {
        //Task 6
        System.out.println("Task 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: "+ (boxer1Weight+boxer2Weight));
        System.out.println("Разница в весе двух бойцов: "+ (boxer2Weight-boxer1Weight));

        //Task 7
        System.out.println("Task 7");
        System.out.println("Разница в весе двух бойцов (1 method): "+ (boxer2Weight - boxer1Weight));
        System.out.println("Разница в весе двух бойцов (2 method): "+ (boxer2Weight % boxer1Weight));

        //Task 8
        System.out.println("Task 8");
        var totalWorkingOurs = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingOurs / hoursPerDay;
        System.out.println("Всего работников в компании - "+ totalWorkingOurs / hoursPerDay + " человек");
        totalEmployees = totalEmployees + 94;
        totalWorkingOurs = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает "+ totalEmployees + " человека, то всего "+ totalWorkingOurs + " часа работы может быть поделено между сотрудниками");
    }
}