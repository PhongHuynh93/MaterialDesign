package dhbk.android.materialdesign_2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import dhbk.android.materialdesign_2.R;

/**
 * Created by huynhducthanhphong on 1/27/16.
 */
public abstract class BaseActivity extends AppCompatActivity{
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null)
        {
            // gán toolbar thành action bar (do action bar là cái có sặn trong activity còn toolbar phải đặt nó trong layout )
            // gán thì ta mới sử dung được hết tính năng của actionbar
            setSupportActionBar(toolbar);
            // getSupportActionBar(): lấy instance của Action Bar

            // setDisplayHomeAsUpEnabled()
            // làm cho App icon và title có thể click được
            // nếu click muốn thực hiện là trở về 1 class nào đó thì ta thêm vào android manifest  android:parentActivityName (takes the parent activity class name)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    protected abstract int getLayoutResource();

    public Toolbar getToolbar() {
        return toolbar;
    }
}
