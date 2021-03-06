package server;

import java.util.Random;

/**
 * ServerData
 *
 * Holds the current data of the server
 *
 * @author Team 7
 * @version 1.0
 */
public class ServerData {

    private int frequency;
    private int max;
    private int min;

    public ServerData() {
        this.frequency = 0;
        this.max = 0;
        this.min = 0;
    }

    public void reset() {
        frequency = 1;
        max = 0;
        min = 0;
    }

    public int[] generateChannelNumbers(int numChannels) {
        int[] channelNumbers = new int[numChannels];

        Random random = new Random();

        for(int i = 0; i < channelNumbers.length; i++) {
            channelNumbers[i] = random.nextInt((max - min) + 1) + min;
        }
        return channelNumbers;
    }

    public int getResponseSeconds() {
        return 1000 / frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        if(frequency <= .001) {
            this.frequency = 1;
        }
        this.frequency = frequency;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
