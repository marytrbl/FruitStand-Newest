package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        final Button supplierbtn = findViewById(R.id.supplierbtn);
        final Button customerbtn = findViewById(R.id.customerbtn);
        final Button deliverbtn = findViewById(R.id.delivrbtn);
        final Button fruitbtn = findViewById(R.id.fruitbtn);

        supplierbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(getApplicationContext(), SupplierActivity.class);
                        startActivity(intent1);
                    }
                }
        );

        customerbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(getApplicationContext(), CustomerActivity.class);
                        startActivity(intent2);
                    }
                }
        );
        deliverbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent3 = new Intent(getApplicationContext(), DeliveryActivity.class);
                        startActivity(intent3);
                    }
                }
        );

        fruitbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent4 = new Intent(getApplicationContext(), CustomerActivity.class);
                        startActivity(intent4);
                    }
                }
        );
    }
}
