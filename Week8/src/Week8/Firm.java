package Week8;

public class Firm {

    // Base class
    static class Employee {
        private String name;
        private String address;
        private String phone;
        protected double payRate;

        public Employee(String eName, String eAddress, String ePhone, double rate) {
            name = eName;
            address = eAddress;
            phone = ePhone;
            payRate = rate;
        }

        public String toString() {
            return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
        }

        public double pay() {
            return payRate;
        }

        public String vacation() {
            return "Standard vacation (2 weeks)";
        }

        public String getName() {
            return name;
        }

        // Polymorphic placeholders
        public void awardBonus(double bonus) {}  // Default does nothing
        public void addHours(int hours) {}       // Default does nothing
    }

    // Executive subclass
    static class Executive extends Employee {
        private double bonus;

        public Executive(String eName, String eAddress, String ePhone, double rate) {
            super(eName, eAddress, ePhone, rate);
            bonus = 0;
        }

        @Override
        public void awardBonus(double execBonus) {
            bonus = execBonus;
        }

        @Override
        public double pay() {
            double payment = super.pay() + bonus;
            bonus = 0;
            return payment;
        }

        @Override
        public String vacation() {
            return "Executive vacation (4 weeks + 1 bonus week)";
        }
    }

    // Hourly subclass
    static class Hourly extends Employee {
        private int hoursWorked;

        public Hourly(String eName, String eAddress, String ePhone, double rate) {
            super(eName, eAddress, ePhone, rate);
            hoursWorked = 0;
        }

        @Override
        public void addHours(int moreHours) {
            hoursWorked += moreHours;
        }

        @Override
        public double pay() {
            double payment = payRate * hoursWorked;
            hoursWorked = 0;
            return payment;
        }

        @Override
        public String vacation() {
            return "Hourly vacation (1 week)";
        }
    }

    // Staff class
    static class Staff {
        private Employee[] staffList;

        public Staff() {
            staffList = new Employee[3];

            staffList[0] = new Executive("Vickky Bajaj", "Lubhu, Lalitpur", "9876543210", 900);
            staffList[0].awardBonus(400); // ✅ No casting!

            staffList[1] = new Hourly("Sachin Maharjan", "Charghare, Kirtipur", "9873216540", 12.50);
            staffList[1].addHours(30);     // ✅ No casting!

            staffList[2] = new Employee("Sanskar Paudel", "Nakhipot, Lalitpur", "9874561230", 500);
        }

        public void payday() {
            for (Employee emp : staffList) {
                System.out.println(emp);
                System.out.println("Paid: $" + emp.pay());
                System.out.println("----------------------------------");
            }
        }

        public void showVacations() {
            for (Employee emp : staffList) {
                System.out.println(emp.getName() + " vacation: " + emp.vacation());
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Staff personnel = new Staff();
        personnel.payday();
        System.out.println("\n--- Vacation Info ---");
        personnel.showVacations();
    }
}