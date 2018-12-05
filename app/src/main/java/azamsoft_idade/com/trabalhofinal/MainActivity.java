package azamsoft_idade.com.trabalhofinal;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        Uri uri  = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.natureza);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}
