package example.dokemonster;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        ImageView imageView = (ImageView)findViewById(R.id.end_bg);

        imageView.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        ActivityCompat.finishAffinity(EndActivity.this);
                    }
                }
        );

    }
}