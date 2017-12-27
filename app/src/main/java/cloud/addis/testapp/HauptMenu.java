package cloud.addis.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class HauptMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haupt_menu);

        final Button button = findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final ProgressBar progbar = findViewById(R.id.progressBar3);
                int add_value = 10;
                int newprog = progbar.getProgress() + add_value;

                if(newprog <= progbar.getMax()) {
                    progbar.setProgress(newprog);
                } else {
                    progbar.setProgress(0);
                    newprog = progbar.getProgress();
                    button.setText(R.string.HauptMenuButtonText);
                }

                if(newprog + add_value > progbar.getMax()) {
                    button.setText(R.string.HauptMenuButtonResetText);
                }
            }
        });

        final Button button_unterseite = findViewById(R.id.button9);
        button_unterseite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), UnterSeite.class);
                startActivity(i);
            }
        });
    }
}
