package LSP.Solution;

public class LSPDemo {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        Whatsapp whatsapp = new Whatsapp();

        instagram.chatWithFriends();
        instagram.sendPhotosAndVideos();
        instagram.publishPost();

        whatsapp.chatWithFriends();
        whatsapp.groupVideoCall();
        whatsapp.sendPhotosAndVideos();
    }
}
