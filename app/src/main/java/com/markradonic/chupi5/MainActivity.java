package com.markradonic.chupi5;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private TextView text = null;
    TextView monTexte = null;
    TextView num = null;

    //private Button touchAndClick = null;
    // On voudra détecter uniquement les clics sur ce bouton
    private ImageButton clickOnlyadd = null;
    private ImageButton clickOnlydelete = null;
    private ImageButton player1 = null;
    private ImageButton player2 = null;
    private ImageButton player3 = null;
    private ImageButton player4 = null;
    private ImageButton player5 = null;
    private ImageButton player6 = null;

    private ImageView player1_overwrite = null;
    private ImageView player2_overwrite = null;
    private ImageView player3_overwrite = null;
    private ImageView player4_overwrite = null;
    private ImageView player5_overwrite = null;
    private ImageView player6_overwrite = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //text = new TextView(this);
        //text.setText(R.string.app_title);
        //setContentView(text);


        //String applicationName = getResources().getString(R.string.app_name);
        // Au lieu d'afficher "My Application" on va afficher "My way !"
        //applicationName = applicationName.replace("5", "tos");
        //text.setText(R.string.app_title);
        //setContentView(text);
        //TextView view = new TextView(this);
        //view.setText(applicationName);

        //setContentView(view);

            setContentView(R.layout.activity_main);

            monTexte = (TextView)findViewById(R.id.text);
            //monTexte.setPadding(10, 10, 70, 90);
            //monTexte.setText("Le texte de notre TextView");
            num = (TextView)findViewById(R.id.num);

            player1 = (ImageButton) findViewById(R.id.player1);
            player2 = (ImageButton) findViewById(R.id.player2);
            player3 = (ImageButton) findViewById(R.id.player3);
            player4 = (ImageButton) findViewById(R.id.player4);
            player5 = (ImageButton) findViewById(R.id.player5);
            player6 = (ImageButton) findViewById(R.id.player6);

            player1_overwrite = (ImageView) findViewById(R.id.player1_overwrite);
            player2_overwrite = (ImageView) findViewById(R.id.player2_overwrite);
            player3_overwrite = (ImageView) findViewById(R.id.player3_overwrite);
            player4_overwrite = (ImageView) findViewById(R.id.player4_overwrite);
            player5_overwrite = (ImageView) findViewById(R.id.player5_overwrite);
            player6_overwrite = (ImageView) findViewById(R.id.player6_overwrite);

            clickOnlyadd = (ImageButton) findViewById(R.id.button_add_user);
            //clickOnly.setPadding(10, 10, 70, 90);
            clickOnlyadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = num.getText().toString();
                float number1 = Float.valueOf(nombre);
                int number = (int)(Math.round(number1));
                if(number >= 6)
                    num.setText(String.valueOf(number));
                    else{
                    number = number + 1;
                    num.setText(String.valueOf(number));
                    switch (number) {
                        case 1:
                            player1.setImageResource(R.drawable.button_profile_mark_image2);
                            player1_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite_present);
                            break;
                        case 2:
                            player2.setImageResource(R.drawable.button_profile_mark_image2);
                            player2_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite_present);
                            break;
                        case 3:
                            player3.setImageResource(R.drawable.button_profile_mark_image2);
                            player3_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite_present);
                            break;
                        case 4:
                            player4.setImageResource(R.drawable.button_profile_mark_image2);
                            player4_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite_present);
                            break;
                        case 5:
                            player5.setImageResource(R.drawable.button_profile_mark_image2);
                            player5_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite_present);
                            break;
                        case 6:
                            player6.setImageResource(R.drawable.button_profile_mark_image2);
                            player6_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite_present);
                            break;
                    }
                    }
                    if(number >= 5)
                        num.setBackgroundColor(Color.parseColor("#00574B"));
                    }
                        // Réagir au clic

            });

        clickOnlydelete = (ImageButton)findViewById(R.id.button_delete_user);
        //clickOnly.setPadding(10, 10, 70, 90);
        clickOnlydelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = num.getText().toString();
                float number1 = Float.valueOf(nombre);
                int number = (int) (Math.round(number1));
                if (number == 0)
                    num.setText(String.valueOf(number));
                else {
                    switch (number) {
                        case 1:
                            player1.setImageResource(R.drawable.button_profile_default_image);
                            player1_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite);
                            break;
                        case 2:
                            player2.setImageResource(R.drawable.button_profile_default_image);
                            player2_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite);
                            break;
                        case 3:
                            player3.setImageResource(R.drawable.button_profile_default_image);
                            player3_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite);
                            break;
                        case 4:
                            player4.setImageResource(R.drawable.button_profile_default_image);
                            player4_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite);
                            break;
                        case 5:
                            player5.setImageResource(R.drawable.button_profile_default_image);
                            player5_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite);
                            break;
                        case 6:
                            player6.setImageResource(R.drawable.button_profile_default_image);
                            player6_overwrite.setBackgroundResource(R.drawable.button_profile_default_overwrite);
                            break;
                    }
                    number = number - 1;
                    num.setText(String.valueOf(number));
                    if (number < 5)
                        num.setBackgroundColor(Color.parseColor("#D81B60"));
                }// Réagir au clic

            }
        });
    }
}
