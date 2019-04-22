package com.example.planow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListsActivity extends Activity {



    public Button todolist, shoplist, trawellist, wishlist;


    public void gotodo(){
        todolist = (Button)findViewById(R.id.todolist);
        todolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent todo = new Intent(ListsActivity.this, ToDoList.class);

                startActivity(todo);
            }
        });
    }

    public void gototrawel(){
        trawellist = (Button)findViewById(R.id.trawellist);
        trawellist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent totrawel = new Intent(ListsActivity.this, TrawelList.class);

                startActivity(totrawel);
            }
        });
    }

    public void gotoshop(){
        shoplist = (Button)findViewById(R.id.shoplist);
        shoplist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toshop = new Intent(ListsActivity.this, ShopList.class);

                startActivity(toshop);
            }
        });
    }

    public void gotowish(){
        wishlist = (Button)findViewById(R.id.wishlist);
        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent towish = new Intent(ListsActivity.this, WishList.class);

                startActivity(towish);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        gotodo();
        gototrawel();
        gotoshop();
        gotowish();



    }
}
