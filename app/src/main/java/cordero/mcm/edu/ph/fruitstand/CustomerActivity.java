package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        final EditText customerID = findViewById(R.id.customerid);
        final EditText customerName = findViewById(R.id.customername);
        final EditText customerFruit = findViewById(R.id.customerfruit);
        final EditText customerLoc = findViewById(R.id.customerloc);
        final Button submitbtn = findViewById(R.id.submitbtn3);

        submitbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(CustomerActivity.this, SummaryActivity.class);
                        i.putExtra("ID", customerID.getText().toString());
                        i.putExtra("Name", customerName.getText().toString());
                        i.putExtra("Info1", customerFruit.getText().toString());
                        i.putExtra("Info2", customerLoc.getText().toString());
                        i.putExtra("Info3"," ");
                        i.putExtra("Entity", "customer");
                        startActivity(i);
                    }
                }
        );
    }
}