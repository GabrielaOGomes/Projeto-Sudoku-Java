package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Service.EventEnum.CLEAR_SPACE;

public class NotifierService {

    private Map<EventEnum, List<EventListener>>listener = new HashMap<>(){{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventType, final EventListener listener){
        var selectedListeners = this.listener.get(eventType);
        selectedListeners.add(listener);
    }

    public void notify(final EventEnum eventType){
        listener.get(eventType).forEach(l -> l.update(eventType));
    }
}
