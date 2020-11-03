package in.bitcode.intentfilterdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtFilePath;
    private Button mBtnShowImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        setContentView(R.layout.activity_main);

        mBtnShowImage = findViewById(R.id.btnShowImage);
        mEdtFilePath = findViewById(R.id.edtFilePath);

        mBtnShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("in.bitcode.media.image.VIEW");
                intent.putExtra("path", mEdtFilePath.getText().toString());
                startActivity(intent);

            }
        });

    }
}