package ctec.aboutmeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

public class StuffAboutMeActivity extends AppCompatActivity {
//Put pictures into drawable folder to upload them
//Create a Sepperate ImageView for each
    private Button randomFactsButton;
    private Button acomplishmentsButton;
    private Button myGoalsButton;
    private Button scotlandButton;
    private Button dreamJobButton;
    private Button exitButton;
    private TextView aboutMeText;
    private ImageView aboutMeImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff_about_me);

        randomFactsButton = (Button) findViewById(R.id.RandomFactsButton);
        acomplishmentsButton = (Button) findViewById(R.id.AcomplishmentsButton);
        myGoalsButton = (Button) findViewById(R.id.MyGoalsButton);
        scotlandButton = (Button) findViewById(R.id.ScotlandButton);
        dreamJobButton = (Button) findViewById(R.id.DreamJobButton);
        exitButton = (Button) findViewById(R.id.ExitButton);
        aboutMeText = (TextView) findViewById(R.id.ButtonDependentText);
        aboutMeImage = (ImageView) findViewById(R.id.aboutMeImage);

        setupListeners();
    }

private void setupListeners()
{
    randomFactsButton.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View buttonView)
        {
            changeRandomFacts();
        }
    });
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stuff_about_me, menu);
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
    private void changeRandomFacts()
    {
        //image.setVisibility(View.GONE /OR VISIBLE)
        aboutMeText.setText(R.string.random_facts);
    }


}


