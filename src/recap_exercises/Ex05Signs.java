package recap_exercises;

import java.util.Random;

public enum Ex05Signs {
    ROCK, PAPER, SCISSORS;

    public static Ex05Signs getRandomSign(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
