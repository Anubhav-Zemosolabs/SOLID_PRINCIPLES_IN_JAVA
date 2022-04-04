package SRP.solution;

public class NotificationService {
        public void SendOtp(String medium){
            if(medium.equals("email")){
                //sending otp through email
                System.out.println("Sending the otp through email");
            }
            if(medium.equals("mobile")){
                //sending otp through email
                System.out.println("Sending the otp through mobile");
            }

            //not needed to modify the notification service for each and every otp service
        }
}
