package OCP;

public class OCPDemo {
    public static void main(String[] args) {
        EmailNotificationService emailNotificationService = new EmailNotificationService();
        MobileNotificationService mobileNotificationService = new MobileNotificationService();
        WhatsappNotificationService whatsappNotificationService = new WhatsappNotificationService();
        emailNotificationService.SendOtp("email");
        mobileNotificationService.SendOtp("mobile");
        whatsappNotificationService.SendOtp("whatsapp");
    }
}
