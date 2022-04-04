package OCP;

public class EmailNotificationService implements NotificationService{

        @Override
        public void SendOtp(String medium) {
            System.out.println("Sending OTP through Email");
        }

        @Override
        public void SendTransactionReport(String Medium) {

        }
}
