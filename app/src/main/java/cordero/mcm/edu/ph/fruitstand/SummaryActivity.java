package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class  SummaryActivity extends AppCompatActivity {

    TextView display, display2, display3, display4, display5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        display = findViewById(R.id.display);
        display2 = findViewById(R.id.display2);
        display3 = findViewById(R.id.display3);
        display4 = findViewById(R.id.display4);
        display5 = findViewById(R.id.display5);


        String id = getIntent().getStringExtra("ID");
        String name = getIntent().getStringExtra("Name");
        String info1 = getIntent().getStringExtra("Info1");
        String info2 = getIntent().getStringExtra("Info2");
        String info3 = getIntent().getStringExtra("Info3");
        String entity = getIntent().getStringExtra("Entity");

        switch (entity) {
            case "fruit":
                    display.setText(id);
                    display2.setText(name);
                    display3.setText(info1);
                    display4.setText(info2);
                    display5.setText(" ");
                break;
            case "customer":
                    display.setText(id);
                    display2.setText(name);
                    display3.setText(info1);
                    display4.setText(info2);
                    break;
        }

    }
}
