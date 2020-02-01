package com.sayalin.eventhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
   Button btnEventListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=findViewById(R.id.txtNotifier);
        btnEventListener=findViewById(R.id.button2);
        btnEventListener.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
               //txtResult.setText("Event Listener Invoked");
                showEventListener();
                return false;
            }
        });
    }

    private void showEventListener() {
        txtResult.setText("Event Listener Invoked");
    }

    public void showHandler(View view)
    {
        txtResult.setText("Event Handler Executed");
    }
}
