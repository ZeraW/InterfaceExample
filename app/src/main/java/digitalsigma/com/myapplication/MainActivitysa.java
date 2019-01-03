package digitalsigma.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivitysa extends AppCompatActivity {
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysa);

        person = new Person(new Book());






    }
}
