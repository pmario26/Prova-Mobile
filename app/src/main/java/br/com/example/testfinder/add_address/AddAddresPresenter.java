package br.com.example.testfinder.add_address;

import android.content.Context;
import android.widget.Toast;
/**
 * Created by lucas.assis on 08/11/17.
 */

public class AddAddresPresenter {

    public AddAddresPresenter(){}

    //Metodo para verificar se a string não esta vazia
    static boolean checaString(String s ,Context c){
        if(!s.isEmpty()){
            return true;
        }

        Toast toast = Toast.makeText(c, "Digite o endereço que deseja adicionar", Toast.LENGTH_SHORT);
        toast.show();
        return false;
    }

}
