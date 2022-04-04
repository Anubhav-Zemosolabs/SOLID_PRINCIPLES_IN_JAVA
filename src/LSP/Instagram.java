package LSP;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriends() {
        System.out.println("Lets Chat on Instagram");
    }

    @Override
    public void publishPost() {
        System.out.println("Post the pics of last trip on Instagram");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Send me the pics which you have clicked yesterday on Instagram");
    }

    @Override
    public void groupVideoCall() {
        //not applicable for group video calls

    }
}
