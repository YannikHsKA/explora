package explora.de.exploramaterial;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Marash on 25.05.2016.
 */
public class CityCardAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] values;

    public CityCardAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.city_card_view_layout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.info_text);

        CardView cardView = (CardView) rowView.findViewById(R.id.card_view);
        cardView.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));

        textView.setText(values[position]);

        return rowView;
    }
}
