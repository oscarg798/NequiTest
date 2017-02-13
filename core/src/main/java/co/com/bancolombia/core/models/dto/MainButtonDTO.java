package co.com.bancolombia.core.models.dto;

import android.os.Parcel;
import android.os.Parcelable;

import co.com.bancolombia.core.models.interfaces.IMainButton;

/**
 * Created by oscargallon on 2/13/17.
 */

public class MainButtonDTO implements Parcelable {

    private final String name;

    private final int icon;

    private  IMainButton iMainButton;

    public MainButtonDTO(String name, int icon, IMainButton iMainButton) {
        this.name = name;
        this.icon = icon;
        this.iMainButton = iMainButton;
    }

    protected MainButtonDTO(Parcel in, IMainButton iMainButton) {
        name = in.readString();
        icon = in.readInt();
    }


    protected MainButtonDTO(Parcel in) {
        name = in.readString();
        icon = in.readInt();
    }

    public static final Creator<MainButtonDTO> CREATOR = new Creator<MainButtonDTO>() {
        @Override
        public MainButtonDTO createFromParcel(Parcel in) {
            return new MainButtonDTO(in);
        }

        @Override
        public MainButtonDTO[] newArray(int size) {
            return new MainButtonDTO[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(icon);
    }
}
