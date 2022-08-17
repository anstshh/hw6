public class Main {
    public static void main(String[] args) {

        //Задание 1.

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2.

        String firstName1 = "Ivan";
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";
        String fullName1 = firstName1 + " " + middleName1 + " " + lastName1;
        String fullName2 = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        //Задание 3. Через метод "replace" (через split/contains я не знаю как решить, подумаю над этим)

        String firstName2 = " Семён";
        String middleName2 = " Семёнович";
        String lastName2 = " Иванов";
        String fullName3 = firstName2 + " " + middleName2 + " " + lastName2;
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);

        //Задание 4*.

        String lastName4 = "Ivanov";
        String firstName4 = "Ivan";
        String middleName4 = "Ivanovich";
        String fullName4 = lastName4 + " " + firstName4 + " " + middleName4;






















    }
}