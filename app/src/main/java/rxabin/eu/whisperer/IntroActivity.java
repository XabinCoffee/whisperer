package rxabin.eu.whisperer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import rxabin.eu.whisperer.fragment.IntroFragment;

import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFadeAnimation();
        addSlide(IntroFragment.newInstance("a","a"));
        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle("Title");
        sliderPage.setDescription("Subtitle");
        sliderPage.setImageDrawable(R.mipmap.ic_launcher);
        sliderPage.setBgColor(R.color.colorPrimary);
        addSlide(AppIntroFragment.newInstance(sliderPage));
    }
}
