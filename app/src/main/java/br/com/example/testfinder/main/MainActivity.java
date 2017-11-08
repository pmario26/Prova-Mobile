/*
Paulo Lopes 587222
Lucas Serra de Assis 510475
Jorge de Carvalho Kawamura 595136
 */

package br.com.example.testfinder.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.example.testfinder.R;
import br.com.example.testfinder.add_address.AddAddressActivity;
import br.com.example.testfinder.show_addresses.ShowAddressesActivity;
import butterknife.BindView;
import butterknife.OnClick;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final int RC_ADD_ADDRESS = 123;
    //lista de endereços
    private ArrayList<String> lstAddresses = new ArrayList<>();

    //Questão 2: Butterknife pra linkar variaveis do activity_main.xml
    @BindView(R.id.btn_add_address) Button btnAddAddress;
    @BindView(R.id.btn_show_addresses) Button btnShowAddresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    //Questão 2: Butterknife para click


    @OnClick(R.id.btn_add_address)
    public void addAddres(){
        Intent openAddAddressActivity = new Intent(MainActivity.this, AddAddressActivity.class);
        startActivityForResult(openAddAddressActivity, RC_ADD_ADDRESS);

    }
//Questão 2: Butterknife para click
    @OnClick(R.id.btn_show_addresses)
    public void show_Address(){
        if(!MainPresenter.checaString(lstAddresses.size(),this.getApplicationContext())) {
            //abre a ShowAddressActivity enviando a lista de endereços
            Intent openShowAddressActivity = new Intent(MainActivity.this, ShowAddressesActivity.class);
            openShowAddressActivity.putStringArrayListExtra("addresses_list", lstAddresses);
            startActivity(openShowAddressActivity);
        }

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //captura o resultado da tela de cadastro de endereços e adiciona na lista
        if(requestCode == RC_ADD_ADDRESS && resultCode == Activity.RESULT_OK) {
            lstAddresses.add(data.getStringExtra("movie_name"));
        }
    }
}