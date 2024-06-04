public class Main {
    public static void main(String[] args) {
        System.out.println("Задача-1");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = "Ivanov" + " " + "Ivan" + " " + "Ivanovich";
        System.out.print("Ф. И. О. сотрудника — " + fullName);

        System.out.println();
        System.out.println("Задача-2");
        System.out.print("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задача-3");
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "е");
        System.out.print("Данные Ф. И. О. сотрудника — " + fullName2);


    }
}