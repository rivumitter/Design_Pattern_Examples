package bridge;

public class BridgeMain {
    public static void main(String[] args) {

        Video netflixVideo = new NetflixVideo(new U4kVideoProcessor());
        netflixVideo.play("Netflix Compatible U4k File");

        Video primeVideo1 = new PrimeVideo(new HDVideoProcessor());
        primeVideo1.play("Prime Compatible Hrd File");

        Video primeVideo2 = new PrimeVideo(new U4kVideoProcessor());
        primeVideo1.play("Prime Compatible U4k File");
    }
}
