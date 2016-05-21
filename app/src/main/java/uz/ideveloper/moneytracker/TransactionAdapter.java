package uz.ideveloper.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 21.05.2016.
 */
public class TransactionAdapter extends ArrayAdapter<Transaction> {
    List<Transaction> transaction;

    public TransactionAdapter(Context context, List<Transaction> transaction) {
        super(context, 0, transaction);
        this.transaction = transaction;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transaction transactions = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView tvName  = (TextView) convertView.findViewById(R.id.name);
        TextView tvSum  = (TextView) convertView.findViewById(R.id.sum);

        tvName.setText(transactions.getName());
        tvSum.setText(transactions.getSum());
        return convertView;
    }
}
