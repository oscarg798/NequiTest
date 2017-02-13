package co.com.bancolombia.nequi.presentation.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import co.com.bancolombia.nequi.R;

/**
 * Created by oscargallon on 2/13/17.
 */

public class MainButtonItem extends RecyclerView.ViewHolder {

    private final RelativeLayout mRLContainer;

    private final ImageView mIVIcon;

    private final TextView mTVName;

    public MainButtonItem(View itemView) {
        super(itemView);
        mRLContainer = (RelativeLayout) itemView.findViewById(R.id.rl_container);
        mIVIcon = (ImageView) itemView.findViewById(R.id.iv_icon);
        mTVName = (TextView) itemView.findViewById(R.id.tv_name);
    }

    public ImageView getmIVIcon() {
        return mIVIcon;
    }

    public TextView getmTVName() {
        return mTVName;
    }
}
