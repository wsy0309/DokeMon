package example.dokemonster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView imageView = (ImageView)findViewById(R.id.start_image);
        imageView.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //PlayActivity로 가는 인텐트를 생성
                        Intent intent = new Intent(StartActivity.this, example.dokemonster.PlayActivity.class);
                        //액티비티 시작!
                        startActivity(intent);
                    }
                }
        );
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
