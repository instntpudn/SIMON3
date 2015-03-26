package sjcnyapps.simon;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by keith_000 on 3/25/2015.
 */
public class StartRound {


    public static void startRound(ArrayList<Integer> sequence)
    {
        addToSequence(sequence);
    }

    public static void addToSequence(ArrayList<Integer> sequence)
    {

        int i = generateRandom();

        if ( sequence == null)
        {
            sequence = new ArrayList<Integer>();
            sequence.add(i);
        }
        else
        {
            sequence.add(i);
        }

    }

    public static int generateRandom()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((4) + 1);
        return randomNum;
    }
}
