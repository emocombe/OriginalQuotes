package com.ernesternest.originalquotes;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class OriginalQuotesActivity extends AppCompatActivity {
    Toolbar mToolbar;
    public static final String TAG=OriginalQuotesActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.content_original_quotes);



        mToolbar= (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

mFactTextView = (TextView) findViewById(R.id.FacttextView);
        mShowFactButton =(Button) findViewById(R.id.button);
        mRelativeLayout =(RelativeLayout) findViewById(R.id.relativelayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

         String fact =mFactBook.getfact();
         int color =mColorWheel.getcolor();
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(Color.WHITE);
                mShowFactButton.setTextColor(color);

            }
        };
        mShowFactButton.setOnClickListener(listener);
      Log.d(TAG,"were logging in");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id= item.getItemId();

        {
            Toast.makeText(getApplicationContext(),"You select settings options",Toast.LENGTH_LONG).show();
        }
        return true;
    }
}
