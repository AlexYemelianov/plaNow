package com.example.planow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.AWSStartupHandler;
import com.amazonaws.mobile.client.AWSStartupResult;


public class MainActivity extends AppCompatActivity {

    public Button todolist, shoplist, trawellist, wishlist;


    public void gotodo(){
        todolist = (Button)findViewById(R.id.todolist);
        todolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent todo = new Intent(MainActivity.this, ToDoList.class);

                startActivity(todo);
            }
        });

    }

    public void gototrawel(){
        trawellist = (Button)findViewById(R.id.trawellist);
        trawellist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent totrawel = new Intent(MainActivity.this, TrawelList.class);

                startActivity(totrawel);
            }
        });
    }

    public void gotoshop(){
        shoplist = (Button)findViewById(R.id.shoplist);
        shoplist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toshop = new Intent(MainActivity.this, ShopList.class);

                startActivity(toshop);
            }
        });
    }

    public void gotowish(){
        wishlist = (Button)findViewById(R.id.wishlist);
        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent towish = new Intent(MainActivity.this, WishList.class);

                startActivity(towish);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AWSMobileClient.getInstance().initialize(this, new AWSStartupHandler() {
            @Override
            public void onComplete(AWSStartupResult awsStartupResult) {
                Log.d("YourMainActivity", "AWSMobileClient is instantiated and you are connected to AWS!");
            }
        }).execute();

        gotodo();
        gototrawel();
        gotoshop();
        gotowish();



    }
}
