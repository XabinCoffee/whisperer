package rxabin.eu.whisperer;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IntroActivity extends MaterialIntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
}
