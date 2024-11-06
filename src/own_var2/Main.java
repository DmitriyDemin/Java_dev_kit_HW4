/*Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
        Табельный номер
        Номер телефона
        Имя
        Стаж
    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавления нового сотрудника в справочник
*/


package own_var2;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker(1, 1, "bob", 1);
        Worker w2 = new Worker(2, 2, "rob", 2);
        Worker w3 = new Worker(3, 3, "lob", 3);
        Worker w4 = new Worker(4, 4, "kob", 4);
//
        EmployeeHandBook e1 = new EmployeeHandBook();
//
        e1.addEmployee(w1);
        e1.addEmployee(w2);
        e1.addEmployee(w3);
        e1.addEmployee(w4);

        System.out.println("справочник сотрудников:");
        e1.toString2();
        System.out.println();
        String requestedName = "bob";
        System.out.printf("поиск номера телефона по имени '%s': номер телефона %d", requestedName, e1.getPhoneNumByName(requestedName));
        System.out.println();
        System.out.println();
        Integer requestedExp = 1;
        System.out.printf("поиск сотрудника по стажу работы '%d': результат ", requestedExp);
        System.out.println(e1.searchByExperience(requestedExp));
        System.out.println();
        System.out.println();
        Integer requestedNum = 3;
        System.out.printf("поиск сотрудника по табельному номеру '%d': результат ", requestedNum);
        System.out.println(e1.searchByEmployeeNum(requestedNum));
        System.out.println();







    }



}
