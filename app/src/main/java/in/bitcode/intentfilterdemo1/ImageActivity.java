package in.bitcode.intentfilterdemo1;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {

    private ImageView mImg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mImg = new ImageView(this);
        //mImg.setImageURI( Uri.parse( getIntent().getStringExtra("path") ) );
        mImg.setImageURI( getIntent().getData() );
        setContentView(mImg);
    }
}
