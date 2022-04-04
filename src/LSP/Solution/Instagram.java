package LSP.Solution;

public class Instagram implements SocialVideoCallManager, socialMedia {

    @Override
    public void publishPost() {
        System.out.println("I am posting my last trip photos");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Send me photos ans Videos of last trip");
    }

    @Override
    public void chatWithFriends() {
        System.out.println("Lets Chat with Aman");
    }
}
