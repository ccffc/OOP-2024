package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Sound1 extends PApplet {

    Minim m;
    AudioInput ai;
    AudioPlayer ap;
    AudioBuffer b;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        m = new Minim(this);
        ap = m.loadFile("BodyGroove_MixMcVersion.mp3");
        ap.play();
        b = ap.mix;
    }


    float y = 400;

    float lerpedAvg = 0;

    @Override
    public void draw() {
        colorMode(HSB);
        background(0);
        stroke(255);
        
        for(int i = 0 ; i < b.size() ; i ++)
        {
            float hue = map(i, 0, b.size() , 0, 256);
            stroke(hue, 255, 255);
            noFill();
        }

    }

    float lerped = 0;
}
