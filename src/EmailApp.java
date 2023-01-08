import java.util.Locale;
import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailBoxCapacity = 500;
    private String email;
    private String CompanySuffix;
    private int defaultPasswordLength = 10;


    public EmailApp(String firstName, String lastName, String companySuffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CompanySuffix = companySuffix;
        System.out.println("EMAIL CREATED : " + this.firstName + this.lastName);

        this.department = setDepartment();
        System.out.println("Department : " + this.department);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + this.CompanySuffix;
        System.out.println(email);

        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);
    }


    private String setDepartment() {
        System.out.print("Department Codes\n 1 For Sales\n 2 For Department \n 3 For Accounting \n 0 None");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            case 0:
                return "None";
            default:
                return "invalid Department";
        }
    }

    private String setPassword(int length) {
        String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordset.length());
            password[i] = passwordset.charAt(rand);
        }
        return new String(password);
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String showInfo() {
        return "EmailApp" +
                "Name=" + firstName + " " + lastName + '\n' +
                "CompanyEmail=" + email + '\n' +
                "password=" + password + '\n' +
                "department=" + department + '\n' +
                "alternateEmail=" + alternateEmail + '\n' +
                "mailBoxCapacity=" + mailBoxCapacity + '\n' +
                "CompanySuffix=" + CompanySuffix + '\n'
                ;
    }

}
