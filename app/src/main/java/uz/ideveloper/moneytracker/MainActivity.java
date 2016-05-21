package uz.ideveloper.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TransactionAdapter transactionAdapter;
    List<Transaction> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Transaction> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(this, adapterData);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(transactionAdapter);
    }

    private List<Transaction> getDataList() {
        data.add(new Transaction("TelePhone", "2000"));
        data.add(new Transaction("T-Shorts", "300"));
        data.add(new Transaction("Jeans", "2000"));
        return data;
    }
}

