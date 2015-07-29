package tfcgames.guessthedrink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by e2-User on 14.05.2015.
 */
public class SelectLvlActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectlvl);

        final ImageButton imgBtnBackSelectlvl = (ImageButton) findViewById(R.id.imgBtnBackSelectlvl);
        final Button btnLvl1 = (Button) findViewById(R.id.btnLvl1);

        imgBtnBackSelectlvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectLvlActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_right_in, R.anim.slide_right_out);
            }
        });

        btnLvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectLvlActivity.this, GameActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
            }
        });

    }
}
