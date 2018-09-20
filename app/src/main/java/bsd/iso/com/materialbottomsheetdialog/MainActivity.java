package bsd.iso.com.materialbottomsheetdialog;


import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //TODO set id & onClickListener para los demas botones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnStyleOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarSBDialog(R.layout.modal_bs_one);
            }
        });


        findViewById(R.id.btnStyleTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    lanzarSBDialog(R.layout.modal_bs_two);
            }
        });
    }

    private void lanzarSBDialog(int layoutStyle) {
        BottomSheetDialogFragment bottomSheetDialogFragment = new ModalBottomSheet(layoutStyle);
        //si esta en FALSE obliga al usuario a pulsar un boton
        //bottomSheetDialogFragment.setCancelable(false);
        bottomSheetDialogFragment.setShowsDialog(true);
        bottomSheetDialogFragment.show(getSupportFragmentManager(), bottomSheetDialogFragment.getTag());
    }
}
