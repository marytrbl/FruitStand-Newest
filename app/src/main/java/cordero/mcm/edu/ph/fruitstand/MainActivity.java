package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button adminbtn = findViewById(R.id.adminbtn);
        final Button userbtn = findViewById(R.id.userbtn);

        adminbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(getApplicationContext(), ChooseActivity.class);
                        startActivity(intent1);
                    }
                }
        );

        userbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(getApplicationContext(), ChooseActivity.class);
                        startActivity(intent1);
                    }
                }
        );
    }





}
