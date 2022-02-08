package com.example.headfirstandroidapp;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class CaptionImageAdapter extends RecyclerView.Adapter<CaptionImageAdapter.ViewHolder> {

    ///Basically this is a adapter class.We have created a this class because
    ///this is not ArrayAdapter.This is RecyclerAdapter which ia a bit more complex then ArrayAdapter
    ///Because it gives more flexible view than list but its setting  up is a bit complex
    ///as it doesn't use any built in array adapter like list.We have to create like this class

    ///Also in this class,we are using ViewHolder to get the customized card view(captioned_card_image.xml) for each pizza
    ///So the ViewHolder will hold the view.

   ///Creating "card_captioned_image.xml" :highlighting layout, click : file -> new -> Layout Resource File

    private String[] captions;///this will hold the name
    private int[] imageIds;   ///this will hold the image id(int) from drawable resource file
    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

    public CaptionImageAdapter(String[] captions, int[] imageIds){
        this.captions = captions;
        this.imageIds = imageIds;
    }

    ///We have created a class viewholder(not built in) and extended it RecyclerView.ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;


        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }

    }

    ///Total dataItem.Which means total pizza number
    @Override
    public int getItemCount(){
        return captions.length;
    }

    ///Basically when the ViewHolder Class will be created this method will be called and it will initialize the layout(card_captioned_image) of ViewHolder
    // (here our ViewHolder is Card View type )
    public CaptionImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cv);
    }

    public void setListener(Listener listener){
        this.listener = listener;
    }

    ///This mathod is being use to show the data in the CardView through viewholder
    @Override
    public void onBindViewHolder(ViewHolder holder,final int position){
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView)cardView.findViewById(R.id.info_name);
        textView.setText(captions[position]);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (listener != null) {

                    listener.onClick(position);
                }
            }
        });

    }

    }





