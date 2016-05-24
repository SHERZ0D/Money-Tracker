package uz.ideveloper.moneytracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 23.05.2016.
 */
public class TransactionsFrogment extends Fragment {
    private ListView listView;
    private TransactionAdapter transactionAdapter;
    List<Transaction> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.frogment_transaction, container);
        List<Transaction> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(getActivity(), adapterData);

        listView = (ListView) inflate.findViewById(R.id.listView);
        listView.setAdapter(transactionAdapter);

        return inflate;

        // return super.onCreateView(inflater, container, savedInstanceState);
    }

    private List<Transaction> getDataList() {
        data.add(new Transaction("TelePhone", "2000"));
        data.add(new Transaction("T-Shorts", "300"));
        data.add(new Transaction("Jeans", "400"));
        return data;
    }
}
