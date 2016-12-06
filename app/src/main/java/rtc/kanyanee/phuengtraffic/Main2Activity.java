package rtc.kanyanee.phuengtraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionProvider;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    //Eeplicit
    private ImageView cat1ImageView,cat2ImageView,cat3ImageView,cat4ImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cat1ImageView = (ImageView) findViewById(R.id.imageView);
        cat2ImageView = (ImageView) findViewById(R.id.imageView2);
        cat3ImageView = (ImageView) findViewById(R.id.imageView3);
        cat4ImageView = (ImageView) findViewById(R.id.imageView4);

        cat1ImageView.setOnClickListener(this);
        cat2ImageView.setOnClickListener(this);
        cat3ImageView.setOnClickListener(this);
        cat4ImageView.setOnClickListener(this);

    }
    public void onClick(View v) {

        int i = 0;

        switch (v.getId()) {

            case R.id.imageView:
                i = 0;
                break;
            case R.id.imageView2:
                i = 1;
                break;
            case R.id.imageView3:
                i = 2;
                break;
            case R.id.imageView4:
                i = 3;
                break;
        } //Swith

        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        intent.putExtra("Category", i);
        startActivity(intent);



    }   // onClick







}
