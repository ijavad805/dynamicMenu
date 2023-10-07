package apps;

import apps.HowItWork.HowItsWorkApp;
import utility.Menu.IApp;
import utility.Menu.Menu;

public class InitializeApps {
    public InitializeApps(){
        Menu.add(new HowItsWorkApp());
    }
}
