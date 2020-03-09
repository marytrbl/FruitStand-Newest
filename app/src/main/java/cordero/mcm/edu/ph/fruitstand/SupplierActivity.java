package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SupplierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);

        final EditText supplierID = findViewById(R.id.fruitID);
        final EditText supplierName = findViewById(R.id.fruitname);
        final EditText fruitSupply = findViewById(R.id.fruittype);
        final EditText supplierLoc = findViewById(R.id.fruitprice);
        final Button submitbtn = findViewById(R.id.submitbtn);

        submitbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i  = new Intent(SupplierActivity.this, SummaryActivity.class);
                        i.putExtra("ID", supplierID.getText().toString());
                        i.putExtra("Name", supplierName.getText().toString());
                        i.putExtra("Info1", fruitSupply.getText().toString());
                        i.putExtra("Info2", supplierLoc.getText().toString());
                        i.putExtra("Info3"," ");
                        i.putExtra("Entity", "supplier");

                        startActivity(i);
                    }
                }
        );
    }
}
