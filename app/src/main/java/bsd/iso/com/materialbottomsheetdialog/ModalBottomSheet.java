package bsd.iso.com.materialbottomsheetdialog;

import android.app.Dialog;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ModalBottomSheet extends BottomSheetDialogFragment {

    private int layoutStyle;


    public ModalBottomSheet(int layoutStyle) {
        this.layoutStyle = layoutStyle;
    }

    @Override
    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);

        View view = View.inflate(getContext(), this.layoutStyle, null);


        if (this.layoutStyle == R.layout.modal_bs_one) {

            view.findViewById(R.id.btnStyle1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Preview layout 1", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });
        } else if (this.layoutStyle == R.layout.modal_bs_two) {

            view.findViewById(R.id.btnStyle2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Preview layout 2", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });
        }

        dialog.setContentView(view);

    }


}
