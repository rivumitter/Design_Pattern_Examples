package bridge;

public abstract class Video {

    private final VideoProcessor videoProcessor;

    public Video(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }

    public VideoProcessor getVideoProcessor() {
        return videoProcessor;
    }

    public abstract void play(String videoFileName);

}
