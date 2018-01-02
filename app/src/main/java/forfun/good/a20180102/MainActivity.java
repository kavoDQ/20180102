package forfun.good.a20180102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn3;
    ToggleButton TB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "測試33", Toast.LENGTH_SHORT).show();

            }

        });

        TB = findViewById(R.id.toggleButton);
        TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TB.isChecked())
                {
                    Toast.makeText(MainActivity.this, "打開了你打開了", Toast.LENGTH_SHORT).show();
                } else
                {
                    Toast.makeText(MainActivity.this, "關閉中關閉中", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void CL1(View v) {
        switch (v.getId()) {
            //也有人用Switch的做法來做
            case R.id.button:
                Toast.makeText(MainActivity.this, "測試一號", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "我是二號", Toast.LENGTH_LONG).show();
                break;
        }

        // Toast.makeText(MainActivity.this,"BABABA",Toast.LENGTH_LONG).show();
    }
    public void CL2(View v)
    {
        if (TB.isChecked())
        {
            Toast.makeText(MainActivity.this, "打開了你打開了", Toast.LENGTH_SHORT).show();
        } else
        {
            Toast.makeText(MainActivity.this, "關閉中關閉中", Toast.LENGTH_SHORT).show();
        }
    }
}




