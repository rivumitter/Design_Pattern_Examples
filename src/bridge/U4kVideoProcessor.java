package bridge;

public class U4kVideoProcessor implements VideoProcessor{
    @Override
    public void process(String fileName) {
        System.out.println("Playing: "+fileName);
    }
}
