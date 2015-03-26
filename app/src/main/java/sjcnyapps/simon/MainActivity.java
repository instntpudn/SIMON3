package sjcnyapps.simon;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {


    List<Integer> SEQUENCE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameboard);


        final Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                ButtonPress(1);

            }
        });

        final Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                ButtonPress(2);

            }
        });

        final Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                ButtonPress(3);

            }
        });

        final Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                ButtonPress(4);

            }
        });

        final Button restart = (Button) findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                Restart();

            }
        });

        final Button nxtrnd = (Button) findViewById(R.id.nxtrnd);
        nxtrnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                StartRound();

            }
        });

        final Button highscore = (Button) findViewById(R.id.highscore);
        highscore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class );
                startActivity(intent);

                HighScore();

            }
        });









        Intialize();
       StartRound();

    }

    private void Intialize() {
        SEQUENCE =  new ArrayList<Integer>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
