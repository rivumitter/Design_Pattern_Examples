package bridge;

public class NetflixVideo extends Video {


    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFileName) {
        super.getVideoProcessor().process(videoFileName);
    }
}
