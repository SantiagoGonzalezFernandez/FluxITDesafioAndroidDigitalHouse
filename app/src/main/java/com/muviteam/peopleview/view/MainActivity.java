package com.muviteam.peopleview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import com.muviteam.peopleview.R;
import com.muviteam.peopleview.controller.ControllerUser;
import com.muviteam.peopleview.model.data.User;
import com.muviteam.peopleview.utils.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterUser.ListenerDelAdapter, SearchView.OnQueryTextListener{

    private RecyclerView recyclerViewUsers;
    private AdapterUser adapterUser;
    private ControllerUser controllerUser;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarComponentes();
        reconocerAdaptersYController();
        traerUsers();
        configurarRecyclerView();
        configuroSwipeRefreshLayout();
    }

    private void configuroSwipeRefreshLayout(){
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                traerUsers();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    private void encontrarComponentes() {
        recyclerViewUsers = findViewById(R.id.MainActivity_RecyclerView_Users);
        swipeRefreshLayout = findViewById(R.id.MainActivity_SwipeRefreshLayout_RefrescarRecyclerView);
    }

    private void reconocerAdaptersYController() {
        adapterUser = new AdapterUser(this);
        controllerUser = new ControllerUser();
    }

    private void configurarRecyclerView() {
        recyclerViewUsers.setLayoutManager(new LinearLayoutManager(this, recyclerViewUsers.VERTICAL, false));
        recyclerViewUsers.setAdapter(adapterUser);
    }

    public void traerUsers() {
        controllerUser.traerUser(new ResultListener<List<User>>() {
            @Override
            public void finish(List<User> result) {
                adapterUser.setUserList(result);
                Toast.makeText(MainActivity.this, "EXITO", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void informarUser(User user) {
        Intent intent = new Intent(MainActivity.this, DetalleUserActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(DetalleUserActivity.KEY_USER, user);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_buscador, menu);
        MenuItem item = menu.findItem(R.id.MenuBuscador_Item_Buscador);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);

        searchView.setOnQueryTextListener(this);

        MenuItemCompat.setOnActionExpandListener(item, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                adapterUser.setFilter(adapterUser.getUserList());
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        try{

            List<User>listaFiltrada = filter(adapterUser.getUserList(), newText);
            adapterUser.setFilter(listaFiltrada);
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    private ArrayList<User> filter(List<User> users, String texto){

        ArrayList<User>listaFiltrada = new ArrayList<>();

        try {
            texto = texto.toLowerCase();

            for (User user: listaFiltrada){
                String user2 = user.getLoginDao().getStringUsername().toLowerCase();

                if(user2.contains(texto)){
                    listaFiltrada.add(user);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return listaFiltrada;
    }
}
