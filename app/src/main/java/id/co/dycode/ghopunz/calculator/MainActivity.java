package id.co.dycode.ghopunz.calculator;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ghopunz on 03/12/2016.
 */

public class MainActivity extends AppCompatActivity {

    //cara baru
    @BindView(R.id.input1)
    EditText input1;
    @BindView(R.id.input2)
    EditText input2;
    @BindView(R.id.btn_add)
    Button btnAdd;
    @BindView(R.id.btn_minus)
    Button btnMinus;
    @BindView(R.id.btn_devided)
    Button btnDevided;
    @BindView(R.id.btn_multiple)
    Button btnMultiple;
    @BindView(R.id.hasil)
    TextView hasil;
    @BindView(R.id.btn_modulus)
    Button btnModulus;


    private boolean showToast = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        EditText input1 = (EditText)findViewById(R.id.input1);
//        EditText input2 = (EditText)findViewById(R.id.input2);

        //don't forget to binding!!
        ButterKnife.bind(this);
        input1.setText("0");
        input2.setText("0");

//        Toast.makeText(this, "ini onCreate", Toast.LENGTH_SHORT).show();
        //cara lama
//        Button btnAdd = (Button) findViewById(R.id.btn_add);
//        Button btnMinus = (Button) findViewById(R.id.btn_minus);
//        Button btnDevided = (Button) findViewById(R.id.btn_devided);
//        Button btnMultiple = (Button) findViewById(R.id.btn_multiple);
    }



    //buat change orientation
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onResume() {
        super.onResume();

        input1.setText("0");
        input2.setText("0");

        if(showToast){
            Toast.makeText(this, "Selamat datang kembali", Toast.LENGTH_SHORT).show();
        }

        showToast = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        input1.setText("");
        input2.setText("");
    }

    @OnClick({R.id.btn_add, R.id.btn_minus, R.id.btn_devided, R.id.btn_multiple,
            R.id.btn_modulus})
    public void onClick(View view) {

        try {

            int inputInt1 = Integer.parseInt(input1.getText().toString());
            int inputInt2 = Integer.parseInt(input2.getText().toString());

            switch (view.getId()) {

                //penjumlahan
                case R.id.btn_add:
                    hasil.setText("" + (inputInt1 + inputInt2));
//

                    break;

                //pengurangan
                case R.id.btn_minus:
                    hasil.setText("" + (inputInt1 - inputInt2));

                    break;

                //pembagian
                case R.id.btn_devided:

                    try{
                        hasil.setText("" + (inputInt1 / inputInt2)); 
                    }catch (Exception e){
                        Toast.makeText(this, "Hasil tidak terdifinisikan", Toast.LENGTH_SHORT).show();
                    }
                    

                    break;

                //perkalian
                case R.id.btn_multiple:

                    hasil.setText("" + (inputInt1 * inputInt2));

                    break;

                //sisa bagi
                case R.id.btn_modulus:
                    try{
                        hasil.setText("" + (inputInt1 % inputInt2));
                    }catch (Exception e){
                        Toast.makeText(this, "Hasil tidak terdifinisikan", Toast.LENGTH_SHORT).show();
                    }

                    break;


            }
        }
        //cek jika inputan kosong
        catch (NumberFormatException e) {
            Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }


    }


}
