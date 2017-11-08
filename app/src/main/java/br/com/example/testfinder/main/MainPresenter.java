package br.com.example.testfinder.main;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lucas.assis on 08/11/17.
 */

public class MainPresenter {

    static boolean checaString(int sz ,Context c){
        if(sz  <= 0 ){
            Toast toast = Toast.makeText(c,  "Não há endereços cadastrados", Toast.LENGTH_SHORT);
            toast.show();
            return false;
        }
        return true;

    }
}
