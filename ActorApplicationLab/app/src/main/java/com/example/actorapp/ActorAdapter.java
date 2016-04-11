package com.example.actorapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by hollis on 4/11/16.
 */
public class ActorAdapter extends ArrayAdapter<Actor> {
    Context context;
    List<Actor> data;
    int layoutID;

    public ActorAdapter(Context context,int layoutID, List<Actor> data){
        super(context, layoutID, data);
        this.context = context;
        this.layoutID = layoutID;
        this.data = data;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView nameText = (TextView)convertView.findViewById(R.id.actor_name_text_view);
        TextView oscarText = (TextView) convertView.findViewsWithText(R.id.actor_oscars_text_view);
        TextView dob = (TextView) convertView.findViewById(R.id.actors_DOB_text_view);
        nameText.setText(data.get(position).getName());
        oscarText.setText(data.get(position).getOscars());
        dob.setText(data.get(position).getDateOfBirth());
        return convertView;
    }
}
