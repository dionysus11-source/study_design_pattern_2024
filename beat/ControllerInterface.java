package beat;

public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreseBPM();
    void setBPM(int bpm);
    
}
