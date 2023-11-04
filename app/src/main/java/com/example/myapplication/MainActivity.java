package com.example.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to the button by its ID
        Button myButton = findViewById(R.id.convert);
        RadioButton usd = (RadioButton) findViewById(R.id.usd);
        RadioButton jpy = (RadioButton) findViewById(R.id.jpy);
        RadioButton gbp = (RadioButton) findViewById(R.id.gbp);
        RadioButton cad = (RadioButton) findViewById(R.id.cad);
        RadioButton aed = (RadioButton) findViewById(R.id.aed);
        EditText amount = (EditText) findViewById(R.id.amount);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                Double n = new Double(amount.getText().toString());

                if(usd.isChecked()){
                    n*= 56.57;
                    builder.setTitle("Convert to USD (USA)");
                    builder.setMessage("Converted Amount: " + n.toString() + " PHP");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            amount.setText(null);
                            dialog.dismiss(); // Close the dialog
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else if(jpy.isChecked()){
                    n*= 0.37;
                    builder.setTitle("Convert to JPY (Japan)");
                    builder.setMessage("Converted Amount: " + n.toString() + " PHP");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            amount.setText(null);
                            dialog.dismiss(); // Close the dialog
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else if(gbp.isChecked()){
                    n*= 69.12;
                    builder.setTitle("Convert to GBP (UK)");
                    builder.setMessage("Converted Amount: " + n.toString() + " PHP");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            amount.setText(null);
                            dialog.dismiss(); // Close the dialog
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else if(cad.isChecked()){
                    n*= 40.85;
                    builder.setTitle("Convert to CAD (Canada)");
                    builder.setMessage("Converted Amount: " + n.toString() + " PHP");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            amount.setText(null);
                            dialog.dismiss(); // Close the dialog
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else if(aed.isChecked()){
                    n*= 15.20;
                    builder.setTitle("Convert to AED (UAE)");
                    builder.setMessage("Converted Amount: " + n.toString() + " PHP");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            amount.setText(null);
                            dialog.dismiss(); // Close the dialog
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }


            }
        });
    }
}