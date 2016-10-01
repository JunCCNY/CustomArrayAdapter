package com.codingmechanic.customarrayadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mofi on 9/30/16.
 */

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, List<Event> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Event event=getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.event_item, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name_event);
        TextView location = (TextView) convertView.findViewById(R.id.location_event);
        TextView date = (TextView) convertView.findViewById(R.id.date_event);
        ImageView bg = (ImageView) convertView.findViewById(R.id.bg_event);
        name.setText(event.getName());
        location.setText(event.getLocation());
        date.setText(event.getDate());
        bg.setBackgroundResource(event.getBgImage());
        return convertView;
        //return super.getView(position, convertView, parent);
    }
}
