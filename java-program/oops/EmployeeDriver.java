public class EmployeeDriver {
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.setSalary(100000);
        e1.setEmpId(101);
        e1.setEmpName("karan verma");
        System.out.println("Employee name : "+e1.getEmpName());
        System.out.println("Employee id : "+e1.getEmpId());
        System.out.println("Employee salary : "+e1.getSalary());
        System.out.println("_____________________________________");

        e2.setSalary(250000);
        e2.setEmpId(102);
        e2.setEmpName("Arjun verma");
        System.out.println("Employee name : "+e2.getEmpName());
        System.out.println("Employee id : "+e2.getEmpId());
        System.out.println("Employee salary : "+e2.getSalary());
        System.out.println("_____________________________________");

        e3.setSalary(500000);
        e3.setEmpId(103);
        e3.setEmpName("Harsh pal");
        System.out.println("Employee name : "+e3.getEmpName());
        System.out.println("Employee id : "+e3.getEmpId());  
        System.out.println("Employee salary : "+e3.getSalary());
        System.out.println("_____________________________________");

        e4.setSalary(50000);
        e4.setEmpId(104);
        e4.setEmpName("Kailash Kumar");
        System.out.println("Employee name : "+e4.getEmpName());
        System.out.println("Employee id : "+e4.getEmpId());
        System.out.println("Employee salary : "+e4.getSalary());
        System.out.println("_____________________________________");

        e5.setSalary(100000);
        e5.setEmpId(105);
        e5.setEmpName("Sunny");
        System.out.println("Employee name : "+e5.getEmpName());
        System.out.println("Employee id : "+e5.getEmpId());
        System.out.println("Employee salary : "+e5.getSalary());

    }
}
