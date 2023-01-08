public class Email {
    public static void main(String[] args) {
        EmailApp emailApp = new EmailApp("akib", "nawaz","mic.com");
        emailApp.setPassword("nawaz2#$@");
        System.out.println(emailApp.getPassword());
        System.out.println(emailApp.showInfo());

    }
}
