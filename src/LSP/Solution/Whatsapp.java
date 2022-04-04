package LSP.Solution;

public class Whatsapp implements socialMedia, SocialMediaManager{
    @Override
    public void groupVideoCall() {
        System.out.println("Let's get connected on video call");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Send me the photos and Videos of Rani Jharna");
    }

    @Override
    public void chatWithFriends() {
        System.out.println("Lets start chatting on Whatsapp");
    }
}
