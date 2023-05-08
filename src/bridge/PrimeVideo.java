package bridge;

public class PrimeVideo extends Video{

    public PrimeVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFileName) {
        super.getVideoProcessor().process(videoFileName);
    }
}
