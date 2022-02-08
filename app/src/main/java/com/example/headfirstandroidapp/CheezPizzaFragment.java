package com.example.headfirstandroidapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheezPizzaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        ///here we are using a RecyclerView which layout is fragment_cheez_pizza for the recycler adapter(CaptionImageAdapter adapter)
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_cheez_pizza, container, false);

        String [] pizzaNames= new  String[PizzaHelperClass.pizzas.length];
        int [] pizzaImage= new int[PizzaHelperClass.pizzas.length];
        for(int i=0;i<PizzaHelperClass.pizzas.length;i++)
        {
            pizzaNames[i]=PizzaHelperClass.pizzas[i].getName();
        }
        for(int i=0;i<PizzaHelperClass.pizzas.length;i++)
        {
            pizzaImage[i]=PizzaHelperClass.pizzas[i].getImageResourceId();
        }

        CaptionImageAdapter adapter = new CaptionImageAdapter(pizzaNames, pizzaImage);
        pizzaRecycler.setAdapter(adapter);


        ///By the GridLayoutManager we are showing the pizza information in grid view
        ///There are some other Layout manager also like Linear Layout Manager,Staggered Grid Layout manager

        //LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //pizzaRecycler.setLayoutManager(layoutManager);

        //StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //pizzaRecycler.setLayoutManager(layoutManager);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        pizzaRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionImageAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_PIZZA_ID, position);
                getActivity().startActivity(intent);
            }
            });


        return pizzaRecycler;
    }

}
