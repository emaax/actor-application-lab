package com.example.actorapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
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
    Activity context;
    List<Actor> data;
    int layoutID;

    public ActorAdapter(Context context,int layoutID, List<Actor> data){
        super(context, layoutID, data);
        this.context = (Activity) context;
        this.layoutID = layoutID;
        this.data = data;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID,parent, false);
        TextView nameText = (TextView)convertView.findViewById(R.id.actor_name_text_view);
        TextView oscarText = (TextView) convertView.findViewById(R.id.actor_oscars_text_view);
        TextView dob = (TextView) convertView.findViewById(R.id.actor_DOB_text_view);
        nameText.setText(data.get(position).getName());
        oscarText.setText(data.get(position).getOscars() + "");
        dob.setText(data.get(position).getDateOfBirth());
        return convertView;
    }
}
