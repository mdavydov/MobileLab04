package ua.lpnu.networking;
import android.app.Application;
import com.google.firebase.FirebaseApp;

public class MyApplication extends Application
{
        @Override
        public void onCreate() {
            super.onCreate();
            //SomeSdk.init(this);  // init some SDK, MyApplication is the Context
            //FirebaseApp.initializeApp(this);
        }
}
