package com.codeveloper.adepterwithcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class Next_activity extends AppCompatActivity {
    ImageButton mBackButton;
    ImageButton mSearchButton;
    MultiAutoCompleteTextView mMultiAutoCompleteTextView;
    String mTitle;
    WebView mWebView;

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain","India","Indonesia","Indiana","America","Australia","Austria","Belfos"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        mWebView = findViewById(R.id.webView);
        mBackButton = findViewById(R.id.backButton);



        final Intent intent=getIntent();
        mTitle=intent.getExtras().getString("Title").toLowerCase();

        createMultiAutoCompleteTextView();

        loadHtml();


        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Yakub","Back Button Pressed");
                finish();
            }
        });

        mMultiAutoCompleteTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_NULL){
                    //do something
                    mTitle = v.getText().toString().toLowerCase();
                    loadHtml();
                    return true;
                }

                return false;
            }
        });






    }

    private void loadHtml(){
        mMultiAutoCompleteTextView.setHint("Currently Selected: "+mTitle);
        mWebView.loadUrl("file:///android_asset/Learn_X_in_Y_Minutes/" + mTitle + ".html");
    }


    private void createMultiAutoCompleteTextView(){


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        mMultiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        mMultiAutoCompleteTextView.setAdapter(adapter);
        mMultiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

}
