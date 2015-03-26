package sjcnyapps.simon;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Ryan on 3/25/2015.
 */
public class HighScoreIO
{
    private static int highScore;
    private static List<Integer> sequence;
    private static final String fileName = "highscore";

    public static void readHighScore(MainActivity mainActivity)
    {
        sequence.clear();

        FileInputStream fis = null;
        StringBuffer sb = new StringBuffer();
        try
        {
            fis = mainActivity.openFileInput(fileName);
            int x = fis.read();
            while(x != -1)
            {
                sb.append((char)x);
                x = fis.read();
            }
            fis.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        StringTokenizer st = new StringTokenizer(sb.toString(), ",");
        while(st.hasMoreTokens())
        {
            int x = Integer.parseInt(st.nextToken());
            sequence.add(x);
        }

        highScore = sequence.size();
    }

    public static void writeHighScore(MainActivity mainActivity, List<Integer> sequence)
    {
        highScore = sequence.size();
        HighScoreIO.sequence = sequence;

        FileOutputStream fos = null;

        StringBuffer sb = new StringBuffer();
        for(int i : sequence)
        {
            sb.append(i + ",");
        }
        sb.deleteCharAt(sb.length() - 1);

        try
        {
            fos = mainActivity.openFileOutput(fileName, Context.MODE_PRIVATE);
            fos.write(sb.toString().getBytes("UTF-8"));
            fos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void playHighScoreSequence(MainActivity mainActivity)
    {
        new AsyncSequencePlayer(mainActivity).execute(sequence);
    }

    public static int getHighScore()
    {
        return highScore;
    }
}
