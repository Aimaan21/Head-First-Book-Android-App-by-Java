package com.example.headfirstandroidapp;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;


public class CheezMenu extends AppCompatActivity  {

    private ShareActionProvider shareActionProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheez_menu);

        ////SETTING TOOLBAR:
        Toolbar toolbar=(Toolbar) findViewById(R.id.cheezMenuToolBar);
        setSupportActionBar(toolbar);
        /////We need to use setSupportActionBar(), as we’re
        /////using the toolbar from the Support Library.


        ///ADDING UP BUTTON AT THE TOOLBAR:
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        ///for adding up button to get back to main activity we need to :
        ///1. setting parentActivity in Menufest.here chapterSevenActivity is the parent for cheezMenu activity
        ///2.we will have to use two above methods

     ///This is working for swipping right for different Category.
      SectionsPagerAdapter pagerAdapter=new SectionsPagerAdapter(getSupportFragmentManager());
      ViewPager pager = (ViewPager) findViewById(R.id.pager);
      pager.setAdapter(pagerAdapter);

        //TabLayout tabLayout1=(TabLayout) findViewById(R.id.tab);
        //tabLayout1.setupWithViewPager(pager);

        TabLayout tabLayout=(TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

    }


    ////Implementing this method adds any items in
    ////the menu resource file to the app bar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //// Inflate the menu.This means that it creates a Menu object. this also adds items to the app bar.
        getMenuInflater().inflate(R.menu.menu,menu);

        ////Creating share content.Basically a default message from the app will be shared with text send type app.
        ////Like :gmail,whatsapp etc
        MenuItem menuItem= menu.findItem(R.id.action_share);
        shareActionProvider =
                (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Want to join me for pizza?");/// this is the default message that will be sent

        return super.onCreateOptionsMenu(menu);
        // All onCreateOptionsMenu() methods generally look like this.
    }

    private void setShareActionIntent(String text) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }


    //At this moment my icon is shown in the app bar but with no action.To make it responsive we will add following method
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_bar_create_order:
                Intent intent = new Intent(this,CheezOrder.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


   ////This class is working to swipe right.For that we need different fragment ("How to add fragment" described in chapter eight)
    ///FragmentPagerAdapter passes the info to ViewPager
    ///we had to add ViewPager in activity_cheez_menu.xml
    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        ///Specify how many pages
        @Override
        public int getCount() {
            return 3;
        }


        ///Specifies which fragment should appear
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new CheezTopFragment();
                case 1:
                    return new CheezPizzaFragment();
                case 2:
                    return new CheezPastaFragment();

            }

            return null;
        }

       public CharSequence getPageTitle(int position) {
           switch (position) {
               case 0:
                   return getResources().getText(R.string.home_tab);
               case 1:
                   return getResources().getText(R.string.pizza_tab);
               case 2:
                   return getResources().getText(R.string.pasta_tab);

           }
           return null;
       }
    }
}
