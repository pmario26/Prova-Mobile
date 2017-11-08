package br.com.example.testfinder.add_address;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.example.testfinder.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddAddressActivity extends AppCompatActivity {

    //TextView edtAddress;
    //Button btnAdd;

    //Questão 2: Binding das variavies do xml
    @BindView(R.id.edt_address) TextView edtAddress;
    @BindView(R.id.btn_add) Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        //Questão 2: Binding da xml
        ButterKnife.bind(this);


    }

    //Bind para click do btn_add
    @OnClick(R.id.btn_add)
    public void addAddress(){
        if(!AddAddresPresenter.checaString(edtAddress.getText().toString(),this.getApplicationContext())) {
        }
        //retorna o endereço para a MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("movie_name", edtAddress.getText().toString());
        setResult(Activity.RESULT_OK, resultIntent);
        finish();

    }

}