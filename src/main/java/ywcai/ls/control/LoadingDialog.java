package ywcai.ls.control;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import me.drakeet.materialdialog.MaterialDialog;

public class LoadingDialog extends MaterialDialog {
    private TextView tipText;
    private Context context;
    private View view;

    public LoadingDialog(Context _context) {
        super(_context);
        this.context = _context;
        this.setCanceledOnTouchOutside(false);
        this.setBackground(ContextCompat.getDrawable(context, R.drawable.bar_loading));
        view = LayoutInflater.from(context).inflate(R.layout.pop_dialog_loading, null);
        tipText = (TextView) view.findViewById(R.id.pop_loading_tip);
        tipText.setText("Loading...");
        this.setContentView(view);
    }

    public void setLoadingText(String tip) {
        tipText.setText(tip);
    }

    public void setLoadingTextColor(int color) {
        tipText.setTextColor(ContextCompat.getColor(context, color));
    }

    public void setLoadingTextSize(int size) {
        tipText.setTextSize(size);
    }

    public void setViewSize(int w, int h) {
        RelativeLayout.LayoutParams lay = new RelativeLayout.LayoutParams(w, h);
        view.setLayoutParams(lay);
    }
}
