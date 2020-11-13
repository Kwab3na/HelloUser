package org.horizoncolumbus.hs.hellouser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText;
    TextView messageTextView;

    public void displayMessage(View view){
        messageTextView.setText("Hello " + usernameEditText.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        messageTextView = findViewById(R.id.messageTextView);
    }
}