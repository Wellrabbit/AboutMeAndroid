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
    private ImageView randomFactsImageView;
    private ImageView acomplishmentsImageView;
    private ImageView myGoalsImageView;
    private ImageView scotlandImageView;
    private ImageView dreamJobImageView;


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
        randomFactsImageView = (ImageView) findViewById(R.id.randomFactsImage);
        acomplishmentsImageView = (ImageView) findViewById(R.id.acomplishmentsImage);
        myGoalsImageView = (ImageView) findViewById(R.id.myGoalsImage);
        scotlandImageView = (ImageView) findViewById(R.id.ScotlandImage);
        dreamJobImageView = (ImageView) findViewById(R.id.dreamJobImage);


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
    acomplishmentsButton.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View buttonView)
        {
            changeAccomplishments();
        }
    });

    myGoalsButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View buttonView) {
            changeMyGoal();
        }
    });

    scotlandButton.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View buttonView)
        {
            changeScotland();
        }
    });

    dreamJobButton.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View buttonView)
        {
            changeDreamJob();
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
        randomFactsImageView.setVisibility((View.VISIBLE));
        acomplishmentsImageView.setVisibility(View.GONE);
        myGoalsImageView.setVisibility(View.GONE);
        scotlandImageView.setVisibility(View.GONE);
        dreamJobImageView.setVisibility(View.GONE);
        aboutMeText.setText(R.string.random_facts);

    }

    private void changeAccomplishments()
    {
        randomFactsImageView.setVisibility((View.GONE));
        acomplishmentsImageView.setVisibility(View.VISIBLE);
        myGoalsImageView.setVisibility(View.GONE);
        scotlandImageView.setVisibility(View.GONE);
        dreamJobImageView.setVisibility(View.GONE);
        aboutMeText.setText(R.string.accomplishments);
    }

    private void changeMyGoal()
    {
        randomFactsImageView.setVisibility((View.GONE));
        acomplishmentsImageView.setVisibility(View.GONE);
        myGoalsImageView.setVisibility(View.VISIBLE);
        scotlandImageView.setVisibility(View.GONE);
        dreamJobImageView.setVisibility(View.GONE);
        aboutMeText.setText(R.string.my_goal);
    }

    private void changeScotland()
    {
        randomFactsImageView.setVisibility((View.GONE));
        acomplishmentsImageView.setVisibility(View.GONE);
        myGoalsImageView.setVisibility(View.GONE);
        scotlandImageView.setVisibility(View.VISIBLE);
        dreamJobImageView.setVisibility(View.GONE);
        aboutMeText.setText(R.string.scotland);
    }

    private void changeDreamJob()
    {
        randomFactsImageView.setVisibility((View.GONE));
        acomplishmentsImageView.setVisibility(View.GONE);
        myGoalsImageView.setVisibility(View.GONE);
        scotlandImageView.setVisibility(View.GONE);
        dreamJobImageView.setVisibility(View.VISIBLE);
        aboutMeText.setText(R.string.dream_job);
    }

}


