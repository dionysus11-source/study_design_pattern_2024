package beat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;

public class BeatModel implements BeatModelInterface, Runnable{
    List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;


    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000/getBPM());
            } catch (Exception e){}
        }
    }

    private void playBeat() {
        clip.setFramePosition(0);
		clip.start();
    }

    @Override
    public void initialize() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    private void notifyBeatObservers() {
        for (int i = 0 ; i < beatObservers.size(); ++i) {
            BeatObserver observer = beatObservers.get(i);
            observer.update();
        }
    }

    private void notifyBPMObservers() {
        for(int i = 0 ; i < bpmObservers.size() ; ++i) {
            BPMObserver observer = bpmObservers.get(i);
            observer.update();
        }
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }

    private void stopBeat() {
        clip.setFramePosition(0);
		clip.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}     
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		} 
    }
}
