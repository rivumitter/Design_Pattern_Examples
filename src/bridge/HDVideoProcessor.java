package bridge;

public class HDVideoProcessor implements VideoProcessor{
    @Override
    public void process(String fileName) {
        System.out.println("Playing: "+fileName);
    }
}
