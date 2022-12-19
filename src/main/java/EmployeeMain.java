public class EmployeeMain {
    public static void main(String[] args) {
        Employee pracownik1 = new Employee();
        pracownik1.setName("JAN KOWALSKI");
        pracownik1.setId(10);
        pracownik1.setCompany("PKS COMPANY");

        System.out.println(pracownik1.toString());

    }
}
